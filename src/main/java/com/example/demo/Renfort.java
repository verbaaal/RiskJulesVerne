package com.example.demo;

public class Renfort {
		
	/**
	 * Methode qui permet d'obtenir le nombre de territoire d'un joueur
	 * @param player
	 * @return
	 */
	
	public int getNbrTerritoryPlayer(Player player) {
	int nbrTerritoryPlayer = player.getTerritoriesPlayer().size();
		 return nbrTerritoryPlayer;
	}
	

	/**
	 * Methode qui calcul le nombre de renfort qu'obtient un joueur
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

