package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Fight {

	private Boolean canPick;
	private List<Territory> canAttack;
	private int nbAttacker;
	private int nbDefenser;
	@Autowired
	private Territory terrAtk;
	@Autowired
	private Territory terrDef;

	public Fight () {
	}

	public Fight (Territory terrAtk, Territory terrDef, int nbAttacker, int nbDefenser) {
		terrAtk = this.terrAtk;
		terrDef = this.terrDef;
		nbAttacker = this.nbAttacker;
		nbDefenser = this.nbDefenser;
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

	public ArrayList<Territory> start(int nbAttacker, int nbDefenser, Territory territoryAtk,Territory territoryDef) {

		ArrayList<Integer> resultAtk = lancerXDes(nbAttacker);
		ArrayList<Integer> resultDef = lancerXDes(nbDefenser);
		ArrayList<Territory> territoryState = new ArrayList();
		ArrayList<Integer> resultList = compareList(resultAtk, resultDef);
		int nbUnitAtk = territoryAtk.getNbrUnit();
		int nbUnitDef = territoryDef.getNbrUnit();
		int troopAttackLost = resultList.get(0);
		int troopDefLost = resultList.get(1);
		territoryAtk.setNbrUnit(nbUnitAtk-troopAttackLost);
		territoryDef.setNbrUnit(nbUnitAtk-troopDefLost);
		territoryDef.getNbrUnit();
		if (territoryDef.getNbrUnit() == 0) {
			territoryDef.setOwner(territoryAtk.getOwner());
		}
		territoryState.add(territoryAtk);
		territoryState.add(territoryDef);
		// Attaque puis défense.
		return territoryState;	
	}

	public ArrayList<Integer> compareList(ArrayList<Integer> resultAttack, ArrayList<Integer> resultDefense) {

		int maxSize = 0;
		int attPoint = 0;
		int defPoint = 0;
		ArrayList<Integer> results = new ArrayList();

		if(resultAttack.size() < resultDefense.size()) {
			maxSize = resultAttack.size();
		}
		else {
			maxSize = resultDefense.size();
		}


		for (int i = 0 ; i<maxSize ; i++) {
			if (resultAttack.get(i) <= resultDefense.get(i)) {
				attPoint++;
			}
			else {
				defPoint++;
			}
		}
		results.add(attPoint);
		results.add(defPoint);
		
		return results;
	}




}
