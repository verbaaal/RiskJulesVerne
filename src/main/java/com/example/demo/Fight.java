package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fight {
	
	private Boolean canPick;
	private List<Territory> canAttack;
	private int pickNbAttacker;
	
	
	Player player1 = new Player();
	Player player2 = new Player();
	Continent cont1 = new Continent();
	Territory terr1 = new Territory(1, "caca", cont1, player1, 7);
	Territory terr2 = new Territory(7, "pipi", cont1, player2, 5);

	//	choix du territoire attaquant
	
	public Boolean territoryPick() {
		
		if (terr1.getOwner().getId() == player1.getId() && terr1.getNbrUnit() > 1) {
			
			canPick = true;
			
		}
		
		else {
			
			canPick = false;
			
		}
		return canPick;		
		
	}
	
	//	choix du territoire attaqué
	
	
	public List<Territory> territoryAttack() {
		if (terr2.getOwner().getId() != player1.getId()) {
			canAttack = terr1.getNeighbors();
			for (int i = 0; i<canAttack.size(); i++) {
				return canAttack;
			}
		}
		return canAttack;
		
	}
	//				
	//	choix du nombre d'attaquant max 3
	//	
	public int pickAttacker() {
		if (terr1.getNbrUnit() >= 3 ) {
			pickNbAttacker <= 3;
		}
		else if (terr1.getNbrUnit() == 2) {
			pickNbAttacker = 2;
		}
		return pickNbAttacker;
	}
	
	/**
	 * fonction lancement 1 dés
	 * 
	 * @return
	 */
	
	public int rollDice() {
		int min = 1;
		int max = 6;
		int roll = min + (int)(Math.random() * ((max - min) + 1));
		return roll;
	}
	
	
	/**
	 * 
	 * fonction qui permet de lancer plusieurs des
	 * 
	 * @param nbDes
	 * @return
	 */
	public ArrayList<Integer> lancerXDes(int nbDes) {
		ArrayList<Integer> resultat = new ArrayList<Integer>(); 
		for(int i = 0; i <nbDes; i++) {
			resultat.add(rollDice());	
		}
		//resultat = 
		Collections.sort(resultat, Collections.reverseOrder());
		return resultat;
	}

	public ArrayList<Integer> sortMaxResults(ArrayList<Integer> arr){
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		switch (arr.size()) {
		case 1:
			resultat.add(arr.get(0));
			break;
		default:
			for (int i = 0; i < 2; i++) {
				resultat.add(arr.get(i));
			}
			break;
		}	
		return resultat;
	}
	
	public ArrayList<Integer>fight(int nbDiceAttacker, int nbDiceDefender, Territory territoryAtk,Territory territoryDef) {
		
		ArrayList<Integer> resultAtk = lancerXDes(nbDiceAttacker);
		ArrayList<Integer> resultDef = lancerXDes(nbDiceDefender);

		if( resultAtk.get(0) > resultDef.get(0)) {
			territoryDef.setNbrUnit(-1);
			}else if (resultAtk.get(0) < resultDef.get(0)) {
				territoryAtk.setNbrUnit(-1);	
			}else {
				territoryAtk.setNbrUnit(-1);
			}
		
		return resultAtk;
	}
	
	
	
	
}
