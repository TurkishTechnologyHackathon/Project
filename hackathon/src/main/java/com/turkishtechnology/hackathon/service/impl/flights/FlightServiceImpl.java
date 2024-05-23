package com.turkishtechnology.hackathon.service.impl.flights;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkishtechnology.hackathon.model.dto.RequestCreatingFlightDto;
import com.turkishtechnology.hackathon.model.dto.RequestSearchingFlightDto;
import com.turkishtechnology.hackathon.model.entity.Flight;
import com.turkishtechnology.hackathon.repository.FlightRepository;
import com.turkishtechnology.hackathon.service.flights.FlightService;
import com.turkishtechnology.hackathon.util.DateUtil;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight createFlight(RequestCreatingFlightDto creatingFlightDto) {
        Flight flight = new Flight();
        flight.setDeparture(creatingFlightDto.getDeparture());
        flight.setArrival(creatingFlightDto.getArrival());
        flight.setDepartureDate(DateUtil.toLocalDateTime(creatingFlightDto.getDepartureDate()));
        flight.setArrivalDate(DateUtil.toLocalDateTime(creatingFlightDto.getArrivalDate()));
        flight.setFlightTime(DateUtil.toLocalTime(creatingFlightDto.getFlightTime()));
        flight.setDuration(creatingFlightDto.getDuration());
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> searchFlights(RequestSearchingFlightDto searchingFlightDto) {
        
        return flightRepository.findByDepartureDateBefore(DateUtil.toLocalDateTime(searchingFlightDto.getDepartureDateEnd()));
    }

}
