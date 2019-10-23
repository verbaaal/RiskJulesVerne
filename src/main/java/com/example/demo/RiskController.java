package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//permet les requetes cross origine
@CrossOrigin(origins = "*", allowedHeaders = "*")
//indique qu'il s'agit d'un controlleur rest => traitement api ok
@RestController
public class RiskController {
	
	@Autowired
	RiskService service;
	
    /**
     * demande l'ajout d'un
     * @param player
     */
    @PostMapping("/addPlayer")
	public void addPlayer(@RequestBody Player player) {

    	service.createPlayer(player);
	}
    
    /**
     * demande l'ajout plusieurs players
     * @param player
     */
    @PostMapping("/addPlayers")
	public void addPlayers(@RequestBody ArrayList<Player> player) {

    	service.createPlayers(player);
    }
    
    /**
     * demande la liste des players
     * @return
     */
    @GetMapping("/getPlayer")
    public List<Player> list(){
    	return service.getPlayer();
    }
    /**
     * demande la liste des territoires
     * @return
     */
    @GetMapping("/getTerritory")
    public List<Territory> getTerritorys(){
    	return service.getTerritorys();
    }
    
    @GetMapping("/attack")
    public void attack() {
    	service.attack();
    }


}
