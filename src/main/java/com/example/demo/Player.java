
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "player")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_player")
	private Integer id;
	@Column(name = "name_player")
	private String name;
	@Column(name = "pawn_color")
	private String color;
	
	@OneToMany(mappedBy="owner" )
	@Transient
	private List<Territory> territoriesPlayer;
	@Transient
	private ArrayList<Continent> continentsPlayer;
	@Transient
	private ArrayList<CardTerritory> cardsTerritoriesPlayer;


	/**
	 * @param name
	 * @param color
	 * @param territoriesPlayer
	 * @param continentsPlayer
	 * @param cardsTerritoriesPlayer
	 */
	public Player(Integer id, String name, String color, ArrayList<Territory> territoriesPlayer,
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
		return "Player [name=" + name + ", color=" + color + ", territoriesPlayer=" + territoriesPlayer
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

	

	public List<Territory> getTerritoriesPlayer() {
		return territoriesPlayer;
	}


	public void setTerritoriesPlayer(ArrayList<Territory> territoriesPlayer) {
		this.territoriesPlayer = territoriesPlayer;
	}


	/**
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


