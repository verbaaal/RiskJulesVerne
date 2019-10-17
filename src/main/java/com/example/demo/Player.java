package com.example.demo;

import java.util.ArrayList;

public class Player {

	private Integer id;
	private String name;
	private String color;
	private ArrayList<Territory> territoriesPlayer;
	private ArrayList<Continent> continentsPlayer;
	private ArrayList<CardTerritory> cardsTerritoriesPlayer;


	/**
	 * 
	 * constructeur
	 * 
	 * @param id
	 * @param name
	 * @param color
	 * @param territoriesPlayer
	 * @param continentsPlayer
	 * @param cardsTerritoriesPlayer
	 */
	public Player(String name, String color, ArrayList<Territory> territoriesPlayer,
			ArrayList<Continent> continentsPlayer, ArrayList<CardTerritory> cardsTerritoriesPlayer) {
		super();
		this.name = name;
		this.color = color;
		this.territoriesPlayer = territoriesPlayer;
		this.continentsPlayer = continentsPlayer;
		this.cardsTerritoriesPlayer = cardsTerritoriesPlayer;
	}


	public Player() {

	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", color=" + color + ", territoriesPlayer=" + territoriesPlayer
				+ ", continentsPlayer=" + continentsPlayer + ", cardsTerritoriesPlayer=" + cardsTerritoriesPlayer + "]";
	}

	
	/* getters et setters */
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	
	/**
	 * @return the territoriesPlayer
	 */
	public ArrayList<Territory> getTerritoriesPlayer() {
		return territoriesPlayer;
	}




	/**
	 * @param territoriesPlayer the territoriesPlayer to set
	 */
	public void setTerritoriesPlayer(ArrayList<Territory> territoriesPlayer) {
		this.territoriesPlayer = territoriesPlayer;
	}


	/**jn,
	 * @return the continentsPlayer
	 */
	public ArrayList<Continent> getContinentsPlayer() {
		return continentsPlayer;
	}




	/**
	 * @param continentsPlayer the continentsPlayer to set
	 */
	public void setContinentsPlayer(ArrayList<Continent> continentsPlayer) {
		this.continentsPlayer = continentsPlayer;
	}

	
	/**
	 * @return the cardsTerritoriesPlayer
	 */
	public ArrayList<CardTerritory> getCardsTerritoriesPlayer() {
		return cardsTerritoriesPlayer;
	}


	/**
	 * @param cardsTerritoriesPlayer the cardsTerritoriesPlayer to set
	 */
	public void setCardsTerritoriesPlayer(ArrayList<CardTerritory> cardsTerritoriesPlayer) {
		this.cardsTerritoriesPlayer = cardsTerritoriesPlayer;
	}




}