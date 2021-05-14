package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.DAOClient;

import dao.DAOVehicule;

import frame.*;
import metier.FiltresTerrain.* ;
import util.Context;
import metier.*;


public class optimiz {
	
	

	public static String saisieString(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}

	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextInt();
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextDouble();
	}

	public static boolean saisieBoolean(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextBoolean();
	}


//	static DAOClient daoClient = Context.get_instance().getDaoC();
	
	public static void main(String[] args) {
		
		
//		daoClient.insert(c);
		
		/// Choix des environnement;
		
	
//		Terrain circuit1 = new Terrain ();
//		boolean course = false;
//		Sol sol = Sol.Route;
//		TpsDeVoyage dureeVoyage  = TpsDeVoyage.Weekend;
//		NbDePlaces nombrePlace = NbDePlaces.Mono;
//		boolean animaux = false;
//		boolean conflit = false;
//		boolean luminosite = false;
//		
		List<Terrain> terrains= new ArrayList();
		List<Sol> sols = new ArrayList();
		List<Meteo> meteos = new ArrayList();
		
		sols.add(Sol.Boue);
		sols.add(Sol.Glace);
		meteos.add(Meteo.Pluie);
		meteos.add(Meteo.Sec);
		meteos.add(Meteo.Brouillard);
		Terrain terrain = new Terrain(false,"/Images/d3.png",sols,meteos,NbDePlaces.Mono);
		Terrain terrain2 = new Terrain(false, "/Images/montagne2.png", sols,meteos,NbDePlaces.Mono);
		terrains.add(terrain);
		terrains.add(terrain2);
		Piece piece = new Piece("pneu",4500,terrains);
		Context.getInstance().getDaoP().save(piece);

		Application.main(new String[]{});
//		Terrain  circuit1 = null;
//		circuit1 = EnvironnementFrame.EnvironnementFrame();
//		
//		Terrain  circuit1 = new Circuit(course,luminosite,sol,dureeVoyage,nombrePlace,animaux,conflit);
		
		
//		
//		System.out.println(daoVehicule.optimizedcar(circuit1));
//		
//		Context.get_instance().getEmf().close();
		

	}

}
