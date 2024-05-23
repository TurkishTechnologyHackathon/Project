package com.turkishtechnology.hackathon.controller;

import com.turkishtechnology.hackathon.model.dto.RequestCreatingFlightDto;
import com.turkishtechnology.hackathon.model.dto.RequestSearchingFlightDto;
import com.turkishtechnology.hackathon.model.entity.Flight;
import com.turkishtechnology.hackathon.service.flights.FlightService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/flights")
public class FlightsController {
    
    private final FlightService flightService;

    public FlightsController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("")
    public ResponseEntity<Flight> createFlight(@RequestBody RequestCreatingFlightDto creatingFlightDto) {
        return ResponseEntity.ok(flightService.createFlight(creatingFlightDto));
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<Flight>> searchFlights(@RequestBody RequestSearchingFlightDto searchingFlightDto) {
        return ResponseEntity.ok(flightService.searchFlights(searchingFlightDto));
    }
    

    // @GetMapping("/flights")
    // public String listFlights(Model model) {
    //     model.addAttribute("flights", flightService.getAllFlights());
    //     return "flights";
    // }
    

}
