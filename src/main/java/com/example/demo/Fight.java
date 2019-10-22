package com.example.demo;

import java.util.List;

public class Fight {
	
	private Boolean canPick;
	private List<Territory> canAttack;
	
	
	Player player1 = new Player();
	Player player2 = new Player();
	Continent cont1 = new Continent();
	Territory terr1 = new Territory(1, "caca", cont1, player1, 7);
	Territory terr2 = new Territory(7, "pipi", cont1, player2, 5);

	
	public Boolean territoryPick() {
		
		if (terr1.getOwner().getId() == player1.getId() && terr1.getNbrUnit() > 1) {
			
			canPick = true;
			
		}
		
		else {
			
			canPick = false;
			
		}
		return canPick;		
		
	}
	
	public List territoryCanattack(Territory terr1, Territory terr2){
		
		for (int i = 0; i<terr1.getTerritorys().size(); i++) {
			
		}
		return canAttack;
			
		
	}
	
	
}
