package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import frame.Application;
import metier.CreationBDD;
import metier.Piece;
import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Terrain;
import util.Context;


public class optimiz {



//	public static String saisieString(String msg) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		return sc.nextLine();
//	}
//
//	public static int saisieInt(String msg) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		return sc.nextInt();
//	}
//
//	public static double saisieDouble(String msg) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		return sc.nextDouble();
//	}
//
//	public static boolean saisieBoolean(String msg) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println(msg);
//		return sc.nextBoolean();
//	}


	public static void main(String[] args) {

		CreationBDD.donneesBDD();
		Application.main(new String[]{});

	}

}
