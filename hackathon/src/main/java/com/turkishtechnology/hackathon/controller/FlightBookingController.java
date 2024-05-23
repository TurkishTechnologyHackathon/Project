package com.turkishtechnology.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkishtechnology.hackathon.model.dto.RequestBookingDto;
import com.turkishtechnology.hackathon.model.entity.FlightBooking;
import com.turkishtechnology.hackathon.service.booking.FlightBookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("bookings")
public class FlightBookingController {
    
    @Autowired
    private FlightBookingService bookingService;


    @PostMapping("/create")
    public ResponseEntity<FlightBooking> createBooking(@RequestBody RequestBookingDto requestBookingDto) {
        return ResponseEntity.ok(bookingService.createFlightBooking(requestBookingDto.getPassengerId(), requestBookingDto.getFlightId()));
        
    }
    

}
