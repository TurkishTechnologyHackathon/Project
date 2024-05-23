package com.turkishtechnology.hackathon.service.impl.booking;

import java.util.List;
import org.springframework.stereotype.Service;

import com.turkishtechnology.hackathon.model.entity.Flight;
import com.turkishtechnology.hackathon.model.entity.FlightBooking;
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
    public FlightBooking createFlightBooking(Long passengerId, Long flightId) {
        FlightBooking booking = new FlightBooking();
        booking.setPassenger(passangerRepository.findById(passengerId).get());

        Flight flight = flightRepository.findById(flightId).get();
        List<Flight> flights = booking.getFlights();
        flights.add(flight);

        // Set all flights after inserting the new one
        booking.setFlights(flights);

        bookingRepository.save(booking);
        return booking;        
    }
    
}
