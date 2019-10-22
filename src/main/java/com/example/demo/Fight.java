package com.example.demo;

public class Fight {
	
	private Boolean canPick;
	private Boolean canAttack;
	
	
	
	Player player1 = new Player();
	Continent cont1 = new Continent();
	Territory terr1 = new Territory(1, "caca", cont1, player1, 7);
	
	public Boolean territoryPick() {
		
		if (terr1.getOwner().getId() == player1.getId() ) {
			
			canPick = true;
			
		}
		
		else {
			
			canPick = false;
			
		}
		return canPick;		
		
	}
	
	public Boolean territoryCanattack(Territory attack, Territory def){
		
		
		return canAttack;
			
		
	}
	
	
}
