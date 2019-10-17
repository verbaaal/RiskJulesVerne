package com.example.demo;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/")
@RestController
public class RiskConstroller {
	
	@Autowired
	RiskService service;
	
    //demande l'ajout d'une tache
    @PostMapping("/addPlayer")
    public void addPlayer(@RequestBody Player newPlayer) {
        service.createPlayer(newPlayer);
    }


}
