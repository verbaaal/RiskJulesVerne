package com.example.demo;

import java.util.ArrayList;

public class Continent {
	private int id;
	private String name;
	private ArrayList<Territory> territoriesCont;
	
	/**
	 * 
	 * constructeur
	 * 
	 * @param id
	 * @param name
	 * @param territoriesCont
	 */
	public Continent(int id, String name, ArrayList<Territory> territoriesCont) {
		super();
		this.id = id;
		this.name = name;
		this.territoriesCont = territoriesCont;
	}

	@Override
	public String toString() {
		return "Continent [id=" + id + ", name=" + name + ", territoriesCont=" + territoriesCont + "]";
	}

	
	/* getters et setters */
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the territoriesCont
	 */
	public ArrayList<Territory> getTerritoriesCont() {
		return territoriesCont;
	}

	/**
	 * @param territoriesCont the territoriesCont to set
	 */
	public void setTerritoriesCont(ArrayList<Territory> territoriesCont) {
		this.territoriesCont = territoriesCont;
	}
	
	
	

}