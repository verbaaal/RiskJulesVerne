package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
public class RiskController {
	
	@Autowired
	RiskService service;
	
    //demande l'ajout d'une tache
    @PostMapping("/addPlayer")
 
	public void addPlayer(HttpServletRequest request) {
    	
		String name ="";
		String color="";
		ArrayList<Territory> territoriesPlayer = new ArrayList();
		ArrayList<Continent> continentsPlayer = new ArrayList();
		ArrayList<CardTerritory> cardsTerritoriesPlayer = new ArrayList();
		try {           
			name = (String) request.getParameter("name");
			color = (String) request.getParameter("color");
			System.out.println(name);
			System.out.println(color);
			Player player = new Player(name, color, territoriesPlayer, continentsPlayer, cardsTerritoriesPlayer);
			System.out.println(player);
			service.createPlayer(player);
			
		} catch (Exception e) {

		}
	}


}
