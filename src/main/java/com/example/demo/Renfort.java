package com.example.demo;

public class Renfort {
	
	public Renfort() {

	}
	public int getNbrContinentPlayer(Player player) {
	int nbrContinentPlayer = player.getContinentsPlayer().size();
		return nbrContinentPlayer;
	}
	
	public int getNbrTerritoryPlayer(Player player) {
	int nbrTerritoryPlayer = player.getTerritoriesPlayer().size();
		 return nbrTerritoryPlayer;
	}
	
	public int getNbrRenfort(int nbrTerritoryPlayer, int nbrContinentPlayer) {
		
		return 1;
	}
	
	
	
	
	
	
	
	
	


}
