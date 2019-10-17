package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiskJulesVerneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiskJulesVerneApplication.class, args);
		
		Renfort renfort = new Renfort();
		
		//------------Initialisation-------------
		
				// On crée 2 joueurs
				Player joueur1 = new Player();
				Player joueur2 = new Player();
				
				// On crée 11 Territoires (Continent : Les Terres Volcaniques)
				Territory lesPicsFumants = new Territory(0, "Les Pics Fumants", null, joueur2, 0);
				Territory leSanctuaireDuCourage = new Territory(0, "Le Sanctuaire du Courage", null, joueur2, 0);
				Territory laCreteDeGivrefeu = new Territory(0, "La Crête de Givrefeu", null, joueur2, 0);
				Territory laCitadelleDeFeu = new Territory(0, "La Citadelle de feu", null, joueur2, 0);
				Territory lesFlechesArdentes = new Territory(0, "Les Flèches ardentes", null, joueur2, 0);
				Territory laForgeDesAmes = new Territory(0, "La Forge des âmes", null, joueur2, 0);
				Territory leCratereInfernal = new Territory(0, "Le Cratère infernal", null, joueur2, 0);
				Territory lesSteppesArdentes = new Territory(0, "Les Steppes Ardentes", null, joueur2, 0);
				Territory lesRivagesBouillonnants = new Territory(0, "Les Rivages Bouillonnants", null, joueur2, 0);
				Territory leCoeurDeMagma = new Territory(0, "Le Coeur de magma", null, joueur2, 0);
				Territory laFournaise = new Territory(0, "La Fournaise", null, joueur2, 0);
				
				// On crée 7 Territoires (Continent : Les Terres Cristalisées)
				Territory laCitadelleDeGlace = new Territory(0, "La Citadelle de glace", null, joueur2, 0);
				Territory lesMillesPointes = new Territory(0, "Les Milles pointes", null, joueur2, 0);
				Territory lesPicsJumeaux = new Territory(0, "Les Pics jumeaux", null, joueur2, 0);
				Territory leCoeurDeCristal = new Territory(0, "Le Coeur de cristal", null, joueur2, 0);
				Territory lesTerresFoudroyees = new Territory(0, "Les Terres foudroyées", null, joueur2, 0);
				Territory lesTerresPourpre = new Territory(0, "Les Terres pourpre", null, joueur2, 0);
				Territory lesFlechesArgentees = new Territory(0, "Les Flèches argentées", null, joueur2, 0);

				// On crée 4 Territoires (Continent : La Champignoneuse)
				Territory leBoisDesChampsEternels = new Territory(0, "Le Bois des champs éternels", null, joueur2, 0);
				Territory laValeeChamporage = new Territory(0, "La Valée Champorage", null, joueur2, 0);
				Territory laClairiereFongique = new Territory(0, "La Clairière fongique", null, joueur2, 0);
				Territory laForetDesChampignonsGeants = new Territory(0, "La Fôret des champignons géants", null, joueur2, 0);

				// On crée 6 Territoires (Continent : Les Cavernes)
				Territory lesMortemines = new Territory(0, "Les Mortemines", null, joueur2, 0);
				Territory lesProfondeursRochenoires = new Territory(0, "Les Profondeurs Rochenoires", null, joueur2, 0);
				Territory leCoeurDePierre = new Territory(0, "Le Coeur de pierre", null, joueur2, 0);
				Territory laCaverneDesLamentations = new Territory(0, "La Caverne des lamentations", null, joueur2, 0);
				Territory laCrypteDesOublies = new Territory(0, "La Crypte des oubliés", null, joueur2, 0);
				Territory laFosseSombre = new Territory(0, "La Fosse Sombre", null, joueur2, 0);
				

				// On crée 4 Territoires (Continent : L'îlôt Axel)
				Territory leTempleEngloutit = new Territory(0, "Le Temple engloutit", null, joueur2, 0);
				Territory lIleDuTonnerre = new Territory(0, "L'Ile du Tonnerre", null, joueur2, 0);
				Territory lIleMysterieuse = new Territory(0, "L'Ile mysterieuse", null, joueur2, 0);
				Territory lIleDesGeants = new Territory(0, "L'Ile des géants", null, joueur2, 0);

				// On crée 6 Territoires (Continent : Les Marécages)
				Territory lesSombresMarecages = new Territory(0, "Les Sombres marécages", null, joueur2, 0);
				Territory lesRivagesBrises = new Territory(0, "Les Rivages brisés", null, joueur2, 0);
				Territory laTourbiere = new Territory(0, "La Tourbière", null, joueur2, 0);
				Territory lesTerresIngrates = new Territory(0, "Les Terres ingrates", null, joueur2, 0);
				Territory lesMaraisHurlant = new Territory(0, "Les Marais hurlant", null, joueur2, 0);
				Territory lesMaraisPourrisant = new Territory(0, "Les Marais pourrisant", null, joueur2, 0);
				Territory leBassinDesRegrets = new Territory(0, "Le Bassin des regrets", null, joueur2, 0);
				
				// On crée une collection d'objets Territory pour chaque Continent, un ArrayList
				ArrayList<Territory> listTerritoriesLesTerresVolcaniques = new ArrayList<Territory>();
				ArrayList<Territory> listTerritoriesLesTerresCristalisees = new ArrayList<Territory>();
				ArrayList<Territory> listTerritoriesLaChampignoneuse = new ArrayList<Territory>();
				ArrayList<Territory> listTerritoriesLesCavernes = new ArrayList<Territory>();
				ArrayList<Territory> listTerritoriesLIlotAxel = new ArrayList<Territory>();
				ArrayList<Territory> listTerritoriesLesMarecages = new ArrayList<Territory>();
				
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
				
				// Les Terres Cristalisées
				listTerritoriesLesTerresCristalisees.add(laCitadelleDeGlace);
				listTerritoriesLesTerresCristalisees.add(lesMillesPointes);
				listTerritoriesLesTerresCristalisees.add(lesPicsJumeaux);
				listTerritoriesLesTerresCristalisees.add(leCoeurDeCristal);
				listTerritoriesLesTerresCristalisees.add(lesTerresFoudroyees);
				listTerritoriesLesTerresCristalisees.add(lesTerresPourpre);
				listTerritoriesLesTerresCristalisees.add(lesFlechesArgentees);
				
				// La Champignoneuse
				listTerritoriesLaChampignoneuse.add(leBoisDesChampsEternels);
				listTerritoriesLaChampignoneuse.add(laValeeChamporage);
				listTerritoriesLaChampignoneuse.add(laClairiereFongique);
				listTerritoriesLaChampignoneuse.add(laForetDesChampignonsGeants);
				
				// Les Cavernes
				listTerritoriesLesCavernes.add(lesMortemines);
				listTerritoriesLesCavernes.add(lesProfondeursRochenoires);
				listTerritoriesLesCavernes.add(leCoeurDePierre);
				listTerritoriesLesCavernes.add(laCaverneDesLamentations);
				listTerritoriesLesCavernes.add(laCrypteDesOublies);
				listTerritoriesLesCavernes.add(laFosseSombre);
				
				// L'îlôt Axel
				listTerritoriesLIlotAxel.add(leTempleEngloutit);
				listTerritoriesLIlotAxel.add(lIleDuTonnerre);
				listTerritoriesLIlotAxel.add(lIleMysterieuse);
				listTerritoriesLIlotAxel.add(lIleDesGeants);
				
				// Les Marécages
				listTerritoriesLesMarecages.add(lesSombresMarecages);
				listTerritoriesLesMarecages.add(lesRivagesBrises);
				listTerritoriesLesMarecages.add(laTourbiere);
				listTerritoriesLesMarecages.add(lesTerresIngrates);
				listTerritoriesLesMarecages.add(lesMaraisHurlant);
				listTerritoriesLesMarecages.add(lesMaraisPourrisant);
				listTerritoriesLesMarecages.add(leBassinDesRegrets);		
				
				// On peux maintenant créer un Continent , avec son nom et sa Collection de territoires
				Continent lesTerresVolcaniques = new Continent(0, "Europe", listTerritoriesLesTerresVolcaniques);
				Continent lesTerresCristalisees = new Continent(0, "Europe", listTerritoriesLesTerresCristalisees);
				Continent laChampignoneuse = new Continent(0, "Europe", listTerritoriesLaChampignoneuse);
				Continent lesCavernes = new Continent(0, "Europe", listTerritoriesLesCavernes);
				Continent lIlotAxel = new Continent(0, "Europe", listTerritoriesLIlotAxel);
				Continent lesMarecages = new Continent(0, "Europe", listTerritoriesLesMarecages);
				

		

				joueur2.getContinentsPlayer().toString();
	}

}
