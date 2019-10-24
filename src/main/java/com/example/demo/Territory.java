package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table (name = "territory")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Territory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_terr")
	private Integer id;
	@Column(name = "name_terr")
	private String name;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name ="cont_id")
//	@JsonManagedReference
	@JsonIgnoreProperties({"territoriesCont"})
	private Continent continent;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name ="player_owner")
//	@JsonManagedReference
	
	private Player owner;
	@Transient
	private int nbrUnit;

	@ManyToMany(cascade={CascadeType.ALL})
//	@JsonBackReference
	
	@JoinTable(name="frontier",
		joinColumns={@JoinColumn(name="id_terr1")},
		inverseJoinColumns={@JoinColumn(name="id_terr2")})
	@JsonIgnoreProperties({"continent", "territorys"})
	private List<Territory> Neighbors;
	
	
	
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
	
	public Territory() {
		
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


	public List<Territory> getNeighbors() {
		return Neighbors;
	}

	public void setNeighbors(List<Territory> neighbors) {
		Neighbors = neighbors;
	}

	public Boolean isNeighboor(Territory territory) {

		if( 36  == territory.getId()){

			return true;

		} else {
			return false;
		}

	}

	
	
}
