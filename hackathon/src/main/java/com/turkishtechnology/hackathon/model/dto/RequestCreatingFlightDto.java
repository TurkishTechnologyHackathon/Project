package com.turkishtechnology.hackathon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCreatingFlightDto {
    
    private String departure;
    private String arrival;
    private String departureDate;
    private String arrivalDate;
    private String duration;
    private String flightTime;
    private double price;
    private int numberOfSeats;
}
