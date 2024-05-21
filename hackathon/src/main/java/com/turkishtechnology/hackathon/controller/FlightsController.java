package com.turkishtechnology.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.turkishtechnology.hackathon.service.flights.FlightService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FlightsController {
    
    private final FlightService flightService;

    public FlightsController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public String listFlights(Model model) {
        model.addAttribute("flights", flightService.getAllFlights());
        return "flights";
    }
    

}
