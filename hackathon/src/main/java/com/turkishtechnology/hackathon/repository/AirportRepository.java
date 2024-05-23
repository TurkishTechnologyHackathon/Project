package com.turkishtechnology.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.Airport;

public interface AirportRepository extends JpaRepository<Airport, String> {
    
}
