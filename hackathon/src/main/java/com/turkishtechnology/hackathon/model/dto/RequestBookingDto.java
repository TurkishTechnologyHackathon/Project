package com.turkishtechnology.hackathon.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestBookingDto {
    
    private Long passengerId;
    private Long flightId;
}
