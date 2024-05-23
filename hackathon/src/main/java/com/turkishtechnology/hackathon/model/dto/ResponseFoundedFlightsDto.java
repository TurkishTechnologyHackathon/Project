package com.turkishtechnology.hackathon.model.dto;

import com.turkishtechnology.hackathon.model.entity.Flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFoundedFlightsDto {
    
    private Flight foundedCheapestDeparture;
    private Flight foundedCheapestArrival;
}
