package com.turkishtechnology.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.FlightBooking;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
    
}
