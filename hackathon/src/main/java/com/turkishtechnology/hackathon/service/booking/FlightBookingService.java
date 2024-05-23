package com.turkishtechnology.hackathon.service.booking;

import java.util.List;

import com.turkishtechnology.hackathon.model.entity.FlightBooking;

public interface FlightBookingService {
    
    FlightBooking getFlightBookingById(Long id);
    List<FlightBooking> getAllBookingsByPassanger(Long passengerId);
    FlightBooking createFlightBooking(Long passengerId, Long flightId);
    
}
