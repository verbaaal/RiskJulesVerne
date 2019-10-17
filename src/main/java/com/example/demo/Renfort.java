package com.example.demo;

import java.util.ArrayList;

public class Renfort {
	
	public Renfort() {

	}
	
	/**
	 * Methode qui met dans une variable le nbr de territoire du joueur
	 * @param player
	 * @return
	 */
	
	public int getNbrTerritoryPlayer(Player player) {
	int nbrTerritoryPlayer = player.getTerritoriesPlayer().size();
		 return nbrTerritoryPlayer;
	}
	
	/**
	 * 
	 * @param nbrTerritoryPlayer
	 * @param nbrContinentPlayer
	 * @return
	 */
	public int getNbrRenfort(Player player ,int nbrTerritoryPlayer, int nbrContinentPlayer) {
		
		//Territoires
		int nbrRenfortTerritory = (int) Math.floor(nbrTerritoryPlayer / 3) ;
		if (nbrRenfortTerritory < 2) {
			nbrRenfortTerritory = 2 ;
		}
		player.getContinentsPlayer().toString();
		return nbrRenfortTerritory;
		
	}
}

