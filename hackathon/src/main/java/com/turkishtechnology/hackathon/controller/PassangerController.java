package com.turkishtechnology.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.turkishtechnology.hackathon.service.passanger.PassangerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PassangerController {
    
    @Autowired
    private PassangerService passangerService;


    @GetMapping("/passangers/{passangerId}/profile")
    public String checkProfile(@PathVariable("passangerId") Long passengerId, Model model) {
        model.addAttribute("passanger", passangerService.getPassangerById(passengerId));
        return "passenger_profile";
    }
    
}
