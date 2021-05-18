package metier;

import java.util.ArrayList;
import java.util.List;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Surclasser;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Terrain;
import util.Context;

public  class CreationBDD {

	public static void donneesBDD() {


		List<Sol> solDesert = new ArrayList();
		List<Sol> solMontagne = new ArrayList();
		List<Sol> solForet = new ArrayList();
		List<Sol> solVille = new ArrayList();
		List<Sol> solCircuit = new ArrayList();


		List<Meteo> meteoDesert = new ArrayList();
		List<Meteo> meteoMontagne = new ArrayList();
		List<Meteo> meteoForet = new ArrayList();
		List<Meteo> meteoVille = new ArrayList();
		List<Meteo> meteoCircuit = new ArrayList();

		List<NbDePlaces> placeDesert = new ArrayList();
		List<NbDePlaces> placeMontagne = new ArrayList();
		List<NbDePlaces> placeForet = new ArrayList();
		List<NbDePlaces> placeVille = new ArrayList();
		List<NbDePlaces> placeCircuit = new ArrayList();
		List<Surclasser> surclasser = new ArrayList();

		//DECLARATION SOL
		Sol glace= new Sol("Glace");
		Sol sable= new Sol("Sable");
		Sol terre= new Sol("Terre");
		Sol bitume= new Sol("Bitume");

		//LISTE SOLS DESERT
		solDesert.add(sable);
		solDesert.add(glace);
		//LISTE SOLS MONTAGNE
		solMontagne.add(terre);
		solMontagne.add(glace);
		solMontagne.add(bitume);
		//LISTE SOLS FORET
		solForet.add(terre);
		//LISTE SOLS VILLE
		solVille.add(glace);
		solVille.add(bitume);
		//LISTE SOLS CIRCUIT;
		solCircuit.add(glace);
		solCircuit.add(sable);
		solCircuit.add(terre);
		solCircuit.add(bitume);


		//DECLARATION METEO
		Meteo pluie = new Meteo("Pluie");
		Meteo brouillard = new Meteo("Brouillard");
		Meteo sec = new Meteo("Sec");




		//LISTE METEO DESERT
		meteoDesert.add(brouillard);
		meteoDesert.add(sec);
		//LISTE METEO MONTAGNE
		meteoMontagne.add(pluie);
		meteoMontagne.add(brouillard);
		meteoMontagne.add(sec);
		//LISTE METEO FORET
		meteoForet.add(pluie);
		meteoForet.add(brouillard);
		meteoForet.add(sec);

		//LISTE METEO VILLE
		meteoVille.add(pluie);
		meteoVille.add(sec);
		//LISTE METEO CIRCUIT;
		meteoCircuit.add(pluie);
		meteoCircuit.add(brouillard);
		meteoCircuit.add(sec);


		//DECLARATION PLACE
		//		NbDePlaces mono = new NbDePlaces("Mono");
		NbDePlaces duo = new NbDePlaces("Duo");
		NbDePlaces famille = new NbDePlaces("Famille");
		NbDePlaces tourisme = new NbDePlaces("Tourisme");

		//LISTE METEO DESERT
		placeDesert.add(duo);
		placeDesert.add(famille);
		placeDesert.add(tourisme);

		
		//LISTE METEO MONTAGNE
		placeMontagne.add(duo);
		placeMontagne.add(famille);
		placeMontagne.add(tourisme);

		//LISTE METEO FORET

		placeForet.add(duo);
		placeForet.add(famille);
		placeForet.add(tourisme);



		//LISTE METEO VILLE
		placeVille.add(duo);
		placeVille.add(famille);
		placeVille.add(tourisme);

		//LISTE METEO CIRCUIT;
		placeCircuit.add(duo);
		placeCircuit.add(famille);
		placeCircuit.add(tourisme);

		//DECLARATION OPTION

		Surclasser ecoPlus= new Surclasser("ecoPlus");
		Surclasser luxe= new Surclasser("luxe");
		Surclasser tuning = new Surclasser("tuning");

		surclasser.add(ecoPlus);
		surclasser.add(luxe);
		surclasser.add(tuning);


		//DECLARATION TERRAIN
		Terrain terrainDesert = new Terrain("/Images/d3.png",solDesert,meteoDesert,placeDesert,false, surclasser, "Desert");
		Terrain terrainMontagne = new Terrain("/Images/montagne2.png",  solMontagne,meteoMontagne,placeMontagne,false, surclasser,"Montagne");
		Terrain terrainForet = new Terrain("/Images/foret.jpg",solForet,meteoForet,placeForet,false, surclasser, "Forêt");
		Terrain terrainVille= new Terrain("/Images/ville.jpg",solVille,meteoVille,placeVille,false, surclasser, "Ville");
		Terrain terrainCircuit = new Terrain("/Images/circuit.jpg", solCircuit,meteoCircuit,placeCircuit,false, surclasser, "Circuit");




		//SAUVEGARDE TERRAIN DANS BDD
		Context.getInstance().getDaoT().save(terrainDesert);
		Context.getInstance().getDaoT().save(terrainMontagne);
		Context.getInstance().getDaoT().save(terrainForet);
		Context.getInstance().getDaoT().save(terrainVille);
		Context.getInstance().getDaoT().save(terrainCircuit);


		//DECLARATION PIECE 

		PneuBDD.donneePneuBDD();
		ChassisBDD.donneeChassisBDD();
		FreinBDD.donneeFreinBDD();
		PhareBDD.donneePhareBDD();
		SuspensionBDD.donneeSuspensionBDD();
		MoteurBDD.donneeMoteurBDD();




	}

}
