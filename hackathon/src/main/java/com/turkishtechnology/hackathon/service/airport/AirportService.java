package com.turkishtechnology.hackathon.service.airport;

import java.util.List;

import com.turkishtechnology.hackathon.model.entity.Airport;

public interface AirportService {
    
    Airport getAirportByIataCode(String iataCode);
    List<Airport> getAllAirports();
}
