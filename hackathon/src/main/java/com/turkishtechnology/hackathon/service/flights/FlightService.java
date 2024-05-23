package com.turkishtechnology.hackathon.service.flights;

import java.util.List;

import com.turkishtechnology.hackathon.model.dto.RequestCreatingFlightDto;
import com.turkishtechnology.hackathon.model.dto.RequestSearchingFlightDto;
import com.turkishtechnology.hackathon.model.entity.Flight;

public interface FlightService {
    
    List<Flight> getAllFlights();
    Flight createFlight(RequestCreatingFlightDto creatingFlightDto);
    List<Flight> searchFlights(RequestSearchingFlightDto searchingFlightDto);
}
