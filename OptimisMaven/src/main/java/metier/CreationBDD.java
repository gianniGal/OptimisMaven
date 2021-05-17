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
		List<Sol> solSavane = new ArrayList();
		List<Sol> solVille = new ArrayList();
		List<Sol> solCircuit = new ArrayList();

		
		List<Meteo> meteoDesert = new ArrayList();
		List<Meteo> meteoMontagne = new ArrayList();
		List<Meteo> meteoForet = new ArrayList();
		List<Meteo> meteoSavane = new ArrayList();
		List<Meteo> meteoVille = new ArrayList();
		List<Meteo> meteoCircuit = new ArrayList();
		
		List<NbDePlaces> placeDesert = new ArrayList();
		List<NbDePlaces> placeMontagne = new ArrayList();
		List<NbDePlaces> placeForet = new ArrayList();
		List<NbDePlaces> placeSavane = new ArrayList();
		List<NbDePlaces> placeVille = new ArrayList();
		List<NbDePlaces> placeCircuit = new ArrayList();
		List<Surclasser> surclasser = new ArrayList();
		
		//DECLARATION SOL
		Sol boue= new Sol("Boue");
		Sol glace= new Sol("Glace");
		Sol sable= new Sol("Sable");
		Sol terre= new Sol("Terre");
		Sol neige= new Sol("Neige");
		Sol route= new Sol("Route");
		
		//LISTE SOLS DESERT
		solDesert.add(sable);
		solDesert.add(glace);
		//LISTE SOLS MONTAGNE
		solMontagne.add(terre);
		solMontagne.add(neige);
		solMontagne.add(route);
		//LISTE SOLS FORET
		solForet.add(boue);
		solForet.add(terre);
		//LISTE SOLS SAVANE;
		solSavane.add(boue);
		solSavane.add(terre);
		//LISTE SOLS VILLE
		solVille.add(neige);
		solVille.add(route);
		//LISTE SOLS CIRCUIT;
		solCircuit.add(boue);
		solCircuit.add(glace);
		solCircuit.add(sable);
		solCircuit.add(terre);
		solCircuit.add(neige);
		solCircuit.add(route);
		
	
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
		//LISTE METEO SAVANE;
		meteoSavane.add(pluie);
		meteoSavane.add(brouillard);
		meteoSavane.add(sec);
		//LISTE METEO VILLE
		meteoVille.add(pluie);
		meteoVille.add(sec);
		//LISTE METEO CIRCUIT;
		meteoCircuit.add(pluie);
		meteoCircuit.add(brouillard);
		meteoCircuit.add(sec);


		//DECLARATION PLACE
		NbDePlaces mono = new NbDePlaces("Mono");
		NbDePlaces duo = new NbDePlaces("Duo");
		NbDePlaces famille = new NbDePlaces("Famille");
		NbDePlaces tourisme = new NbDePlaces("Tourisme");
		
		//LISTE METEO DESERT
		placeDesert.add(mono);
		placeDesert.add(duo);
		placeDesert.add(famille);
		placeDesert.add(tourisme);
		
		
		//LISTE METEO MONTAGNE
		placeMontagne.add(mono);
		placeMontagne.add(duo);
		placeMontagne.add(famille);
		placeMontagne.add(tourisme);
		
		//LISTE METEO FORET
		placeForet.add(mono);
		placeForet.add(duo);
		placeForet.add(famille);
		placeForet.add(tourisme);
		
		//LISTE METEO SAVANE;
		placeSavane.add(mono);
		placeSavane.add(duo);
		placeSavane.add(famille);
		placeSavane.add(tourisme);
		
		//LISTE METEO VILLE
		placeVille.add(mono);
		placeVille.add(duo);
		placeVille.add(famille);
		placeVille.add(tourisme);
		
		//LISTE METEO CIRCUIT;
		placeCircuit.add(mono);
		placeCircuit.add(duo);
		placeCircuit.add(famille);
		placeCircuit.add(tourisme);
		
		//DECLARATION OPTION
		
				Surclasser luxe= new Surclasser("luxe");
				Surclasser tuning = new Surclasser("tuning");
				
				surclasser.add(luxe);
				surclasser.add(tuning);
		
		
		//DECLARATION TERRAIN
		Terrain terrainDesert = new Terrain("/Images/d3.png",solDesert,meteoDesert,placeDesert,false, surclasser);
		Terrain terrainMontagne = new Terrain("/Images/montagne2.png",  solMontagne,meteoMontagne,placeMontagne,false, surclasser);
		Terrain terrainForet = new Terrain("/Images/d3.png",solForet,meteoForet,placeForet,false, surclasser);
		Terrain terrainSavane = new Terrain("/Images/montagne2.png", solSavane,meteoSavane,placeSavane,false, surclasser);
		Terrain terrainVille= new Terrain("/Images/d3.png",solVille,meteoVille,placeVille,false, surclasser);
		Terrain terrainCircuit = new Terrain("/Images/montagne2.png", solCircuit,meteoCircuit,placeCircuit,false, surclasser);
		
		Terrain terrainCircuitCourse = new Terrain("/Images/montagne2.png", solCircuit,meteoCircuit,placeCircuit,true, surclasser);
		
		
		
		//SAUVEGARDE TERRAIN DANS BDD
		Context.getInstance().getDaoT().save(terrainDesert);
		Context.getInstance().getDaoT().save(terrainMontagne);
		Context.getInstance().getDaoT().save(terrainForet);
		Context.getInstance().getDaoT().save(terrainSavane);
		Context.getInstance().getDaoT().save(terrainVille);
		Context.getInstance().getDaoT().save(terrainCircuit);
		Context.getInstance().getDaoT().save(terrainCircuitCourse);
		
		
		
	    //DECLARATION PIECE 
		Piece pneuBoue = new Piece("pneu",4500,boue, null,null,false,null,"/Images/pneuBoue.jpg");
		Piece pneuGlace = new Piece("pneu",4500,glace, null,null,false,null,"/Images/pneuGlace.jpg");
		Piece pneuSable = new Piece("pneu",4500,sable, null,null,false,null,"/Images/pneuSable.jpg");
		Piece pneuTerre = new Piece("pneu",4500,terre, null,null,false,null,"/Images/pneuTerre.jpg");
		Piece pneuNeige = new Piece("pneu",4500,neige, null,null,false,null,"/Images/pneuNeige.jpg");
		Piece pneuRouteSec = new Piece("pneu",4500,route, sec,null,false,null,"/Images/pneuEte.jpg");
		Piece pneuRoutePluie = new Piece("pneu",4500,route, pluie,null,false,null,"/Images/pneuHiver.jpg");
		Piece pneuNull = new Piece("pneu",4500,null, null,null,false,null,"/Images/pneuBoue.jpg");
		
