package com.turkishtechnology.hackathon.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.FlightBooking;
import com.turkishtechnology.hackathon.model.entity.Passanger;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
    
    List<FlightBooking> findByPassanger(Optional<Passanger> optional);
}
