package com.turkishtechnology.hackathon.service.impl.airport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkishtechnology.hackathon.model.entity.Airport;
import com.turkishtechnology.hackathon.repository.AirportRepository;
import com.turkishtechnology.hackathon.service.airport.AirportService;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public Airport getAirportByIataCode(String iataCode) {
        return airportRepository.findById(iataCode).get();
    }

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }
    
}
