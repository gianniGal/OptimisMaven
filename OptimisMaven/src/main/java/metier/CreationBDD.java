package metier;

import java.util.ArrayList;
import java.util.List;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
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
		
		
		//DECLARATION TERRAIN
		Terrain terrainDesert = new Terrain("/Images/d3.png",false,solDesert,meteoDesert,placeDesert);
		Terrain terrainMontagne = new Terrain("/Images/montagne2.png", false, solMontagne,meteoMontagne,placeMontagne);
		Terrain terrainForet = new Terrain("/Images/d3.png",false,solForet,meteoForet,placeForet);
		Terrain terrainSavane = new Terrain("/Images/montagne2.png", false, solSavane,meteoSavane,placeSavane);
		Terrain terrainVille= new Terrain("/Images/d3.png",false,solVille,meteoVille,placeVille);
		Terrain terrainCircuit = new Terrain("/Images/montagne2.png", false, solCircuit,meteoCircuit,placeCircuit);
		
		//SAUVEGARDE TERRAIN DANS BDD
		Context.getInstance().getDaoT().save(terrainDesert);
		Context.getInstance().getDaoT().save(terrainMontagne);
		Context.getInstance().getDaoT().save(terrainForet);
		Context.getInstance().getDaoT().save(terrainSavane);
		Context.getInstance().getDaoT().save(terrainVille);
		Context.getInstance().getDaoT().save(terrainCircuit);
		
	    //DECLARATION PIECE 
		Piece pneuBoue = new Piece("pneu",4500,boue, null,null,"/Images/pneuBoue.jpg");
		Piece pneuGlace = new Piece("pneu",4500,glace, null,null,"/Images/pneuGlace.jpg");
		Piece pneuSable = new Piece("pneu",4500,sable, null,null,"/Images/pneuSable.jpg");
		Piece pneuTerre = new Piece("pneu",4500,terre, null,null,"/Images/pneuTerre.jpg");
		Piece pneuNeige = new Piece("pneu",4500,neige, null,null,"/Images/pneuNeige.jpg");
		Piece pneuRouteSec = new Piece("pneu",4500,route, sec,null,"/Images/pneuEte.jpg");
		Piece pneuRoutePluie = new Piece("pneu",4500,route, pluie,null,"/Images/pneuHiver.jpg");
		
	  
//		Piece chassisBoue = new Piece("chassis",4500,boue, null,null,"/Images/chassisBoue.jpg");
//		Piece chassisGlace = new Piece("chassis",4500,glace, null,null,"/Images/chassisGlace.jpg");
//		Piece chassisSable = new Piece("chassis",4500,sable, null,null,"/Images/chassisSable.jpg");
//		Piece chassisTerre = new Piece("chassis",4500,terre, null,null,"/Images/chassisTerre.jpg");
//		Piece chassisNeige = new Piece("chassis",4500,neige, null,null,"/Images/chassisNeige.jpg");
//		Piece chassisRouteSec = new Piece("chassis",4500,route, sec,null,"/Images/chassisEte.jpg");
//		Piece chassisRoutePluie = new Piece("chassis",4500,route, pluie,null,"/Images/chassisHiver.jpg");
//		
		//AUVEGARDE PIECE DANS BDD
		Context.getInstance().getDaoP().save(pneuBoue);
		Context.getInstance().getDaoP().save(pneuGlace);
		Context.getInstance().getDaoP().save(pneuSable);
		Context.getInstance().getDaoP().save(pneuTerre);
		Context.getInstance().getDaoP().save(pneuNeige);
		Context.getInstance().getDaoP().save(pneuRouteSec);
		Context.getInstance().getDaoP().save(pneuRoutePluie);
	}

}
