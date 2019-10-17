package com.example.demo;

public class Territory {
	private Integer id;
	private String name;
	private Continent continent;
	private Player owner;
	private int nbrUnit;
	
	
	/**
	 * 
	 * constructeur 
	 * 
	 * @param id
	 * @param name
	 * @param continent
	 * @param owner
	 * @param nbrUnit
	 */
	public Territory(Integer id, String name, Continent continent, Player owner, int nbrUnit) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.owner = owner;
		this.nbrUnit = nbrUnit;
	}

	

	@Override
	public String toString() {
		return "Territory [id=" + id + ", name=" + name + ", owner=" + owner + ", nbrUnit=" + nbrUnit + "]";
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
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}



	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}



	/**
	 * @return the owner
	 */
	public Player getOwner() {
		return owner;
	}



	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}



	/**
	 * @return the nbrUnit
	 */
	public int getNbrUnit() {
		return nbrUnit;
	}



	/**
	 * @param nbrUnit the nbrUnit to set
	 */
	public void setNbrUnit(int nbrUnit) {
		this.nbrUnit = nbrUnit;
	}
}
