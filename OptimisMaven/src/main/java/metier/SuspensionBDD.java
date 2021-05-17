package metier;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;

public class SuspensionBDD {
	
	public static void donneesuspensionBDD() {
		
		//DECLARATION SOL
//		Sol boue= new Sol("Boue");
		Sol glace= new Sol("Glace");
		Sol sable= new Sol("Sable");
		Sol terre= new Sol("Terre");
//		Sol neige= new Sol("Neige");
		Sol bitume= new Sol("Bitume");
		
		//DECLARATION METEO
		Meteo pluie = new Meteo("Pluie");
		Meteo brouillard = new Meteo("Brouillard");
		Meteo sec = new Meteo("Sec");
		
		//DECLARATION PLACE
//		NbDePlaces mono = new NbDePlaces("Mono");
		NbDePlaces duo = new NbDePlaces("Duo");
		NbDePlaces famille = new NbDePlaces("Famille");
		NbDePlaces tourisme = new NbDePlaces("Tourisme");
		
		
	    Surclasser ecoPlus= new Surclasser("ecoPlus");
		Surclasser luxe= new Surclasser("luxe");
		Surclasser tuning = new Surclasser("tuning");
		
		Piece suspensionterre1 = new Piece("suspension",400,terre, pluie,duo,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre2 = new Piece("suspension",1000,terre, pluie,duo,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre3 = new Piece("suspension",650,terre, pluie,duo,false,tuning,"/Images/suspensionSport.jpg");
		
		Piece suspensionterre4 = new Piece("suspension",400,terre, pluie,duo,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre5 = new Piece("suspension",1000,terre, pluie,duo,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre6 = new Piece("suspension",650,terre, pluie,duo,true,tuning,"/Images/suspensionSport.jpg");
		
		Piece suspensionterre7 = new Piece("suspension",400,terre, pluie,famille,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre8 = new Piece("suspension",1000,terre, pluie,famille,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre9 = new Piece("suspension",650,terre, pluie,famille,false,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre10 = new Piece("suspension",400,terre, pluie,famille,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre11 = new Piece("suspension",1000,terre, pluie,famille,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre12 = new Piece("suspension",650,terre, pluie,famille,true,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre13 = new Piece("suspension",400,terre, pluie,tourisme,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre14 = new Piece("suspension",1000,terre, pluie,tourisme,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre15 = new Piece("suspension",650,terre, pluie,tourisme,false,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre16 = new Piece("suspension",400,terre, pluie,tourisme,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre17 = new Piece("suspension",1000,terre, pluie,tourisme,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre18 = new Piece("suspension",650,terre, pluie,tourisme,true,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre19 = new Piece("suspension",400,terre, sec,duo,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre20 = new Piece("suspension",1000,terre, sec,duo,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre21 = new Piece("suspension",650,terre, sec,duo,false,tuning,"/Images/suspensionSport.jpg");
		
		Piece suspensionterre22 = new Piece("suspension",400,terre, sec,duo,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre23 = new Piece("suspension",1000,terre, sec,duo,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre24 = new Piece("suspension",650,terre, sec,duo,true,tuning,"/Images/suspensionSport.jpg");
		
		Piece suspensionterre25 = new Piece("suspension",400,terre, sec,famille,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre26 = new Piece("suspension",1000,terre, sec,famille,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre27 = new Piece("suspension",650,terre, sec,famille,false,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre28 = new Piece("suspension",400,terre, sec,famille,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre29 = new Piece("suspension",1000,terre, sec,famille,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre30 = new Piece("suspension",650,terre, sec,famille,true,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre31 = new Piece("suspension",400,terre, sec,tourisme,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre32 = new Piece("suspension",1000,terre, sec,tourisme,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre33 = new Piece("suspension",650,terre, sec,tourisme,false,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre34 = new Piece("suspension",400,terre, sec,tourisme,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre35 = new Piece("suspension",1000,terre, sec,tourisme,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre36 = new Piece("suspension",650,terre, sec,tourisme,true,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre37 = new Piece("suspension",400,terre, brouillard,duo,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre38 = new Piece("suspension",1000,terre, brouillard,duo,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre39 = new Piece("suspension",650,terre, brouillard,duo,false,tuning,"/Images/suspensionSport.jpg");
		
		Piece suspensionterre40 = new Piece("suspension",400,terre, brouillard,duo,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre41 = new Piece("suspension",1000,terre, brouillard,duo,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre42 = new Piece("suspension",650,terre, brouillard,duo,true,tuning,"/Images/suspensionSport.jpg");
		
		Piece suspensionterre43 = new Piece("suspension",400,terre, brouillard,famille,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre44 = new Piece("suspension",1000,terre, brouillard,famille,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre45 = new Piece("suspension",650,terre, brouillard,famille,false,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre46 = new Piece("suspension",400,terre, brouillard,famille,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre47 = new Piece("suspension",1000,terre, brouillard,famille,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre48 = new Piece("suspension",650,terre, brouillard,famille,true,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre49 = new Piece("suspension",400,terre, brouillard,tourisme,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre50 = new Piece("suspension",1000,terre, brouillard,tourisme,false,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre51 = new Piece("suspension",650,terre, brouillard,tourisme,false,tuning,"/Images/suspensionSport.jpg"); 
		
		Piece suspensionterre52 = new Piece("suspension",400,terre, brouillard,tourisme,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionterre53 = new Piece("suspension",1000,terre, brouillard,tourisme,true,luxe,"/Images/suspensionAdaptative.jpg");
		Piece suspensionterre54 = new Piece("suspension",650,terre, brouillard,tourisme,true,tuning,"/Images/suspensionSport.jpg"); 
		
		Context.getInstance().getDaoP().save(suspensionterre1);
		Context.getInstance().getDaoP().save(suspensionterre2);
		Context.getInstance().getDaoP().save(suspensionterre3);
		Context.getInstance().getDaoP().save(suspensionterre4);
		Context.getInstance().getDaoP().save(suspensionterre5);
		Context.getInstance().getDaoP().save(suspensionterre6);
		Context.getInstance().getDaoP().save(suspensionterre7);
		Context.getInstance().getDaoP().save(suspensionterre8);
		Context.getInstance().getDaoP().save(suspensionterre9);
		Context.getInstance().getDaoP().save(suspensionterre10);
		Context.getInstance().getDaoP().save(suspensionterre11);
		Context.getInstance().getDaoP().save(suspensionterre12);
		Context.getInstance().getDaoP().save(suspensionterre13);
		Context.getInstance().getDaoP().save(suspensionterre14);
		Context.getInstance().getDaoP().save(suspensionterre15);
		Context.getInstance().getDaoP().save(suspensionterre16);
		Context.getInstance().getDaoP().save(suspensionterre17);
		Context.getInstance().getDaoP().save(suspensionterre18);
		Context.getInstance().getDaoP().save(suspensionterre19);
		Context.getInstance().getDaoP().save(suspensionterre20);
		Context.getInstance().getDaoP().save(suspensionterre21);
		Context.getInstance().getDaoP().save(suspensionterre22);
		Context.getInstance().getDaoP().save(suspensionterre23);
		Context.getInstance().getDaoP().save(suspensionterre24);
		Context.getInstance().getDaoP().save(suspensionterre25);
		Context.getInstance().getDaoP().save(suspensionterre26);
		Context.getInstance().getDaoP().save(suspensionterre27);
		Context.getInstance().getDaoP().save(suspensionterre28);
		Context.getInstance().getDaoP().save(suspensionterre29);
		Context.getInstance().getDaoP().save(suspensionterre30);
		Context.getInstance().getDaoP().save(suspensionterre31);
		Context.getInstance().getDaoP().save(suspensionterre32);
		Context.getInstance().getDaoP().save(suspensionterre33);
		Context.getInstance().getDaoP().save(suspensionterre34);
		Context.getInstance().getDaoP().save(suspensionterre35);
		Context.getInstance().getDaoP().save(suspensionterre36);
		Context.getInstance().getDaoP().save(suspensionterre37);
		Context.getInstance().getDaoP().save(suspensionterre38);
		Context.getInstance().getDaoP().save(suspensionterre39);
		Context.getInstance().getDaoP().save(suspensionterre40);
		Context.getInstance().getDaoP().save(suspensionterre41);
		Context.getInstance().getDaoP().save(suspensionterre42);
		Context.getInstance().getDaoP().save(suspensionterre43);
		Context.getInstance().getDaoP().save(suspensionterre44);
		Context.getInstance().getDaoP().save(suspensionterre45);
		Context.getInstance().getDaoP().save(suspensionterre46);
		Context.getInstance().getDaoP().save(suspensionterre47);
		Context.getInstance().getDaoP().save(suspensionterre48);
		Context.getInstance().getDaoP().save(suspensionterre49);
		Context.getInstance().getDaoP().save(suspensionterre50);
		Context.getInstance().getDaoP().save(suspensionterre51);
		Context.getInstance().getDaoP().save(suspensionterre52);
		Context.getInstance().getDaoP().save(suspensionterre53);
		Context.getInstance().getDaoP().save(suspensionterre54);

		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece suspensionsable1 = new Piece("suspension",400,sable, pluie,duo,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable2 = new Piece("suspension",1000,sable, pluie,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable3 = new Piece("suspension",500,sable, pluie,duo,false,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionsable4 = new Piece("suspension",400,sable, pluie,duo,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable5 = new Piece("suspension",1000,sable, pluie,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable6 = new Piece("suspension",650,sable, pluie,duo,true,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionsable7 = new Piece("suspension",400,sable, pluie,famille,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable8 = new Piece("suspension",1000,sable, pluie,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable9 = new Piece("suspension",650,sable, pluie,famille,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable10 = new Piece("suspension",400,sable, pluie,famille,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable11 = new Piece("suspension",1000,sable, pluie,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable12 = new Piece("suspension",650,sable, pluie,famille,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable13 = new Piece("suspension",400,sable, pluie,tourisme,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable14 = new Piece("suspension",1000,sable, pluie,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable15 = new Piece("suspension",650,sable, pluie,tourisme,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable16 = new Piece("suspension",400,sable, pluie,tourisme,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable17 = new Piece("suspension",1000,sable, pluie,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable18 = new Piece("suspension",650,sable, pluie,tourisme,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable19 = new Piece("suspension",400,sable, sec,duo,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable20 = new Piece("suspension",1000,sable, sec,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable21 = new Piece("suspension",650,sable, sec,duo,false,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionsable22 = new Piece("suspension",400,sable, sec,duo,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable23 = new Piece("suspension",1000,sable, sec,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable24 = new Piece("suspension",650,sable, sec,duo,true,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionsable25 = new Piece("suspension",400,sable, sec,famille,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable26 = new Piece("suspension",1000,sable, sec,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable27 = new Piece("suspension",650,sable, sec,famille,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable28 = new Piece("suspension",400,sable, sec,famille,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable29 = new Piece("suspension",1000,sable, sec,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable30 = new Piece("suspension",650,sable, sec,famille,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable31 = new Piece("suspension",400,sable, sec,tourisme,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable32 = new Piece("suspension",1000,sable, sec,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable33 = new Piece("suspension",650,sable, sec,tourisme,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable34 = new Piece("suspension",400,sable, sec,tourisme,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable35 = new Piece("suspension",1000,sable, sec,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable36 = new Piece("suspension",650,sable, sec,tourisme,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable37 = new Piece("suspension",400,sable, brouillard,duo,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable38 = new Piece("suspension",1000,sable, brouillard,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable39 = new Piece("suspension",650,sable, brouillard,duo,false,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionsable40 = new Piece("suspension",400,sable, brouillard,duo,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable41 = new Piece("suspension",1000,sable, brouillard,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable42 = new Piece("suspension",650,sable, brouillard,duo,true,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionsable43 = new Piece("suspension",400,sable, brouillard,famille,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable44 = new Piece("suspension",1000,sable, brouillard,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable45 = new Piece("suspension",650,sable, brouillard,famille,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable46 = new Piece("suspension",400,sable, brouillard,famille,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable47 = new Piece("suspension",1000,sable, brouillard,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable48 = new Piece("suspension",650,sable, brouillard,famille,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable49 = new Piece("suspension",400,sable, brouillard,tourisme,false,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable50 = new Piece("suspension",1000,sable, brouillard,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable51 = new Piece("suspension",650,sable, brouillard,tourisme,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionsable52 = new Piece("suspension",400,sable, brouillard,tourisme,true,ecoPlus,"/Images/suspensionRouteBerlin.jpg");
		Piece suspensionsable53 = new Piece("suspension",1000,sable, brouillard,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionsable54 = new Piece("suspension",650,sable, brouillard,tourisme,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		
		Context.getInstance().getDaoP().save(suspensionsable1);
		Context.getInstance().getDaoP().save(suspensionsable2);
		Context.getInstance().getDaoP().save(suspensionsable3);
		Context.getInstance().getDaoP().save(suspensionsable4);
		Context.getInstance().getDaoP().save(suspensionsable5);
		Context.getInstance().getDaoP().save(suspensionsable6);
		Context.getInstance().getDaoP().save(suspensionsable7);
		Context.getInstance().getDaoP().save(suspensionsable8);
		Context.getInstance().getDaoP().save(suspensionsable9);
		Context.getInstance().getDaoP().save(suspensionsable10);
		Context.getInstance().getDaoP().save(suspensionsable11);
		Context.getInstance().getDaoP().save(suspensionsable12);
		Context.getInstance().getDaoP().save(suspensionsable13);
		Context.getInstance().getDaoP().save(suspensionsable14);
		Context.getInstance().getDaoP().save(suspensionsable15);
		Context.getInstance().getDaoP().save(suspensionsable16);
		Context.getInstance().getDaoP().save(suspensionsable17);
		Context.getInstance().getDaoP().save(suspensionsable18);
		Context.getInstance().getDaoP().save(suspensionsable19);
		Context.getInstance().getDaoP().save(suspensionsable20);
		Context.getInstance().getDaoP().save(suspensionsable21);
		Context.getInstance().getDaoP().save(suspensionsable22);
		Context.getInstance().getDaoP().save(suspensionsable23);
		Context.getInstance().getDaoP().save(suspensionsable24);
		Context.getInstance().getDaoP().save(suspensionsable25);
		Context.getInstance().getDaoP().save(suspensionsable26);
		Context.getInstance().getDaoP().save(suspensionsable27);
		Context.getInstance().getDaoP().save(suspensionsable28);
		Context.getInstance().getDaoP().save(suspensionsable29);
		Context.getInstance().getDaoP().save(suspensionsable30);
		Context.getInstance().getDaoP().save(suspensionsable31);
		Context.getInstance().getDaoP().save(suspensionsable32);
		Context.getInstance().getDaoP().save(suspensionsable33);
		Context.getInstance().getDaoP().save(suspensionsable34);
		Context.getInstance().getDaoP().save(suspensionsable35);
		Context.getInstance().getDaoP().save(suspensionsable36);
		Context.getInstance().getDaoP().save(suspensionsable37);
		Context.getInstance().getDaoP().save(suspensionsable38);
		Context.getInstance().getDaoP().save(suspensionsable39);
		Context.getInstance().getDaoP().save(suspensionsable40);
		Context.getInstance().getDaoP().save(suspensionsable41);
		Context.getInstance().getDaoP().save(suspensionsable42);
		Context.getInstance().getDaoP().save(suspensionsable43);
		Context.getInstance().getDaoP().save(suspensionsable44);
		Context.getInstance().getDaoP().save(suspensionsable45);
		Context.getInstance().getDaoP().save(suspensionsable46);
		Context.getInstance().getDaoP().save(suspensionsable47);
		Context.getInstance().getDaoP().save(suspensionsable48);
		Context.getInstance().getDaoP().save(suspensionsable49);
		Context.getInstance().getDaoP().save(suspensionsable50);
		Context.getInstance().getDaoP().save(suspensionsable51);
		Context.getInstance().getDaoP().save(suspensionsable52);
		Context.getInstance().getDaoP().save(suspensionsable53);
		Context.getInstance().getDaoP().save(suspensionsable54);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece suspensionglace1 = new Piece("suspension",400,glace, pluie,duo,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace2 = new Piece("suspension",1000,glace, pluie,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace3 = new Piece("suspension",650,glace, pluie,duo,false,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionglace4 = new Piece("suspension",400,glace, pluie,duo,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace5 = new Piece("suspension",1000,glace, pluie,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace6 = new Piece("suspension",650,glace, pluie,duo,true,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionglace7 = new Piece("suspension",400,glace, pluie,famille,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace8 = new Piece("suspension",1000,glace, pluie,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace9 = new Piece("suspension",650,glace, pluie,famille,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace10 = new Piece("suspension",400,glace, pluie,famille,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace11 = new Piece("suspension",1000,glace, pluie,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace12 = new Piece("suspension",650,glace, pluie,famille,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace13 = new Piece("suspension",400,glace, pluie,tourisme,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace14 = new Piece("suspension",1000,glace, pluie,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace15 = new Piece("suspension",650,glace, pluie,tourisme,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace16 = new Piece("suspension",400,glace, pluie,tourisme,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace17 = new Piece("suspension",1000,glace, pluie,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace18 = new Piece("suspension",650,glace, pluie,tourisme,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace19 = new Piece("suspension",400,glace, sec,duo,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace20 = new Piece("suspension",1000,glace, sec,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace21 = new Piece("suspension",650,glace, sec,duo,false,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionglace22 = new Piece("suspension",400,glace, sec,duo,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace23 = new Piece("suspension",1000,glace, sec,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace24 = new Piece("suspension",650,glace, sec,duo,true,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionglace25 = new Piece("suspension",400,glace, sec,famille,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace26 = new Piece("suspension",1000,glace, sec,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace27 = new Piece("suspension",650,glace, sec,famille,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace28 = new Piece("suspension",400,glace, sec,famille,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace29 = new Piece("suspension",1000,glace, sec,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace30 = new Piece("suspension",650,glace, sec,famille,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace31 = new Piece("suspension",400,glace, sec,tourisme,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace32 = new Piece("suspension",1000,glace, sec,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace33 = new Piece("suspension",650,glace, sec,tourisme,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace34 = new Piece("suspension",400,glace, sec,tourisme,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace35 = new Piece("suspension",1000,glace, sec,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace36 = new Piece("suspension",650,glace, sec,tourisme,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace37 = new Piece("suspension",400,glace, brouillard,duo,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace38 = new Piece("suspension",1000,glace, brouillard,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace39 = new Piece("suspension",650,glace, brouillard,duo,false,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionglace40 = new Piece("suspension",400,glace, brouillard,duo,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace41 = new Piece("suspension",1000,glace, brouillard,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace42 = new Piece("suspension",650,glace, brouillard,duo,true,tuning,"/Images/suspensionAdapative.jpg");
		
		Piece suspensionglace43 = new Piece("suspension",400,glace, brouillard,famille,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace44 = new Piece("suspension",1000,glace, brouillard,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace45 = new Piece("suspension",650,glace, brouillard,famille,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace46 = new Piece("suspension",400,glace, brouillard,famille,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace47 = new Piece("suspension",1000,glace, brouillard,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace48 = new Piece("suspension",650,glace, brouillard,famille,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace49 = new Piece("suspension",400,glace, brouillard,tourisme,false,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace50 = new Piece("suspension",1000,glace, brouillard,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace51 = new Piece("suspension",650,glace, brouillard,tourisme,false,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Piece suspensionglace52 = new Piece("suspension",400,glace, brouillard,tourisme,true,ecoPlus,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace53 = new Piece("suspension",1000,glace, brouillard,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionglace54 = new Piece("suspension",650,glace, brouillard,tourisme,true,tuning,"/Images/suspensionAdapative.jpg"); 
		
		Context.getInstance().getDaoP().save(suspensionglace1);
		Context.getInstance().getDaoP().save(suspensionglace2);
		Context.getInstance().getDaoP().save(suspensionglace3);
		Context.getInstance().getDaoP().save(suspensionglace4);
		Context.getInstance().getDaoP().save(suspensionglace5);
		Context.getInstance().getDaoP().save(suspensionglace6);
		Context.getInstance().getDaoP().save(suspensionglace7);
		Context.getInstance().getDaoP().save(suspensionglace8);
		Context.getInstance().getDaoP().save(suspensionglace9);
		Context.getInstance().getDaoP().save(suspensionglace10);
		Context.getInstance().getDaoP().save(suspensionglace11);
		Context.getInstance().getDaoP().save(suspensionglace12);
		Context.getInstance().getDaoP().save(suspensionglace13);
		Context.getInstance().getDaoP().save(suspensionglace14);
		Context.getInstance().getDaoP().save(suspensionglace15);
		Context.getInstance().getDaoP().save(suspensionglace16);
		Context.getInstance().getDaoP().save(suspensionglace17);
		Context.getInstance().getDaoP().save(suspensionglace18);
		Context.getInstance().getDaoP().save(suspensionglace19);
		Context.getInstance().getDaoP().save(suspensionglace20);
		Context.getInstance().getDaoP().save(suspensionglace21);
		Context.getInstance().getDaoP().save(suspensionglace22);
		Context.getInstance().getDaoP().save(suspensionglace23);
		Context.getInstance().getDaoP().save(suspensionglace24);
		Context.getInstance().getDaoP().save(suspensionglace25);
		Context.getInstance().getDaoP().save(suspensionglace26);
		Context.getInstance().getDaoP().save(suspensionglace27);
		Context.getInstance().getDaoP().save(suspensionglace28);
		Context.getInstance().getDaoP().save(suspensionglace29);
		Context.getInstance().getDaoP().save(suspensionglace30);
		Context.getInstance().getDaoP().save(suspensionglace31);
		Context.getInstance().getDaoP().save(suspensionglace32);
		Context.getInstance().getDaoP().save(suspensionglace33);
		Context.getInstance().getDaoP().save(suspensionglace34);
		Context.getInstance().getDaoP().save(suspensionglace35);
		Context.getInstance().getDaoP().save(suspensionglace36);
		Context.getInstance().getDaoP().save(suspensionglace37);
		Context.getInstance().getDaoP().save(suspensionglace38);
		Context.getInstance().getDaoP().save(suspensionglace39);
		Context.getInstance().getDaoP().save(suspensionglace40);
		Context.getInstance().getDaoP().save(suspensionglace41);
		Context.getInstance().getDaoP().save(suspensionglace42);
		Context.getInstance().getDaoP().save(suspensionglace43);
		Context.getInstance().getDaoP().save(suspensionglace44);
		Context.getInstance().getDaoP().save(suspensionglace45);
		Context.getInstance().getDaoP().save(suspensionglace46);
		Context.getInstance().getDaoP().save(suspensionglace47);
		Context.getInstance().getDaoP().save(suspensionglace48);
		Context.getInstance().getDaoP().save(suspensionglace49);
		Context.getInstance().getDaoP().save(suspensionglace50);
		Context.getInstance().getDaoP().save(suspensionglace51);
		Context.getInstance().getDaoP().save(suspensionglace52);
		Context.getInstance().getDaoP().save(suspensionglace53);
		Context.getInstance().getDaoP().save(suspensionglace54);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Piece suspensionbitume1 = new Piece("suspension",400,bitume, pluie,duo,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume2 = new Piece("suspension",1000,bitume, pluie,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume3 = new Piece("suspension",650,bitume, pluie,duo,false,tuning,"/Images/suspensionBerlin.jpg");
		
		Piece suspensionbitume4 = new Piece("suspension",400,bitume, pluie,duo,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume5 = new Piece("suspension",1000,bitume, pluie,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume6 = new Piece("suspension",650,bitume, pluie,duo,true,tuning,"/Images/suspensionBerlin.jpg");
		
		Piece suspensionbitume7 = new Piece("suspension",400,bitume, pluie,famille,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume8 = new Piece("suspension",1000,bitume, pluie,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume9 = new Piece("suspension",650,bitume, pluie,famille,false,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume10 = new Piece("suspension",400,bitume, pluie,famille,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume11 = new Piece("suspension",1000,bitume, pluie,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume12 = new Piece("suspension",650,bitume, pluie,famille,true,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume13 = new Piece("suspension",400,bitume, pluie,tourisme,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume14 = new Piece("suspension",1000,bitume, pluie,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume15 = new Piece("suspension",650,bitume, pluie,tourisme,false,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume16 = new Piece("suspension",400,bitume, pluie,tourisme,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume17 = new Piece("suspension",1000,bitume, pluie,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume18 = new Piece("suspension",650,bitume, pluie,tourisme,true,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume19 = new Piece("suspension",400,bitume, sec,duo,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume20 = new Piece("suspension",1000,bitume, sec,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume21 = new Piece("suspension",650,bitume, sec,duo,false,tuning,"/Images/suspensionBerlin.jpg");
		
		Piece suspensionbitume22 = new Piece("suspension",400,bitume, sec,duo,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume23 = new Piece("suspension",1000,bitume, sec,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume24 = new Piece("suspension",650,bitume, sec,duo,true,tuning,"/Images/suspensionBerlin.jpg");
		
		Piece suspensionbitume25 = new Piece("suspension",400,bitume, sec,famille,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume26 = new Piece("suspension",1000,bitume, sec,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume27 = new Piece("suspension",650,bitume, sec,famille,false,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume28 = new Piece("suspension",400,bitume, sec,famille,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume29 = new Piece("suspension",1000,bitume, sec,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume30 = new Piece("suspension",650,bitume, sec,famille,true,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume31 = new Piece("suspension",400,bitume, sec,tourisme,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume32 = new Piece("suspension",1000,bitume, sec,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume33 = new Piece("suspension",650,bitume, sec,tourisme,false,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume34 = new Piece("suspension",400,bitume, sec,tourisme,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume35 = new Piece("suspension",1000,bitume, sec,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume36 = new Piece("suspension",650,bitume, sec,tourisme,true,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume37 = new Piece("suspension",400,bitume, brouillard,duo,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume38 = new Piece("suspension",1000,bitume, brouillard,duo,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume39 = new Piece("suspension",650,bitume, brouillard,duo,false,tuning,"/Images/suspensionBerlin.jpg");
		
		Piece suspensionbitume40 = new Piece("suspension",400,bitume, brouillard,duo,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume41 = new Piece("suspension",1000,bitume, brouillard,duo,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume42 = new Piece("suspension",650,bitume, brouillard,duo,true,tuning,"/Images/suspensionBerlin.jpg");
		
		Piece suspensionbitume43 = new Piece("suspension",400,bitume, brouillard,famille,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume44 = new Piece("suspension",1000,bitume, brouillard,famille,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume45 = new Piece("suspension",650,bitume, brouillard,famille,false,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume46 = new Piece("suspension",400,bitume, brouillard,famille,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume47 = new Piece("suspension",1000,bitume, brouillard,famille,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume48 = new Piece("suspension",650,bitume, brouillard,famille,true,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume49 = new Piece("suspension",400,bitume, brouillard,tourisme,false,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume50 = new Piece("suspension",1000,bitume, brouillard,tourisme,false,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume51 = new Piece("suspension",650,bitume, brouillard,tourisme,false,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Piece suspensionbitume52 = new Piece("suspension",400,bitume, brouillard,tourisme,true,ecoPlus,"/Images/suspensionClassic.jpg");
		Piece suspensionbitume53 = new Piece("suspension",1000,bitume, brouillard,tourisme,true,luxe,"/Images/suspensionAdapative.jpg");
		Piece suspensionbitume54 = new Piece("suspension",650,bitume, brouillard,tourisme,true,tuning,"/Images/suspensionBerlin.jpg"); 
		
		Context.getInstance().getDaoP().save(suspensionbitume1);
		Context.getInstance().getDaoP().save(suspensionbitume2);
		Context.getInstance().getDaoP().save(suspensionbitume3);
		Context.getInstance().getDaoP().save(suspensionbitume4);
		Context.getInstance().getDaoP().save(suspensionbitume5);
		Context.getInstance().getDaoP().save(suspensionbitume6);
		Context.getInstance().getDaoP().save(suspensionbitume7);
		Context.getInstance().getDaoP().save(suspensionbitume8);
		Context.getInstance().getDaoP().save(suspensionbitume9);
		Context.getInstance().getDaoP().save(suspensionbitume10);
		Context.getInstance().getDaoP().save(suspensionbitume11);
		Context.getInstance().getDaoP().save(suspensionbitume12);
		Context.getInstance().getDaoP().save(suspensionbitume13);
		Context.getInstance().getDaoP().save(suspensionbitume14);
		Context.getInstance().getDaoP().save(suspensionbitume15);
		Context.getInstance().getDaoP().save(suspensionbitume16);
		Context.getInstance().getDaoP().save(suspensionbitume17);
		Context.getInstance().getDaoP().save(suspensionbitume18);
		Context.getInstance().getDaoP().save(suspensionbitume19);
		Context.getInstance().getDaoP().save(suspensionbitume20);
		Context.getInstance().getDaoP().save(suspensionbitume21);
		Context.getInstance().getDaoP().save(suspensionbitume22);
		Context.getInstance().getDaoP().save(suspensionbitume23);
		Context.getInstance().getDaoP().save(suspensionbitume24);
		Context.getInstance().getDaoP().save(suspensionbitume25);
		Context.getInstance().getDaoP().save(suspensionbitume26);
		Context.getInstance().getDaoP().save(suspensionbitume27);
		Context.getInstance().getDaoP().save(suspensionbitume28);
		Context.getInstance().getDaoP().save(suspensionbitume29);
		Context.getInstance().getDaoP().save(suspensionbitume30);
		Context.getInstance().getDaoP().save(suspensionbitume31);
		Context.getInstance().getDaoP().save(suspensionbitume32);
		Context.getInstance().getDaoP().save(suspensionbitume33);
		Context.getInstance().getDaoP().save(suspensionbitume34);
		Context.getInstance().getDaoP().save(suspensionbitume35);
		Context.getInstance().getDaoP().save(suspensionbitume36);
		Context.getInstance().getDaoP().save(suspensionbitume37);
		Context.getInstance().getDaoP().save(suspensionbitume38);
		Context.getInstance().getDaoP().save(suspensionbitume39);
		Context.getInstance().getDaoP().save(suspensionbitume40);
		Context.getInstance().getDaoP().save(suspensionbitume41);
		Context.getInstance().getDaoP().save(suspensionbitume42);
		Context.getInstance().getDaoP().save(suspensionbitume43);
		Context.getInstance().getDaoP().save(suspensionbitume44);
		Context.getInstance().getDaoP().save(suspensionbitume45);
		Context.getInstance().getDaoP().save(suspensionbitume46);
		Context.getInstance().getDaoP().save(suspensionbitume47);
		Context.getInstance().getDaoP().save(suspensionbitume48);
		Context.getInstance().getDaoP().save(suspensionbitume49);
		Context.getInstance().getDaoP().save(suspensionbitume50);
		Context.getInstance().getDaoP().save(suspensionbitume51);
		Context.getInstance().getDaoP().save(suspensionbitume52);
		Context.getInstance().getDaoP().save(suspensionbitume53);
		Context.getInstance().getDaoP().save(suspensionbitume54);
		
	}

}
