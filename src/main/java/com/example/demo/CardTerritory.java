package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "card_territory")
public class CardTerritory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Territory territory;
	private String symbole;
	private String symbole2;
	private String symbole3;
	
	
	/**
	 * constructeur normal
	 * @param id
	 * @param territory
	 * @param symbole
	 */
	public CardTerritory(Integer id, Territory territory, String symbole) {
		super();
		this.id = id;
		this.territory = territory;
		this.symbole = symbole;
	}

	/**
	 * contructeur carte joker
	 * @param symbole
	 * @param symbole2
	 * @param symbole3
	 */
	public CardTerritory(String symbole, String symbole2, String symbole3) {
		super();
		this.symbole = symbole;
		this.symbole2 = symbole2;
		this.symbole3 = symbole3;
	}

	@Override
	public String toString() {
		return "CardTerritory [id=" + id + ", territory=" + territory + ", symbole=" + symbole + ", symbole2="
				+ symbole2 + ", symbole3=" + symbole3 + "]";
	}

	
	/* getters et setters 
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
	 * @return the territory
	 */
	public Territory getTerritory() {
		return territory;
	}

	/**
	 * @param territory the territory to set
	 */
	public void setTerritory(Territory territory) {
		this.territory = territory;
	}

	/**
	 * @return the symbole
	 */
	public String getSymbole() {
		return symbole;
	}

	/**
	 * @param symbole the symbole to set
	 */
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	/**
	 * @return the symbole2
	 */
	public String getSymbole2() {
		return symbole2;
	}

	/**
	 * @param symbole2 the symbole2 to set
	 */
	public void setSymbole2(String symbole2) {
		this.symbole2 = symbole2;
	}

	/**
	 * @return the symbole3
	 */
	public String getSymbole3() {
		return symbole3;
	}

	/**
	 * @param symbole3 the symbole3 to set
	 */
	public void setSymbole3(String symbole3) {
		this.symbole3 = symbole3;
	}	
	
}