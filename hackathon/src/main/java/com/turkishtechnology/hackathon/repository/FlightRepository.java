package com.turkishtechnology.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.Flight;
import java.util.List;
import java.time.LocalDate;


public interface FlightRepository extends JpaRepository<Flight, Long> {
    
    List<Flight> findByDepartureDateBefore(LocalDate departureDate);
    List<Flight> findByDepartureDateAfter(LocalDate departureDate);
}
