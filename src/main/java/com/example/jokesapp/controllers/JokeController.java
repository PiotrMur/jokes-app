package com.example.jokesapp.controllers;

import com.example.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired //Autowired is not necessary since there is only one constructor
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({""})
    public String showJoke(Model model){
        model.addAttribute("alphabet", jokeService.getJoke());
        model.addAttribute("joke", jokeService.getJoke());

        return "jokes/index";
    }
}
