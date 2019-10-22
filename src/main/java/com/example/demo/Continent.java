package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "continent")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Continent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cont")
	private Integer id;
	@Column(name = "name_cont")
	private String name;
	@OneToMany(mappedBy="continent" )
	@JsonBackReference
	private List<Territory> territoriesCont;
	
	/**
	 * 
	 * constructeur
	 * 
	 * @param id
	 * @param name
	 * @param territoriesCont
	 */
	public Continent(Integer id, String name, ArrayList<Territory> territoriesCont) {
		super();
		this.id = id;
		this.name = name;
		this.territoriesCont = territoriesCont;
	}
	
	public Continent() {
		
	}

	@Override
	public String toString() {
		return "Continent [id=" + id + ", name=" + name + ", territoriesCont=" + territoriesCont + "]";
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

	public List<Territory> getTerritoriesCont() {
		return territoriesCont;
	}

	public void setTerritoriesCont(List<Territory> territoriesCont) {
		this.territoriesCont = territoriesCont;
	}

	/**
	 * @return the territoriesCont
	 */
	
}
