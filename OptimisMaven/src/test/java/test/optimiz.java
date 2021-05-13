package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
