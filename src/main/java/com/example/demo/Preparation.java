package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;



public class Preparation {
	private ArrayList<CardTerritory> listCardTerritory;

	
	public Preparation(ArrayList<CardTerritory> listCardTerritory, ArrayList<Player> playersList) {
		super();
		this.listCardTerritory = listCardTerritory;
	}
	
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
		return this.listCardTerritory;
	}


	//-------------------------------------------------

	/* Creer le Tableau de Joueur du Jeu
	 * Creer les Joueurs à l'init de la partie
	 * Pour crée les joueur besoin de creer leur ArrayList<CardTerritory>
	 */
	//-------------------------------------------------
//    public static void createPlayersWithMenu(int scInitNewPlayers, ArrayList<Player> arrayPlayers) {
//		switch (scInitNewPlayers) {
//		case 2 :
//			ArrayList<CardTerritory> cardTerritoryJoueur12 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur22 = new ArrayList<CardTerritory>();
//			Player joueur12 = new Player("Joueur 1","bleu", cardTerritoryJoueur12);
//			Player joueur22 = new Player("Joueur 2","rouge", cardTerritoryJoueur22);
//			arrayPlayers.add(joueur12);
//			arrayPlayers.add(joueur22);
//			System.out.println("Preparation de la partie Terminée !");
//			break;
//		case 3 :
//			ArrayList<CardTerritory> cardTerritoryJoueur13 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur23 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur33 = new ArrayList<CardTerritory>();
//			Player joueur13 = new Player("Joueur 1","bleu", cardTerritoryJoueur13);
//			Player joueur23 = new Player("Joueur 2","rouge", cardTerritoryJoueur23);
//			Player joueur33 = new Player("Joueur 3","vert", cardTerritoryJoueur33);
//			arrayPlayers.add(joueur13);
//			arrayPlayers.add(joueur23);
//			arrayPlayers.add(joueur33);
//			System.out.println("Preparation de la partie Terminée !");
//			break;
//		case 4 :
//			ArrayList<CardTerritory> cardTerritoryJoueur14 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur24 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur34 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur44 = new ArrayList<CardTerritory>();
//			Player joueur14 = new Player("Joueur 1","bleu",  cardTerritoryJoueur14);
//			Player joueur24 = new Player("Joueur 2","rouge", cardTerritoryJoueur24);
//			Player joueur34 = new Player("Joueur 3","vert",  cardTerritoryJoueur34);
//			Player joueur44 = new Player("Joueur 4","jaune", cardTerritoryJoueur44);
//			arrayPlayers.add(joueur14);
//			arrayPlayers.add(joueur24);
//			arrayPlayers.add(joueur34);
//			arrayPlayers.add(joueur44);
//			System.out.println("Preparation de la partie Terminée !");
//			break;
//		case 5 :
//			ArrayList<CardTerritory> cardTerritoryJoueur15 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur25 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur35 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur45 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur55 = new ArrayList<CardTerritory>();
//			Player joueur15 = new Player("Joueur 1","bleu",  cardTerritoryJoueur15);
//			Player joueur25 = new Player("Joueur 2","rouge",  cardTerritoryJoueur25);
//			Player joueur35 = new Player("Joueur 3","vert",  cardTerritoryJoueur35);
//			Player joueur45 = new Player("Joueur 4","jaune",  cardTerritoryJoueur45);
//			Player joueur55 = new Player("Joueur 5","orange",  cardTerritoryJoueur55);
//			arrayPlayers.add(joueur15);
//			arrayPlayers.add(joueur25);
//			arrayPlayers.add(joueur35);
//			arrayPlayers.add(joueur45);
//			arrayPlayers.add(joueur55);
//			System.out.println("Preparation de la partie Terminée !");
//			break;
//		case 6 :
//			ArrayList<CardTerritory> cardTerritoryJoueur16 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur26 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur36 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur46 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur56 = new ArrayList<CardTerritory>();
//			ArrayList<CardTerritory> cardTerritoryJoueur66 = new ArrayList<CardTerritory>();
//			Player joueur16 = new Player("Joueur 1","bleu",  cardTerritoryJoueur16);
//			Player joueur26 = new Player("Joueur 2","rouge",  cardTerritoryJoueur26);
//			Player joueur36 = new Player("Joueur 3","vert",  cardTerritoryJoueur36);
//			Player joueur46 = new Player("Joueur 4","jaune",  cardTerritoryJoueur46);
//			Player joueur56 = new Player("Joueur 5","orange",  cardTerritoryJoueur56);
//			Player joueur66 = new Player("Joueur 6","violet",  cardTerritoryJoueur66);
//			arrayPlayers.add(joueur16);
//			arrayPlayers.add(joueur26);
//			arrayPlayers.add(joueur36);
//			arrayPlayers.add(joueur46);
//			arrayPlayers.add(joueur56);
//			arrayPlayers.add(joueur66);
//			System.out.println("Preparation de la partie Terminée !");
//			break;
//		default :
//			Game.clearConsole(60);
//			Game.menuNrbJoueur();
//			Game.clearConsole(60);
//			break;
//		}

		// /!\ La liste initiale est modifiée
//return this.listCardTerritory;
//}

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

