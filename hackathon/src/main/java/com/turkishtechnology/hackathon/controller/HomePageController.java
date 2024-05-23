package com.turkishtechnology.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.turkishtechnology.hackathon.service.airport.AirportService;



@Controller
public class HomePageController {
    
    private final AirportService airportService;

    public HomePageController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping
    public String getHomePage(Model model) {
        model.addAttribute("airports", airportService.getAllAirports());
        return "home_page";
    }
    
    

}
