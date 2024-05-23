package com.turkishtechnology.hackathon.service.impl.passanger;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkishtechnology.hackathon.model.entity.Passanger;
import com.turkishtechnology.hackathon.repository.PassangerRepository;
import com.turkishtechnology.hackathon.service.passanger.PassangerService;

@Service
public class PassangerServiceImpl implements PassangerService {

    private final PassangerRepository passangerRepository;

    public PassangerServiceImpl(PassangerRepository passangerRepository) {
        this.passangerRepository = passangerRepository;
    }

    @Override
    public Passanger getPassangerById(Long id) {
        return passangerRepository.findById(id)
                        .orElseThrow();
    }

    @Override
    public List<Passanger> getAllPassangers() {
        return passangerRepository.findAll();
    }

    @Override
    public Passanger createPassanger(Passanger passanger) {
        return passangerRepository.save(passanger);
    }

    @Override
    public void deletePassangerById(Long id) {
        passangerRepository.deleteById(id);
    }

    @Override
    public Passanger updatePassanger(Passanger passanger) {
        Passanger existingPassanger = passangerRepository.findById(passanger.getId()).get();
        existingPassanger.setFirstName(passanger.getFirstName());
        existingPassanger.setLastName(passanger.getLastName());
        existingPassanger.setEmail(passanger.getEmail());
        passangerRepository.save(existingPassanger);
        return existingPassanger;
    }
    
}
