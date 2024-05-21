package com.turkishtechnology.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    
}
