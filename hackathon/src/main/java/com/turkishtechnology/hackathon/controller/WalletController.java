package com.turkishtechnology.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.turkishtechnology.hackathon.model.entity.Passanger;
import com.turkishtechnology.hackathon.service.passanger.PassangerService;


@Controller
public class WalletController {
    
    @Autowired
    private PassangerService passangerService;

    @GetMapping("/wallet/{passengerId}")
    public String createWallet(@PathVariable("passengerId") Long passengerId, Model model) {
        Passanger passanger = passangerService.getPassangerById(passengerId);
        model.addAttribute("wallet", passanger.getWallet());
        model.addAttribute("passengerName", passanger.getFirstName() + " " + passanger.getLastName());
        return "wallet";
    }
    
}
