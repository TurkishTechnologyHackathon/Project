package com.turkishtechnology.hackathon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestSearchingFlightDto {

    private Long passengerId;
    private String flightType;
    
    private String departureDateStart;
    private String departureDateEnd;

    private String arrivalDateStart;
    private String arrivalDateEnd;
}
