package metier;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;

public class MoteurBDD {
	
	public static void donneeMoteurBDD() {
		
		//DECLARATION SOL
//		Sol boue= new Sol("Boue");
		Sol glace= new Sol("Glace");
		Sol sable= new Sol("Sable");
		Sol terre= new Sol("Terre");
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
		
		Piece moteurterre1 = new Piece("moteur",4500,terre, pluie,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre2 = new Piece("moteur",14500,terre, pluie,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre3 = new Piece("moteur",24500,terre, pluie,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurterre4 = new Piece("moteur",4500,terre, pluie,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre5 = new Piece("moteur",14500,terre, pluie,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre6 = new Piece("moteur",24500,terre, pluie,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurterre7 = new Piece("moteur",4500,terre, pluie,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre8 = new Piece("moteur",14500,terre, pluie,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre9 = new Piece("moteur",24500,terre, pluie,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre10 = new Piece("moteur",4500,terre, pluie,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre11 = new Piece("moteur",14500,terre, pluie,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre12 = new Piece("moteur",24500,terre, pluie,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre13 = new Piece("moteur",4500,terre, pluie,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre14 = new Piece("moteur",14500,terre, pluie,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre15 = new Piece("moteur",24500,terre, pluie,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre16 = new Piece("moteur",4500,terre, pluie,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre17 = new Piece("moteur",14500,terre, pluie,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre18 = new Piece("moteur",24500,terre, pluie,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece moteurterre19 = new Piece("moteur",4500,terre, sec,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre20 = new Piece("moteur",14500,terre, sec,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre21 = new Piece("moteur",24500,terre, sec,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurterre22 = new Piece("moteur",4500,terre, sec,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre23 = new Piece("moteur",14500,terre, sec,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre24 = new Piece("moteur",24500,terre, sec,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurterre25 = new Piece("moteur",4500,terre, sec,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre26 = new Piece("moteur",14500,terre, sec,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre27 = new Piece("moteur",24500,terre, sec,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre28 = new Piece("moteur",4500,terre, sec,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre29 = new Piece("moteur",14500,terre, sec,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre30 = new Piece("moteur",24500,terre, sec,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre31 = new Piece("moteur",4500,terre, sec,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre32 = new Piece("moteur",14500,terre, sec,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre33 = new Piece("moteur",24500,terre, sec,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre34 = new Piece("moteur",4500,terre, sec,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre35 = new Piece("moteur",14500,terre, sec,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre36 = new Piece("moteur",24500,terre, sec,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
//		////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece moteurterre37 = new Piece("moteur",4500,terre, brouillard,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre38 = new Piece("moteur",14500,terre, brouillard,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre39 = new Piece("moteur",24500,terre, brouillard,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurterre40 = new Piece("moteur",4500,terre, brouillard,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre41 = new Piece("moteur",14500,terre, brouillard,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre42 = new Piece("moteur",24500,terre, brouillard,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurterre43 = new Piece("moteur",4500,terre, brouillard,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre44 = new Piece("moteur",14500,terre, brouillard,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre45 = new Piece("moteur",24500,terre, brouillard,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre46 = new Piece("moteur",4500,terre, brouillard,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre47 = new Piece("moteur",14500,terre, brouillard,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre48 = new Piece("moteur",24500,terre, brouillard,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre49 = new Piece("moteur",4500,terre, brouillard,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre50 = new Piece("moteur",14500,terre, brouillard,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre51 = new Piece("moteur",24500,terre, brouillard,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurterre52 = new Piece("moteur",4500,terre, brouillard,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurterre53 = new Piece("moteur",14500,terre, brouillard,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurterre54 = new Piece("moteur",24500,terre, brouillard,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Context.getInstance().getDaoP().save(moteurterre1);
		Context.getInstance().getDaoP().save(moteurterre2);
		Context.getInstance().getDaoP().save(moteurterre3);
		Context.getInstance().getDaoP().save(moteurterre4);
		Context.getInstance().getDaoP().save(moteurterre5);
		Context.getInstance().getDaoP().save(moteurterre6);
		Context.getInstance().getDaoP().save(moteurterre7);
		Context.getInstance().getDaoP().save(moteurterre8);
		Context.getInstance().getDaoP().save(moteurterre9);
		Context.getInstance().getDaoP().save(moteurterre10);
		Context.getInstance().getDaoP().save(moteurterre11);
		Context.getInstance().getDaoP().save(moteurterre12);
		Context.getInstance().getDaoP().save(moteurterre13);
		Context.getInstance().getDaoP().save(moteurterre14);
		Context.getInstance().getDaoP().save(moteurterre15);
		Context.getInstance().getDaoP().save(moteurterre16);
		Context.getInstance().getDaoP().save(moteurterre17);
		Context.getInstance().getDaoP().save(moteurterre18);
		Context.getInstance().getDaoP().save(moteurterre19);
		Context.getInstance().getDaoP().save(moteurterre20);
		Context.getInstance().getDaoP().save(moteurterre21);
		Context.getInstance().getDaoP().save(moteurterre22);
		Context.getInstance().getDaoP().save(moteurterre23);
		Context.getInstance().getDaoP().save(moteurterre24);
		Context.getInstance().getDaoP().save(moteurterre25);
		Context.getInstance().getDaoP().save(moteurterre26);
		Context.getInstance().getDaoP().save(moteurterre27);
		Context.getInstance().getDaoP().save(moteurterre28);
		Context.getInstance().getDaoP().save(moteurterre29);
		Context.getInstance().getDaoP().save(moteurterre30);
		Context.getInstance().getDaoP().save(moteurterre31);
		Context.getInstance().getDaoP().save(moteurterre32);
		Context.getInstance().getDaoP().save(moteurterre33);
		Context.getInstance().getDaoP().save(moteurterre34);
		Context.getInstance().getDaoP().save(moteurterre35);
		Context.getInstance().getDaoP().save(moteurterre36);
		Context.getInstance().getDaoP().save(moteurterre37);
		Context.getInstance().getDaoP().save(moteurterre38);
		Context.getInstance().getDaoP().save(moteurterre39);
		Context.getInstance().getDaoP().save(moteurterre40);
		Context.getInstance().getDaoP().save(moteurterre41);
		Context.getInstance().getDaoP().save(moteurterre42);
		Context.getInstance().getDaoP().save(moteurterre43);
		Context.getInstance().getDaoP().save(moteurterre44);
		Context.getInstance().getDaoP().save(moteurterre45);
		Context.getInstance().getDaoP().save(moteurterre46);
		Context.getInstance().getDaoP().save(moteurterre47);
		Context.getInstance().getDaoP().save(moteurterre48);
		Context.getInstance().getDaoP().save(moteurterre49);
		Context.getInstance().getDaoP().save(moteurterre50);
		Context.getInstance().getDaoP().save(moteurterre51);
		Context.getInstance().getDaoP().save(moteurterre52);
		Context.getInstance().getDaoP().save(moteurterre53);
		Context.getInstance().getDaoP().save(moteurterre54);

		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece moteursable1 = new Piece("moteur",4500,sable, pluie,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable2 = new Piece("moteur",14500,sable, pluie,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable3 = new Piece("moteur",24500,sable, pluie,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteursable4 = new Piece("moteur",4500,sable, pluie,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable5 = new Piece("moteur",14500,sable, pluie,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable6 = new Piece("moteur",24500,sable, pluie,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteursable7 = new Piece("moteur",4500,sable, pluie,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable8 = new Piece("moteur",14500,sable, pluie,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable9 = new Piece("moteur",24500,sable, pluie,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable10 = new Piece("moteur",4500,sable, pluie,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable11 = new Piece("moteur",14500,sable, pluie,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable12 = new Piece("moteur",24500,sable, pluie,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable13 = new Piece("moteur",4500,sable, pluie,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable14 = new Piece("moteur",14500,sable, pluie,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable15 = new Piece("moteur",24500,sable, pluie,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable16 = new Piece("moteur",4500,sable, pluie,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable17 = new Piece("moteur",14500,sable, pluie,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable18 = new Piece("moteur",24500,sable, pluie,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable19 = new Piece("moteur",4500,sable, sec,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable20 = new Piece("moteur",14500,sable, sec,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable21 = new Piece("moteur",24500,sable, sec,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteursable22 = new Piece("moteur",4500,sable, sec,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable23 = new Piece("moteur",14500,sable, sec,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable24 = new Piece("moteur",24500,sable, sec,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteursable25 = new Piece("moteur",4500,sable, sec,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable26 = new Piece("moteur",14500,sable, sec,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable27 = new Piece("moteur",24500,sable, sec,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable28 = new Piece("moteur",4500,sable, sec,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable29 = new Piece("moteur",14500,sable, sec,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable30 = new Piece("moteur",24500,sable, sec,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable31 = new Piece("moteur",4500,sable, sec,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable32 = new Piece("moteur",14500,sable, sec,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable33 = new Piece("moteur",24500,sable, sec,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable34 = new Piece("moteur",4500,sable, sec,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable35 = new Piece("moteur",14500,sable, sec,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable36 = new Piece("moteur",24500,sable, sec,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable37 = new Piece("moteur",4500,sable, brouillard,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable38 = new Piece("moteur",14500,sable, brouillard,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable39 = new Piece("moteur",24500,sable, brouillard,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteursable40 = new Piece("moteur",4500,sable, brouillard,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable41 = new Piece("moteur",14500,sable, brouillard,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable42 = new Piece("moteur",24500,sable, brouillard,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteursable43 = new Piece("moteur",4500,sable, brouillard,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable44 = new Piece("moteur",14500,sable, brouillard,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable45 = new Piece("moteur",24500,sable, brouillard,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable46 = new Piece("moteur",4500,sable, brouillard,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable47 = new Piece("moteur",14500,sable, brouillard,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable48 = new Piece("moteur",24500,sable, brouillard,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable49 = new Piece("moteur",4500,sable, brouillard,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable50 = new Piece("moteur",14500,sable, brouillard,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteursable51 = new Piece("moteur",24500,sable, brouillard,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteursable52 = new Piece("moteur",4500,sable, brouillard,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteursable53 = new Piece("moteur",14500,sable, brouillard,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteursable54 = new Piece("moteur",24500,sable, brouillard,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		
		Context.getInstance().getDaoP().save(moteursable1);
		Context.getInstance().getDaoP().save(moteursable2);
		Context.getInstance().getDaoP().save(moteursable3);
		Context.getInstance().getDaoP().save(moteursable4);
		Context.getInstance().getDaoP().save(moteursable5);
		Context.getInstance().getDaoP().save(moteursable6);
		Context.getInstance().getDaoP().save(moteursable7);
		Context.getInstance().getDaoP().save(moteursable8);
		Context.getInstance().getDaoP().save(moteursable9);
		Context.getInstance().getDaoP().save(moteursable10);
		Context.getInstance().getDaoP().save(moteursable11);
		Context.getInstance().getDaoP().save(moteursable12);
		Context.getInstance().getDaoP().save(moteursable13);
		Context.getInstance().getDaoP().save(moteursable14);
		Context.getInstance().getDaoP().save(moteursable15);
		Context.getInstance().getDaoP().save(moteursable16);
		Context.getInstance().getDaoP().save(moteursable17);
		Context.getInstance().getDaoP().save(moteursable18);
		Context.getInstance().getDaoP().save(moteursable19);
		Context.getInstance().getDaoP().save(moteursable20);
		Context.getInstance().getDaoP().save(moteursable21);
		Context.getInstance().getDaoP().save(moteursable22);
		Context.getInstance().getDaoP().save(moteursable23);
		Context.getInstance().getDaoP().save(moteursable24);
		Context.getInstance().getDaoP().save(moteursable25);
		Context.getInstance().getDaoP().save(moteursable26);
		Context.getInstance().getDaoP().save(moteursable27);
		Context.getInstance().getDaoP().save(moteursable28);
		Context.getInstance().getDaoP().save(moteursable29);
		Context.getInstance().getDaoP().save(moteursable30);
		Context.getInstance().getDaoP().save(moteursable31);
		Context.getInstance().getDaoP().save(moteursable32);
		Context.getInstance().getDaoP().save(moteursable33);
		Context.getInstance().getDaoP().save(moteursable34);
		Context.getInstance().getDaoP().save(moteursable35);
		Context.getInstance().getDaoP().save(moteursable36);
		Context.getInstance().getDaoP().save(moteursable37);
		Context.getInstance().getDaoP().save(moteursable38);
		Context.getInstance().getDaoP().save(moteursable39);
		Context.getInstance().getDaoP().save(moteursable40);
		Context.getInstance().getDaoP().save(moteursable41);
		Context.getInstance().getDaoP().save(moteursable42);
		Context.getInstance().getDaoP().save(moteursable43);
		Context.getInstance().getDaoP().save(moteursable44);
		Context.getInstance().getDaoP().save(moteursable45);
		Context.getInstance().getDaoP().save(moteursable46);
		Context.getInstance().getDaoP().save(moteursable47);
		Context.getInstance().getDaoP().save(moteursable48);
		Context.getInstance().getDaoP().save(moteursable49);
		Context.getInstance().getDaoP().save(moteursable50);
		Context.getInstance().getDaoP().save(moteursable51);
		Context.getInstance().getDaoP().save(moteursable52);
		Context.getInstance().getDaoP().save(moteursable53);
		Context.getInstance().getDaoP().save(moteursable54);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece moteurglace1 = new Piece("moteur",4500,glace, pluie,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace2 = new Piece("moteur",14500,glace, pluie,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace3 = new Piece("moteur",24500,glace, pluie,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurglace4 = new Piece("moteur",4500,glace, pluie,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace5 = new Piece("moteur",14500,glace, pluie,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace6 = new Piece("moteur",24500,glace, pluie,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurglace7 = new Piece("moteur",4500,glace, pluie,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace8 = new Piece("moteur",14500,glace, pluie,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace9 = new Piece("moteur",24500,glace, pluie,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace10 = new Piece("moteur",4500,glace, pluie,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace11 = new Piece("moteur",14500,glace, pluie,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace12 = new Piece("moteur",24500,glace, pluie,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace13 = new Piece("moteur",4500,glace, pluie,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace14 = new Piece("moteur",14500,glace, pluie,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace15 = new Piece("moteur",24500,glace, pluie,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace16 = new Piece("moteur",4500,glace, pluie,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace17 = new Piece("moteur",14500,glace, pluie,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace18 = new Piece("moteur",24500,glace, pluie,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace19 = new Piece("moteur",4500,glace, sec,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace20 = new Piece("moteur",14500,glace, sec,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace21 = new Piece("moteur",24500,glace, sec,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurglace22 = new Piece("moteur",4500,glace, sec,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace23 = new Piece("moteur",14500,glace, sec,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace24 = new Piece("moteur",24500,glace, sec,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurglace25 = new Piece("moteur",4500,glace, sec,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace26 = new Piece("moteur",14500,glace, sec,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace27 = new Piece("moteur",24500,glace, sec,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace28 = new Piece("moteur",4500,glace, sec,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace29 = new Piece("moteur",14500,glace, sec,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace30 = new Piece("moteur",24500,glace, sec,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace31 = new Piece("moteur",4500,glace, sec,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace32 = new Piece("moteur",14500,glace, sec,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace33 = new Piece("moteur",24500,glace, sec,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace34 = new Piece("moteur",4500,glace, sec,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace35 = new Piece("moteur",14500,glace, sec,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace36 = new Piece("moteur",24500,glace, sec,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace37 = new Piece("moteur",4500,glace, brouillard,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace38 = new Piece("moteur",14500,glace, brouillard,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace39 = new Piece("moteur",24500,glace, brouillard,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurglace40 = new Piece("moteur",4500,glace, brouillard,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace41 = new Piece("moteur",14500,glace, brouillard,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace42 = new Piece("moteur",24500,glace, brouillard,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurglace43 = new Piece("moteur",4500,glace, brouillard,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace44 = new Piece("moteur",14500,glace, brouillard,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace45 = new Piece("moteur",24500,glace, brouillard,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace46 = new Piece("moteur",4500,glace, brouillard,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace47 = new Piece("moteur",14500,glace, brouillard,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace48 = new Piece("moteur",24500,glace, brouillard,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace49 = new Piece("moteur",4500,glace, brouillard,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace50 = new Piece("moteur",14500,glace, brouillard,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace51 = new Piece("moteur",24500,glace, brouillard,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurglace52 = new Piece("moteur",4500,glace, brouillard,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurglace53 = new Piece("moteur",14500,glace, brouillard,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurglace54 = new Piece("moteur",24500,glace, brouillard,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Context.getInstance().getDaoP().save(moteurglace1);
		Context.getInstance().getDaoP().save(moteurglace2);
		Context.getInstance().getDaoP().save(moteurglace3);
		Context.getInstance().getDaoP().save(moteurglace4);
		Context.getInstance().getDaoP().save(moteurglace5);
		Context.getInstance().getDaoP().save(moteurglace6);
		Context.getInstance().getDaoP().save(moteurglace7);
		Context.getInstance().getDaoP().save(moteurglace8);
		Context.getInstance().getDaoP().save(moteurglace9);
		Context.getInstance().getDaoP().save(moteurglace10);
		Context.getInstance().getDaoP().save(moteurglace11);
		Context.getInstance().getDaoP().save(moteurglace12);
		Context.getInstance().getDaoP().save(moteurglace13);
		Context.getInstance().getDaoP().save(moteurglace14);
		Context.getInstance().getDaoP().save(moteurglace15);
		Context.getInstance().getDaoP().save(moteurglace16);
		Context.getInstance().getDaoP().save(moteurglace17);
		Context.getInstance().getDaoP().save(moteurglace18);
		Context.getInstance().getDaoP().save(moteurglace19);
		Context.getInstance().getDaoP().save(moteurglace20);
		Context.getInstance().getDaoP().save(moteurglace21);
		Context.getInstance().getDaoP().save(moteurglace22);
		Context.getInstance().getDaoP().save(moteurglace23);
		Context.getInstance().getDaoP().save(moteurglace24);
		Context.getInstance().getDaoP().save(moteurglace25);
		Context.getInstance().getDaoP().save(moteurglace26);
		Context.getInstance().getDaoP().save(moteurglace27);
		Context.getInstance().getDaoP().save(moteurglace28);
		Context.getInstance().getDaoP().save(moteurglace29);
		Context.getInstance().getDaoP().save(moteurglace30);
		Context.getInstance().getDaoP().save(moteurglace31);
		Context.getInstance().getDaoP().save(moteurglace32);
		Context.getInstance().getDaoP().save(moteurglace33);
		Context.getInstance().getDaoP().save(moteurglace34);
		Context.getInstance().getDaoP().save(moteurglace35);
		Context.getInstance().getDaoP().save(moteurglace36);
		Context.getInstance().getDaoP().save(moteurglace37);
		Context.getInstance().getDaoP().save(moteurglace38);
		Context.getInstance().getDaoP().save(moteurglace39);
		Context.getInstance().getDaoP().save(moteurglace40);
		Context.getInstance().getDaoP().save(moteurglace41);
		Context.getInstance().getDaoP().save(moteurglace42);
		Context.getInstance().getDaoP().save(moteurglace43);
		Context.getInstance().getDaoP().save(moteurglace44);
		Context.getInstance().getDaoP().save(moteurglace45);
		Context.getInstance().getDaoP().save(moteurglace46);
		Context.getInstance().getDaoP().save(moteurglace47);
		Context.getInstance().getDaoP().save(moteurglace48);
		Context.getInstance().getDaoP().save(moteurglace49);
		Context.getInstance().getDaoP().save(moteurglace50);
		Context.getInstance().getDaoP().save(moteurglace51);
		Context.getInstance().getDaoP().save(moteurglace52);
		Context.getInstance().getDaoP().save(moteurglace53);
		Context.getInstance().getDaoP().save(moteurglace54);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Piece moteurbitume1 = new Piece("moteur",4500,bitume, pluie,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume2 = new Piece("moteur",14500,bitume, pluie,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume3 = new Piece("moteur",24500,bitume, pluie,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurbitume4 = new Piece("moteur",4500,bitume, pluie,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume5 = new Piece("moteur",14500,bitume, pluie,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume6 = new Piece("moteur",24500,bitume, pluie,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurbitume7 = new Piece("moteur",4500,bitume, pluie,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume8 = new Piece("moteur",14500,bitume, pluie,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume9 = new Piece("moteur",24500,bitume, pluie,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume10 = new Piece("moteur",4500,bitume, pluie,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume11 = new Piece("moteur",14500,bitume, pluie,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume12 = new Piece("moteur",24500,bitume, pluie,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume13 = new Piece("moteur",4500,bitume, pluie,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume14 = new Piece("moteur",14500,bitume, pluie,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume15 = new Piece("moteur",24500,bitume, pluie,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume16 = new Piece("moteur",4500,bitume, pluie,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume17 = new Piece("moteur",14500,bitume, pluie,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume18 = new Piece("moteur",24500,bitume, pluie,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume19 = new Piece("moteur",4500,bitume, sec,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume20 = new Piece("moteur",14500,bitume, sec,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume21 = new Piece("moteur",24500,bitume, sec,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurbitume22 = new Piece("moteur",4500,bitume, sec,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume23 = new Piece("moteur",14500,bitume, sec,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume24 = new Piece("moteur",24500,bitume, sec,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurbitume25 = new Piece("moteur",4500,bitume, sec,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume26 = new Piece("moteur",14500,bitume, sec,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume27 = new Piece("moteur",24500,bitume, sec,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume28 = new Piece("moteur",4500,bitume, sec,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume29 = new Piece("moteur",14500,bitume, sec,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume30 = new Piece("moteur",24500,bitume, sec,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume31 = new Piece("moteur",4500,bitume, sec,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume32 = new Piece("moteur",14500,bitume, sec,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume33 = new Piece("moteur",24500,bitume, sec,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume34 = new Piece("moteur",4500,bitume, sec,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume35 = new Piece("moteur",14500,bitume, sec,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume36 = new Piece("moteur",24500,bitume, sec,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume37 = new Piece("moteur",4500,bitume, brouillard,duo,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume38 = new Piece("moteur",14500,bitume, brouillard,duo,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume39 = new Piece("moteur",24500,bitume, brouillard,duo,false,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurbitume40 = new Piece("moteur",4500,bitume, brouillard,duo,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume41 = new Piece("moteur",14500,bitume, brouillard,duo,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume42 = new Piece("moteur",24500,bitume, brouillard,duo,true,tuning,"/Images/moteurTT.jpg");
		
		Piece moteurbitume43 = new Piece("moteur",4500,bitume, brouillard,famille,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume44 = new Piece("moteur",14500,bitume, brouillard,famille,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume45 = new Piece("moteur",24500,bitume, brouillard,famille,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume46 = new Piece("moteur",4500,bitume, brouillard,famille,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume47 = new Piece("moteur",14500,bitume, brouillard,famille,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume48 = new Piece("moteur",24500,bitume, brouillard,famille,true,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume49 = new Piece("moteur",4500,bitume, brouillard,tourisme,false,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume50 = new Piece("moteur",14500,bitume, brouillard,tourisme,false,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume51 = new Piece("moteur",24500,bitume, brouillard,tourisme,false,tuning,"/Images/moteurTT.jpg"); 
		
		Piece moteurbitume52 = new Piece("moteur",4500,bitume, brouillard,tourisme,true,ecoPlus,"/Images/moteurClassic.jpg");
		Piece moteurbitume53 = new Piece("moteur",14500,bitume, brouillard,tourisme,true,luxe,"/Images/moteurSport.jpg");
		Piece moteurbitume54 = new Piece("moteur",24500,bitume, brouillard,tourisme,true,tuning,"/Images/moteurTT.jpg"); 
		
		Context.getInstance().getDaoP().save(moteurbitume1);
		Context.getInstance().getDaoP().save(moteurbitume2);
		Context.getInstance().getDaoP().save(moteurbitume3);
		Context.getInstance().getDaoP().save(moteurbitume4);
		Context.getInstance().getDaoP().save(moteurbitume5);
		Context.getInstance().getDaoP().save(moteurbitume6);
		Context.getInstance().getDaoP().save(moteurbitume7);
		Context.getInstance().getDaoP().save(moteurbitume8);
		Context.getInstance().getDaoP().save(moteurbitume9);
		Context.getInstance().getDaoP().save(moteurbitume10);
		Context.getInstance().getDaoP().save(moteurbitume11);
		Context.getInstance().getDaoP().save(moteurbitume12);
		Context.getInstance().getDaoP().save(moteurbitume13);
		Context.getInstance().getDaoP().save(moteurbitume14);
		Context.getInstance().getDaoP().save(moteurbitume15);
		Context.getInstance().getDaoP().save(moteurbitume16);
		Context.getInstance().getDaoP().save(moteurbitume17);
		Context.getInstance().getDaoP().save(moteurbitume18);
		Context.getInstance().getDaoP().save(moteurbitume19);
		Context.getInstance().getDaoP().save(moteurbitume20);
		Context.getInstance().getDaoP().save(moteurbitume21);
		Context.getInstance().getDaoP().save(moteurbitume22);
		Context.getInstance().getDaoP().save(moteurbitume23);
		Context.getInstance().getDaoP().save(moteurbitume24);
		Context.getInstance().getDaoP().save(moteurbitume25);
		Context.getInstance().getDaoP().save(moteurbitume26);
		Context.getInstance().getDaoP().save(moteurbitume27);
		Context.getInstance().getDaoP().save(moteurbitume28);
		Context.getInstance().getDaoP().save(moteurbitume29);
		Context.getInstance().getDaoP().save(moteurbitume30);
		Context.getInstance().getDaoP().save(moteurbitume31);
		Context.getInstance().getDaoP().save(moteurbitume32);
		Context.getInstance().getDaoP().save(moteurbitume33);
		Context.getInstance().getDaoP().save(moteurbitume34);
		Context.getInstance().getDaoP().save(moteurbitume35);
		Context.getInstance().getDaoP().save(moteurbitume36);
		Context.getInstance().getDaoP().save(moteurbitume37);
		Context.getInstance().getDaoP().save(moteurbitume38);
		Context.getInstance().getDaoP().save(moteurbitume39);
		Context.getInstance().getDaoP().save(moteurbitume40);
		Context.getInstance().getDaoP().save(moteurbitume41);
		Context.getInstance().getDaoP().save(moteurbitume42);
		Context.getInstance().getDaoP().save(moteurbitume43);
		Context.getInstance().getDaoP().save(moteurbitume44);
		Context.getInstance().getDaoP().save(moteurbitume45);
		Context.getInstance().getDaoP().save(moteurbitume46);
		Context.getInstance().getDaoP().save(moteurbitume47);
		Context.getInstance().getDaoP().save(moteurbitume48);
		Context.getInstance().getDaoP().save(moteurbitume49);
		Context.getInstance().getDaoP().save(moteurbitume50);
		Context.getInstance().getDaoP().save(moteurbitume51);
		Context.getInstance().getDaoP().save(moteurbitume52);
		Context.getInstance().getDaoP().save(moteurbitume53);
		Context.getInstance().getDaoP().save(moteurbitume54);
		
	}

}
