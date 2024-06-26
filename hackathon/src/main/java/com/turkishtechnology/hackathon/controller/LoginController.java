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
public class LoginController {

    @Autowired
    private PassangerService passangerService;
    
    @GetMapping("/login")
    public String createLoginForm(Model model) {
        Passanger passanger = new Passanger();
        model.addAttribute("passenger", passanger);
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("passenger") Passanger passanger) {
        if (passangerService.checkCredentials(passanger)) {
            return "home_page";
        }
        return "redirect:/register";
    }    
    
}
