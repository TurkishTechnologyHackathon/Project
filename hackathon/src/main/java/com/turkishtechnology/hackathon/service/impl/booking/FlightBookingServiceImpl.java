package com.turkishtechnology.hackathon.service.impl.booking;

import java.util.List;
import org.springframework.stereotype.Service;

import com.turkishtechnology.hackathon.exceptions.flights.NoRemainingSeatsException;
import com.turkishtechnology.hackathon.model.entity.Flight;
import com.turkishtechnology.hackathon.model.entity.FlightBooking;
import com.turkishtechnology.hackathon.model.entity.Passanger;
import com.turkishtechnology.hackathon.repository.FlightBookingRepository;
import com.turkishtechnology.hackathon.repository.FlightRepository;
import com.turkishtechnology.hackathon.repository.PassangerRepository;
import com.turkishtechnology.hackathon.service.booking.FlightBookingService;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

    private final FlightBookingRepository bookingRepository;
    private final PassangerRepository passangerRepository;
    public FlightBookingServiceImpl(FlightBookingRepository bookingRepository, PassangerRepository passangerRepository,
            FlightRepository flightRepository) {
        this.bookingRepository = bookingRepository;
        this.passangerRepository = passangerRepository;
        this.flightRepository = flightRepository;
    }

    private final FlightRepository flightRepository;

    @Override
    public FlightBooking getFlightBookingById(Long id) {
        return bookingRepository.findById(id).get();
    }

    @Override
    public List<FlightBooking> getAllBookingsByPassanger(Long passengerId) {
        return bookingRepository.findByPassanger(passangerRepository.findById(passengerId));
    }

    @Override
    public FlightBooking createFlightBooking(Long passengerId, Long flightId) throws NoRemainingSeatsException {
        FlightBooking booking = new FlightBooking();
        // find the passenger with given id
        Passanger passanger = passangerRepository.findById(passengerId).get();
        booking.setPassenger(passanger);

        Flight flight = flightRepository.findById(flightId).get();
        List<Flight> flights = booking.getFlights();
        flights.add(flight);

        // Set all flights after inserting the new one
        booking.setFlights(flights);

        // Check if flight tickets are not full sold
        int remainingSeats = flight.getNumberOfSeats();
        if (remainingSeats == 0) {
            throw new NoRemainingSeatsException("Unfortunetalety There is no any remaining seats by this flight!");
        }

        // if remaining seat less than 10 we are making a discount by the price
        if (remainingSeats < 10) {
            flight.setPrice(flight.getPrice() -  (flight.getPrice() * 0.2));
        }

        // drop the price from the passengers wallet
        double ticketPrice = flight.getPrice();
        double updatedWalletBalance = passanger.getWallet().getBalance() - ticketPrice;
        passanger.getWallet().setBalance(updatedWalletBalance);

        // decrease number of seats by this flight
        flight.setNumberOfSeats(flight.getNumberOfSeats() - 1);
        bookingRepository.save(booking);
        return booking;        
    }
    
}
