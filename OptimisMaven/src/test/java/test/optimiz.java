package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import frame.Application;
import metier.Piece;
import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Terrain;
import util.Context;


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
//		List<Terrain> terrains= new ArrayList();
//		List<Terrain> terrainDesert = new ArrayList();
//		
		List<Sol> solDesert = new ArrayList();
		List<Sol> solMontagne = new ArrayList();
		List<Meteo> meteoDesert = new ArrayList();
		List<Meteo> meteoMontagne = new ArrayList();
		
		Sol sol1= new Sol("Boue");
		Sol sol2= new Sol("Glace");
		Sol sol3= new Sol("Sable");
		Sol sol4= new Sol("Terre");
		Sol sol5= new Sol("Neige");
		Sol sol6= new Sol("Route");
		
		
		solDesert.add(sol2);
		solDesert.add(sol3);
		solMontagne.add(sol4);
		solMontagne.add(sol5);
		solMontagne.add(sol6);
	
		Meteo met1 = new Meteo("Pluie");
		Meteo met2 = new Meteo("Brouillard");
		Meteo met3 = new Meteo("Sec");
		
	
		meteoDesert.add(met2);
		meteoDesert.add(met3);
		
		meteoMontagne.add(met1);
		meteoMontagne.add(met2);
		meteoMontagne.add(met3);

		Terrain terrain = new Terrain("/Images/d3.png",false,solDesert,meteoDesert,NbDePlaces.Mono);
		Terrain terrain2 = new Terrain("/Images/montagne2.png", false, solMontagne,meteoMontagne,NbDePlaces.Mono);
		
		Context.getInstance().getDaoT().save(terrain);
		Context.getInstance().getDaoT().save(terrain2);
		
//		terrainDesert.add(terrain);
//		terrains.add(terrain2);
//		
		Piece piece = new Piece("pneu",4500,sol3, met3,"/Images/pneuEte.jpg");
		Piece piece2 = new Piece("pneu", 6000, sol5, met2, "/Images/pneuNeige.png");
		
		
		
		
		
		Context.getInstance().getDaoP().save(piece);
		Context.getInstance().getDaoP().save(piece2);

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
