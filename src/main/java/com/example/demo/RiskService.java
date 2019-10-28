package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	public void updateTerritory (Territory terr) {
		territoryRepo.save(terr);
	}
	

	
	/**
	 * set un owner au territoire
	 * @param player
	 * @param territory
	 */
	public void setOwner(Player player,int territoryId) {

		
		Territory territory = territoryRepo.findById(territoryId).get();
		territory.setOwner(player);
		territoryRepo.save(territory);
	}

	public void setAllOwnersToNull() {
		
	}

	/**
	 * supprime tous les players de la bdd
	 * 
	 */
	public void deletePlayers() {
		playerRepo.deleteAll();
	}

	public void getFightResult(int terrAtk, int nbAtk, int terrDef, int nbDef) {
		
	}
	
	public Territory getTerritoryById(Integer id) {
		return territoryRepo.findById(id).get();
	}
}
