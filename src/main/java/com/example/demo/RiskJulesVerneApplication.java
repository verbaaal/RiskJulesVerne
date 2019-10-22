package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiskJulesVerneApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RiskJulesVerneApplication.class, args);
		
		// Init la classe Renfort (a voir pour la rendre static)
		Renfort renfort = new Renfort();
		
		/**
		 * TESTS
		 * Initialisation des Territories et Continents (en dur)
		 */
		// On crée 11 Territoires (Continent : Les Terres Volcaniques)
		Territory lesPicsFumants = new Territory("Les Pics Fumants");
		Territory leSanctuaireDuCourage = new Territory("Le Sanctuaire du Courage");
		Territory laCreteDeGivrefeu = new Territory("La Crête de Givrefeu");
		Territory laCitadelleDeFeu = new Territory("La Citadelle de feu");
		Territory lesFlechesArdentes = new Territory("Les Flèches ardentes");
		Territory laForgeDesAmes = new Territory("La Forge des âmes");
		Territory leCratereInfernal = new Territory("Le Cratère infernal");
		Territory lesSteppesArdentes = new Territory("Les Steppes Ardentes");
		Territory lesRivagesBouillonnants = new Territory("Les Rivages Bouillonnants");
		Territory leCoeurDeMagma = new Territory("Le Coeur de magma");
		Territory laFournaise = new Territory("La Fournaise");
		// On crée un ArrayList d'objets Territory pour chaque Continent, un ArrayList
		ArrayList<Territory> listTerritoriesLesTerresVolcaniques = new ArrayList<Territory>();
		// On ajoute les Territoires dans la liste de chaque Continent
		// Les Terres Volcaniques
		listTerritoriesLesTerresVolcaniques.add(lesPicsFumants);
		listTerritoriesLesTerresVolcaniques.add(leSanctuaireDuCourage);
		listTerritoriesLesTerresVolcaniques.add(laCreteDeGivrefeu);
		listTerritoriesLesTerresVolcaniques.add(laCitadelleDeFeu);
		listTerritoriesLesTerresVolcaniques.add(lesFlechesArdentes);
		listTerritoriesLesTerresVolcaniques.add(laForgeDesAmes);
		listTerritoriesLesTerresVolcaniques.add(leCratereInfernal);
		listTerritoriesLesTerresVolcaniques.add(lesSteppesArdentes);
		listTerritoriesLesTerresVolcaniques.add(lesRivagesBouillonnants);
		listTerritoriesLesTerresVolcaniques.add(leCoeurDeMagma);
		listTerritoriesLesTerresVolcaniques.add(laFournaise);
		
		// On crée 7 Territoires (Continent : Les Terres Cristalisées)
		Territory laCitadelleDeGlace = new Territory("La Citadelle de glace");
		Territory lesMillesPointes = new Territory("Les Milles pointes");
		Territory lesPicsJumeaux = new Territory("Les Pics jumeaux");
		Territory leCoeurDeCristal = new Territory("Le Coeur de cristal");
		Territory lesTerresFoudroyees = new Territory("Les Terres foudroyées");
		Territory lesTerresPourpre = new Territory("Les Terres pourpre");
		Territory lesFlechesArgentees = new Territory("Les Flèches argentées");
		// On crée un ArrayList d'objets Territory pour chaque Continent, un ArrayList
		ArrayList<Territory> listTerritoriesLesTerresCristalisees = new ArrayList<Territory>();
		// On ajoute les Territoires dans la liste de chaque Continent
		// Les Terres Cristalisées
		listTerritoriesLesTerresCristalisees.add(laCitadelleDeGlace);
		listTerritoriesLesTerresCristalisees.add(lesMillesPointes);
		listTerritoriesLesTerresCristalisees.add(lesPicsJumeaux);
		listTerritoriesLesTerresCristalisees.add(leCoeurDeCristal);
		listTerritoriesLesTerresCristalisees.add(lesTerresFoudroyees);
		listTerritoriesLesTerresCristalisees.add(lesTerresPourpre);
		listTerritoriesLesTerresCristalisees.add(lesFlechesArgentees);
		
		// On crée 4 Territoires (Continent : La Champignoneuse)
		Territory leBoisDesChampsEternels = new Territory("Le Bois des champs éternels");
		Territory laValeeChamporage = new Territory("La Valée Champorage");
		Territory laClairiereFongique = new Territory("La Clairière fongique");
		Territory laForetDesChampignonsGeants = new Territory("La Fôret des champignons géants");
		// On crée un ArrayList d'objets Territory pour chaque Continent, un ArrayList
		ArrayList<Territory> listTerritoriesLaChampignoneuse = new ArrayList<Territory>();
		// On ajoute les Territoires dans la liste de chaque Continent
		// La Champignoneuse
		listTerritoriesLaChampignoneuse.add(leBoisDesChampsEternels);
		listTerritoriesLaChampignoneuse.add(laValeeChamporage);
		listTerritoriesLaChampignoneuse.add(laClairiereFongique);
		listTerritoriesLaChampignoneuse.add(laForetDesChampignonsGeants);
		
		// On crée 6 Territoires (Continent : Les Cavernes)
		Territory lesMortemines = new Territory("Les Mortemines");
		Territory lesProfondeursRochenoires = new Territory("Les Profondeurs Rochenoires");
		Territory leCoeurDePierre = new Territory("Le Coeur de pierre");
		Territory laCaverneDesLamentations = new Territory("La Caverne des lamentations");
		Territory laCrypteDesOublies = new Territory("La Crypte des oubliés");
		Territory laFosseSombre = new Territory("La Fosse Sombre");
		// On crée un ArrayList d'objets Territory pour chaque Continent, un ArrayList
		ArrayList<Territory> listTerritoriesLesCavernes = new ArrayList<Territory>();
		// On ajoute les Territoires dans la liste de chaque Continent
		// Les Cavernes
		listTerritoriesLesCavernes.add(lesMortemines);
		listTerritoriesLesCavernes.add(lesProfondeursRochenoires);
		listTerritoriesLesCavernes.add(leCoeurDePierre);
		listTerritoriesLesCavernes.add(laCaverneDesLamentations);
		listTerritoriesLesCavernes.add(laCrypteDesOublies);
		listTerritoriesLesCavernes.add(laFosseSombre);
		
		// On crée 4 Territoires (Continent : L'îlôt Axel)
		Territory leTempleEngloutit = new Territory("Le Temple engloutit");
		Territory lIleDuTonnerre = new Territory("L'Ile du Tonnerre");
		Territory lIleMysterieuse = new Territory("L'Ile mysterieuse");
		Territory lIleDesGeants = new Territory("L'Ile des géants");
		// On crée un ArrayList d'objets Territory pour chaque Continent, un ArrayList
		ArrayList<Territory> listTerritoriesLIlotAxel = new ArrayList<Territory>();
		// On ajoute les Territoires dans la liste de chaque Continent
		// L'îlôt Axel
		listTerritoriesLIlotAxel.add(leTempleEngloutit);
		listTerritoriesLIlotAxel.add(lIleDuTonnerre);
		listTerritoriesLIlotAxel.add(lIleMysterieuse);
		listTerritoriesLIlotAxel.add(lIleDesGeants);
		
		// On crée 6 Territoires (Continent : Les Marécages)
		Territory lesSombresMarecages = new Territory("Les Sombres marécages");
		Territory lesRivagesBrises = new Territory("Les Rivages brisés");
		Territory laTourbiere = new Territory("La Tourbière");
		Territory lesTerresIngrates = new Territory("Les Terres ingrates");
		Territory lesMaraisHurlant = new Territory("Les Marais hurlant");
		Territory lesMaraisPourrisant = new Territory("Les Marais pourrisant");
		Territory leBassinDesRegrets = new Territory("Le Bassin des regrets");
		// On crée un ArrayList d'objets Territory pour chaque Continent, un ArrayList
		ArrayList<Territory> listTerritoriesLesMarecages = new ArrayList<Territory>();
		// On ajoute les Territoires dans la liste de chaque Continent
		// Les Marécages
		listTerritoriesLesMarecages.add(lesSombresMarecages);
		listTerritoriesLesMarecages.add(lesRivagesBrises);
		listTerritoriesLesMarecages.add(laTourbiere);
		listTerritoriesLesMarecages.add(lesTerresIngrates);
		listTerritoriesLesMarecages.add(lesMaraisHurlant);
		listTerritoriesLesMarecages.add(lesMaraisPourrisant);
		listTerritoriesLesMarecages.add(leBassinDesRegrets);		
		
		// ArrayList Continent qui contient la liste de ses territoires
		Continent lesTerresVolcaniques = new Continent("lesTerresVolcaniques", listTerritoriesLesTerresVolcaniques);
		Continent lesTerresCristalisees = new Continent("lesTerresCristalisees", listTerritoriesLesTerresCristalisees);
		Continent laChampignoneuse = new Continent("laChampignoneuse", listTerritoriesLaChampignoneuse);
		Continent lesCavernes = new Continent("lesCavernes", listTerritoriesLesCavernes);
		Continent lIlotAxel = new Continent("lIlotAxel", listTerritoriesLIlotAxel);
		Continent lesMarecages = new Continent("lesMarecages", listTerritoriesLesMarecages);
		
		// ArrayList des Continents du jeu
		ArrayList<Continent> continentsGame = new ArrayList<Continent>();
		continentsGame.add(lesTerresVolcaniques);
		continentsGame.add(lesTerresCristalisees);
		continentsGame.add(laChampignoneuse);
		continentsGame.add(lesCavernes);
		continentsGame.add(lIlotAxel);
		continentsGame.add(lesMarecages);
		
		// FIN INIT TERRITOIRE ET CONTINENT (en dur)
	
		/**
		 * On crée un joueur (en dur)
		 * Avec son ArrayList de Territoires, Continents et CardTerritory
		 */
		ArrayList <Territory> terrsPlayer1 = new ArrayList<Territory>();
		ArrayList<Continent> contsPlayer1 = new ArrayList<Continent>();
		ArrayList<CardTerritory> cardsTerrPlayer1 = new ArrayList<CardTerritory>();

		Player player1 = new Player("Alain","jaune",terrsPlayer1,contsPlayer1,cardsTerrPlayer1);
		
		// On ajoute des territoires au player1
		terrsPlayer1.add(lIleDesGeants);
		terrsPlayer1.add(lIleMysterieuse);
		terrsPlayer1.add(lIleDuTonnerre);
		terrsPlayer1.add(leTempleEngloutit);
			
		// Tests Methodes
		System.out.println(renfort.getNbrTerritoryPlayer(player1));
		player1.hasContinent(player1, continentsGame);
		System.out.println("Hello World");

 }
}