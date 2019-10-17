package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Preparation {
	
	private ArrayList<CardTerritory> listCardTerritory;
	private ArrayList<Player> PlayerList;
	private int nbPlayer;
	
	/**
	 * constructeur
	 */
	public Preparation() {
		
	}
	
	
	/**
	 * shuffle des cartes territoires
	 * @param ListCardTerritory
	 * @return
	 */
	public ArrayList<CardTerritory> suffleCards(ArrayList<CardTerritory> ListCardTerritory){
		Collections.shuffle(this.listCardTerritory);
		//le suffle s'effectue directement sur la liste => pas besoin d'une variable intermediaire
		// /!\ La liste initiale est modifiée
		return this.listCardTerritory;
	}

	/**
	 * indique le nombre de joueur
	 * @param nbPlayer
	 * @return
	 */
	public int numberOfPlayer(int nbPlayer) {
	
		if (nbPlayer > 1  && nbPlayer <7) {
		
		return this.nbPlayer;
		
		} else {
			return this.nbPlayer = 0;
		}
	}
	
	

	/* getters et setters */ 
	/**
	 * @return the listCardTerritory
	 */
	public ArrayList<CardTerritory> getListCardTerritory() {
		return listCardTerritory;
	}

	
	/**
	 * @return the nbPlayer
	 */
	public int getNbPlayer() {
		return nbPlayer;
	}


	/**
	 * @param nbPlayer the nbPlayer to set
	 */
	public void setNbPlayer(int nbPlayer) {
		this.nbPlayer = nbPlayer;
	}

	/**
	 * @param listCardTerritory the listCardTerritory to set
	 */
	public void setListCardTerritory(ArrayList<CardTerritory> listCardTerritory) {
		this.listCardTerritory = listCardTerritory;
	}

	/**
	 * @return the playerList
	 */
	public ArrayList<Player> getPlayerList() {
		return PlayerList;
	}

	/**
	 * @param playerList the playerList to set
	 */
	public void setPlayerList(ArrayList<Player> playerList) {
		PlayerList = playerList;
	}

	
}

	
