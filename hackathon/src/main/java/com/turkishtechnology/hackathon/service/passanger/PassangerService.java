package com.turkishtechnology.hackathon.service.passanger;

import java.util.List;

import com.turkishtechnology.hackathon.model.entity.Passanger;

public interface PassangerService {
    
    Passanger getPassangerById(Long id);
    List<Passanger> getAllPassangers();
    Passanger createPassanger(Passanger passanger);
    void deletePassangerById(Long id);
    Passanger updatePassanger(Passanger passanger);
    boolean checkCredentials(Passanger passanger);
}
