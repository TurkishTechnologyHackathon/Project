package com.turkishtechnology.hackathon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Long> {
    Optional<Passanger> findByEmail(String email);
}