//		Piece freinSport = new Piece("frein",4500,null, null,null,true,null,"/Images/freinBoue.jpg");
//		Piece freinClassic = new Piece("frein",4500,null, null,null,false,null,"/Images/freinGlace.jpg");
//
//		
//		Piece moteurSport = new Piece("moteur",4500,null, null,null,true,null,"/Images/moteurBoue.jpg");
		Piece moteurClassic = new Piece("moteur",4500,null, null,null,false,null,"/Images/moteurClassic.jpg");
		Piece moteurSable = new Piece("moteur",4500,sable, null,null,false,null,"/Images/moteurSableNeige.jpg");
		Piece moteurNeige = new Piece("moteur",4500,neige, null,null,false,null,"/Images/moteurSableNeige.jpg");
//		Piece moteurBoue = new Piece("moteur",4500,boue, null,null,false,null,"/Images/moteurBoue.jpg");
//		Piece moteurGlace = new Piece("moteur",4500,glace, null,null,false,null,"/Images/moteurGlace.jpg");
//		Piece moteurTerre = new Piece("moteur",4500,terre, null,null,false,null,"/Images/moteurTerre.jpg");
//		Piece moteurRouteSec = new Piece("moteur",4500,route, null,null,false,null,"/Images/moteurEte.jpg");
//		
	  
//		Piece chassisBoue = new Piece("chassis",4500,boue, null,null,"/Images/chassisBoue.jpg");
//		Piece chassisGlace = new Piece("chassis",4500,glace, null,null,"/Images/chassisGlace.jpg");
//		Piece chassisSable = new Piece("chassis",4500,sable, null,null,"/Images/chassisSable.jpg");
//		Piece chassisTerre = new Piece("chassis",4500,terre, null,null,"/Images/chassisTerre.jpg");
//		Piece chassisNeige = new Piece("chassis",4500,neige, null,null,"/Images/chassisNeige.jpg");
//		Piece chassisRouteSec = new Piece("chassis",4500,route, sec,null,"/Images/chassisEte.jpg");
//		Piece chassisRoutePluie = new Piece("chassis",4500,route, pluie,null,"/Images/chassisHiver.jpg");
//		
		//SAUVEGARDE PIECE PNEU
		Context.getInstance().getDaoP().save(pneuBoue);
		Context.getInstance().getDaoP().save(pneuGlace);
		Context.getInstance().getDaoP().save(pneuSable);
		Context.getInstance().getDaoP().save(pneuTerre);
		Context.getInstance().getDaoP().save(pneuNeige);
		Context.getInstance().getDaoP().save(pneuRouteSec);
		Context.getInstance().getDaoP().save(pneuRoutePluie);
		Context.getInstance().getDaoP().save(pneuNull);
		
		//SAUVEGARDE PIECE MOTEUR
//		Context.getInstance().getDaoP().save(moteurSport);
		Context.getInstance().getDaoP().save(moteurClassic);
		Context.getInstance().getDaoP().save(moteurSable);
		Context.getInstance().getDaoP().save(moteurNeige);
//		Context.getInstance().getDaoP().save(moteurBoue);
//		Context.getInstance().getDaoP().save(pneuRouteSec);
//		Context.getInstance().getDaoP().save(pneuRoutePluie);
//		Context.getInstance().getDaoP().save(pneuNull);
		
	}

}
