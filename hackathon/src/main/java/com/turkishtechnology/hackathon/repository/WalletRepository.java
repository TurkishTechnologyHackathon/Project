package com.turkishtechnology.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.hackathon.model.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    
}
