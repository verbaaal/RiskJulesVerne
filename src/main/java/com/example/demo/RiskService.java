package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RiskService {

	//instancier les repo
	@Autowired
	PlayerRepository playerRepo;
	@Autowired
	ContinentRepository continentRepo;
	@Autowired
	TerritoryRepository territoryRepo;
	@Autowired
	CardTerritoryRepository cardTerritoryRepo;

	/**
	 * permet d'enregistrer un player dans la bdd
	 * @param player
	 * @return
	 */
	public Player createPlayer(Player player) {
		
		return playerRepo.save(player);

	}
	
	/**
	 * permet d'enregister une liste de player dans la bdd
	 * @param player
	 * @return
	 */
	public List<Player> createPlayers(ArrayList<Player> player) {
		
		return playerRepo.saveAll(player);

	}

	/**
	 * avoir la liste des players de la bdd
	 * @return
	 */
	public ArrayList<Player> getPlayer(){
		return (ArrayList<Player>) playerRepo.findAll();
	}
	
	/**
	 * avoir la liste des territoires
	 * @return
	 */
	public ArrayList<Territory> getTerritorys() {
		return  (ArrayList<Territory>) territoryRepo.findAll();
	}
	
	public void attack() {
		 
		List<Territory> myList = territoryRepo.findAll();
		
		Territory one = myList.get(35);
		System.out.println(one);
		
	}

}
