package com.turkishtechnology.hackathon.service.impl.flights;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkishtechnology.hackathon.model.entity.Flight;
import com.turkishtechnology.hackathon.repository.FlightRepository;
import com.turkishtechnology.hackathon.service.flights.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

}
