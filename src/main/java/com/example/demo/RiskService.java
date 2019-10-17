package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RiskService {

	//instancier le repo
	@Autowired
	PlayerRepository playerRepo;
	@Autowired
	ContinentRepository continentRepo;
	@Autowired
	TerritoryRepository territoryRepo;
	@Autowired
	CardTerritoryRepository cardTerritoryRepo;
	
	
		public Player createPlayer(Player player) {
			return playerRepo.save(player);
	
	}


}
