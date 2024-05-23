package com.turkishtechnology.hackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.turkishtechnology.hackathon.model.entity.Passanger;
import com.turkishtechnology.hackathon.service.passanger.PassangerService;

@Controller
public class RegisterController {
    
    @Autowired
    private PassangerService passangerService;

    @GetMapping("/register")
    public String createRegisterForm(Model model) {
        Passanger passanger = new Passanger();
        model.addAttribute("new_passenger", passanger);
        return "register";
    }

    @PostMapping("/register")
    public String savePassenger(@ModelAttribute("new_passenger") Passanger passanger) {
        passangerService.createPassanger(passanger);
        return "home_page";
    }
}
