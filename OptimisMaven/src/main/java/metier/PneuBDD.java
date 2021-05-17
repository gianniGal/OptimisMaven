package metier;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;

public class PneuBDD {
	
	public static void donneePneuBDD() {
		
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
		
		Piece pneuterre1 = new Piece("pneu",4500,terre, pluie,duo,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre2 = new Piece("pneu",4500,terre, pluie,duo,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre3 = new Piece("pneu",4500,terre, pluie,duo,false,tuning,"/Images/pneuterre.jpg");
		
		Piece pneuterre4 = new Piece("pneu",4500,terre, pluie,duo,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre5 = new Piece("pneu",4500,terre, pluie,duo,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre6 = new Piece("pneu",4500,terre, pluie,duo,true,tuning,"/Images/pneuterre.jpg");
		
		Piece pneuterre7 = new Piece("pneu",4500,terre, pluie,famille,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre8 = new Piece("pneu",4500,terre, pluie,famille,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre9 = new Piece("pneu",4500,terre, pluie,famille,false,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre10 = new Piece("pneu",4500,terre, pluie,famille,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre11 = new Piece("pneu",4500,terre, pluie,famille,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre12 = new Piece("pneu",4500,terre, pluie,famille,true,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre13 = new Piece("pneu",4500,terre, pluie,tourisme,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre14 = new Piece("pneu",4500,terre, pluie,tourisme,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre15 = new Piece("pneu",4500,terre, pluie,tourisme,false,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre16 = new Piece("pneu",4500,terre, pluie,tourisme,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre17 = new Piece("pneu",4500,terre, pluie,tourisme,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre18 = new Piece("pneu",4500,terre, pluie,tourisme,true,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre19 = new Piece("pneu",4500,terre, sec,duo,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre20 = new Piece("pneu",4500,terre, sec,duo,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre21 = new Piece("pneu",4500,terre, sec,duo,false,tuning,"/Images/pneuterre.jpg");
		
		Piece pneuterre22 = new Piece("pneu",4500,terre, sec,duo,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre23 = new Piece("pneu",4500,terre, sec,duo,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre24 = new Piece("pneu",4500,terre, sec,duo,true,tuning,"/Images/pneuterre.jpg");
		
		Piece pneuterre25 = new Piece("pneu",4500,terre, sec,famille,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre26 = new Piece("pneu",4500,terre, sec,famille,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre27 = new Piece("pneu",4500,terre, sec,famille,false,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre28 = new Piece("pneu",4500,terre, sec,famille,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre29 = new Piece("pneu",4500,terre, sec,famille,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre30 = new Piece("pneu",4500,terre, sec,famille,true,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre31 = new Piece("pneu",4500,terre, sec,tourisme,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre32 = new Piece("pneu",4500,terre, sec,tourisme,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre33 = new Piece("pneu",4500,terre, sec,tourisme,false,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre34 = new Piece("pneu",4500,terre, sec,tourisme,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre35 = new Piece("pneu",4500,terre, sec,tourisme,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre36 = new Piece("pneu",4500,terre, sec,tourisme,true,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre37 = new Piece("pneu",4500,terre, brouillard,duo,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre38 = new Piece("pneu",4500,terre, brouillard,duo,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre39 = new Piece("pneu",4500,terre, brouillard,duo,false,tuning,"/Images/pneuterre.jpg");
		
		Piece pneuterre40 = new Piece("pneu",4500,terre, brouillard,duo,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre41 = new Piece("pneu",4500,terre, brouillard,duo,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre42 = new Piece("pneu",4500,terre, brouillard,duo,true,tuning,"/Images/pneuterre.jpg");
		
		Piece pneuterre43 = new Piece("pneu",4500,terre, brouillard,famille,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre44 = new Piece("pneu",4500,terre, brouillard,famille,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre45 = new Piece("pneu",4500,terre, brouillard,famille,false,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre46 = new Piece("pneu",4500,terre, brouillard,famille,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre47 = new Piece("pneu",4500,terre, brouillard,famille,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre48 = new Piece("pneu",4500,terre, brouillard,famille,true,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre49 = new Piece("pneu",4500,terre, brouillard,tourisme,false,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre50 = new Piece("pneu",4500,terre, brouillard,tourisme,false,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre51 = new Piece("pneu",4500,terre, brouillard,tourisme,false,tuning,"/Images/pneuterre.jpg"); 
		
		Piece pneuterre52 = new Piece("pneu",4500,terre, brouillard,tourisme,true,ecoPlus,"/Images/pneuterre.jpg");
		Piece pneuterre53 = new Piece("pneu",4500,terre, brouillard,tourisme,true,luxe,"/Images/pneuterre.jpg");
		Piece pneuterre54 = new Piece("pneu",4500,terre, brouillard,tourisme,true,tuning,"/Images/pneuterre.jpg"); 
		
		Context.getInstance().getDaoP().save(pneuterre1);
		Context.getInstance().getDaoP().save(pneuterre2);
		Context.getInstance().getDaoP().save(pneuterre3);
		Context.getInstance().getDaoP().save(pneuterre4);
		Context.getInstance().getDaoP().save(pneuterre5);
		Context.getInstance().getDaoP().save(pneuterre6);
		Context.getInstance().getDaoP().save(pneuterre7);
		Context.getInstance().getDaoP().save(pneuterre8);
		Context.getInstance().getDaoP().save(pneuterre9);
		Context.getInstance().getDaoP().save(pneuterre10);
		Context.getInstance().getDaoP().save(pneuterre11);
		Context.getInstance().getDaoP().save(pneuterre12);
		Context.getInstance().getDaoP().save(pneuterre13);
		Context.getInstance().getDaoP().save(pneuterre14);
		Context.getInstance().getDaoP().save(pneuterre15);
		Context.getInstance().getDaoP().save(pneuterre16);
		Context.getInstance().getDaoP().save(pneuterre17);
		Context.getInstance().getDaoP().save(pneuterre18);
		Context.getInstance().getDaoP().save(pneuterre19);
		Context.getInstance().getDaoP().save(pneuterre20);
		Context.getInstance().getDaoP().save(pneuterre21);
		Context.getInstance().getDaoP().save(pneuterre22);
		Context.getInstance().getDaoP().save(pneuterre23);
		Context.getInstance().getDaoP().save(pneuterre24);
		Context.getInstance().getDaoP().save(pneuterre25);
		Context.getInstance().getDaoP().save(pneuterre26);
		Context.getInstance().getDaoP().save(pneuterre27);
		Context.getInstance().getDaoP().save(pneuterre28);
		Context.getInstance().getDaoP().save(pneuterre29);
		Context.getInstance().getDaoP().save(pneuterre30);
		Context.getInstance().getDaoP().save(pneuterre31);
		Context.getInstance().getDaoP().save(pneuterre32);
		Context.getInstance().getDaoP().save(pneuterre33);
		Context.getInstance().getDaoP().save(pneuterre34);
		Context.getInstance().getDaoP().save(pneuterre35);
		Context.getInstance().getDaoP().save(pneuterre36);
		Context.getInstance().getDaoP().save(pneuterre37);
		Context.getInstance().getDaoP().save(pneuterre38);
		Context.getInstance().getDaoP().save(pneuterre39);
		Context.getInstance().getDaoP().save(pneuterre40);
		Context.getInstance().getDaoP().save(pneuterre41);
		Context.getInstance().getDaoP().save(pneuterre42);
		Context.getInstance().getDaoP().save(pneuterre43);
		Context.getInstance().getDaoP().save(pneuterre44);
		Context.getInstance().getDaoP().save(pneuterre45);
		Context.getInstance().getDaoP().save(pneuterre46);
		Context.getInstance().getDaoP().save(pneuterre47);
		Context.getInstance().getDaoP().save(pneuterre48);
		Context.getInstance().getDaoP().save(pneuterre49);
		Context.getInstance().getDaoP().save(pneuterre50);
		Context.getInstance().getDaoP().save(pneuterre51);
		Context.getInstance().getDaoP().save(pneuterre52);
		Context.getInstance().getDaoP().save(pneuterre53);
		Context.getInstance().getDaoP().save(pneuterre54);

		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece pneusable1 = new Piece("pneu",250,sable, pluie,duo,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable2 = new Piece("pneu",1000,sable, pluie,duo,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable3 = new Piece("pneu",500,sable, pluie,duo,false,tuning,"/Images/pneusable.jpg");
		
		Piece pneusable4 = new Piece("pneu",4500,sable, pluie,duo,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable5 = new Piece("pneu",4500,sable, pluie,duo,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable6 = new Piece("pneu",4500,sable, pluie,duo,true,tuning,"/Images/pneusable.jpg");
		
		Piece pneusable7 = new Piece("pneu",4500,sable, pluie,famille,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable8 = new Piece("pneu",4500,sable, pluie,famille,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable9 = new Piece("pneu",4500,sable, pluie,famille,false,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable10 = new Piece("pneu",4500,sable, pluie,famille,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable11 = new Piece("pneu",4500,sable, pluie,famille,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable12 = new Piece("pneu",4500,sable, pluie,famille,true,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable13 = new Piece("pneu",4500,sable, pluie,tourisme,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable14 = new Piece("pneu",4500,sable, pluie,tourisme,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable15 = new Piece("pneu",4500,sable, pluie,tourisme,false,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable16 = new Piece("pneu",4500,sable, pluie,tourisme,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable17 = new Piece("pneu",4500,sable, pluie,tourisme,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable18 = new Piece("pneu",4500,sable, pluie,tourisme,true,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable19 = new Piece("pneu",4500,sable, sec,duo,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable20 = new Piece("pneu",4500,sable, sec,duo,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable21 = new Piece("pneu",4500,sable, sec,duo,false,tuning,"/Images/pneusable.jpg");
		
		Piece pneusable22 = new Piece("pneu",4500,sable, sec,duo,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable23 = new Piece("pneu",4500,sable, sec,duo,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable24 = new Piece("pneu",4500,sable, sec,duo,true,tuning,"/Images/pneusable.jpg");
		
		Piece pneusable25 = new Piece("pneu",4500,sable, sec,famille,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable26 = new Piece("pneu",4500,sable, sec,famille,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable27 = new Piece("pneu",4500,sable, sec,famille,false,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable28 = new Piece("pneu",4500,sable, sec,famille,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable29 = new Piece("pneu",4500,sable, sec,famille,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable30 = new Piece("pneu",4500,sable, sec,famille,true,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable31 = new Piece("pneu",4500,sable, sec,tourisme,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable32 = new Piece("pneu",4500,sable, sec,tourisme,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable33 = new Piece("pneu",4500,sable, sec,tourisme,false,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable34 = new Piece("pneu",4500,sable, sec,tourisme,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable35 = new Piece("pneu",4500,sable, sec,tourisme,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable36 = new Piece("pneu",4500,sable, sec,tourisme,true,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable37 = new Piece("pneu",4500,sable, brouillard,duo,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable38 = new Piece("pneu",4500,sable, brouillard,duo,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable39 = new Piece("pneu",4500,sable, brouillard,duo,false,tuning,"/Images/pneusable.jpg");
		
		Piece pneusable40 = new Piece("pneu",4500,sable, brouillard,duo,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable41 = new Piece("pneu",4500,sable, brouillard,duo,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable42 = new Piece("pneu",4500,sable, brouillard,duo,true,tuning,"/Images/pneusable.jpg");
		
		Piece pneusable43 = new Piece("pneu",4500,sable, brouillard,famille,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable44 = new Piece("pneu",4500,sable, brouillard,famille,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable45 = new Piece("pneu",4500,sable, brouillard,famille,false,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable46 = new Piece("pneu",4500,sable, brouillard,famille,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable47 = new Piece("pneu",4500,sable, brouillard,famille,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable48 = new Piece("pneu",4500,sable, brouillard,famille,true,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable49 = new Piece("pneu",4500,sable, brouillard,tourisme,false,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable50 = new Piece("pneu",4500,sable, brouillard,tourisme,false,luxe,"/Images/pneusable.jpg");
		Piece pneusable51 = new Piece("pneu",4500,sable, brouillard,tourisme,false,tuning,"/Images/pneusable.jpg"); 
		
		Piece pneusable52 = new Piece("pneu",4500,sable, brouillard,tourisme,true,ecoPlus,"/Images/pneusable.jpg");
		Piece pneusable53 = new Piece("pneu",4500,sable, brouillard,tourisme,true,luxe,"/Images/pneusable.jpg");
		Piece pneusable54 = new Piece("pneu",4500,sable, brouillard,tourisme,true,tuning,"/Images/pneusable.jpg"); 
		
		
		Context.getInstance().getDaoP().save(pneusable1);
		Context.getInstance().getDaoP().save(pneusable2);
		Context.getInstance().getDaoP().save(pneusable3);
		Context.getInstance().getDaoP().save(pneusable4);
		Context.getInstance().getDaoP().save(pneusable5);
		Context.getInstance().getDaoP().save(pneusable6);
		Context.getInstance().getDaoP().save(pneusable7);
		Context.getInstance().getDaoP().save(pneusable8);
		Context.getInstance().getDaoP().save(pneusable9);
		Context.getInstance().getDaoP().save(pneusable10);
		Context.getInstance().getDaoP().save(pneusable11);
		Context.getInstance().getDaoP().save(pneusable12);
		Context.getInstance().getDaoP().save(pneusable13);
		Context.getInstance().getDaoP().save(pneusable14);
		Context.getInstance().getDaoP().save(pneusable15);
		Context.getInstance().getDaoP().save(pneusable16);
		Context.getInstance().getDaoP().save(pneusable17);
		Context.getInstance().getDaoP().save(pneusable18);
		Context.getInstance().getDaoP().save(pneusable19);
		Context.getInstance().getDaoP().save(pneusable20);
		Context.getInstance().getDaoP().save(pneusable21);
		Context.getInstance().getDaoP().save(pneusable22);
		Context.getInstance().getDaoP().save(pneusable23);
		Context.getInstance().getDaoP().save(pneusable24);
		Context.getInstance().getDaoP().save(pneusable25);
		Context.getInstance().getDaoP().save(pneusable26);
		Context.getInstance().getDaoP().save(pneusable27);
		Context.getInstance().getDaoP().save(pneusable28);
		Context.getInstance().getDaoP().save(pneusable29);
		Context.getInstance().getDaoP().save(pneusable30);
		Context.getInstance().getDaoP().save(pneusable31);
		Context.getInstance().getDaoP().save(pneusable32);
		Context.getInstance().getDaoP().save(pneusable33);
		Context.getInstance().getDaoP().save(pneusable34);
		Context.getInstance().getDaoP().save(pneusable35);
		Context.getInstance().getDaoP().save(pneusable36);
		Context.getInstance().getDaoP().save(pneusable37);
		Context.getInstance().getDaoP().save(pneusable38);
		Context.getInstance().getDaoP().save(pneusable39);
		Context.getInstance().getDaoP().save(pneusable40);
		Context.getInstance().getDaoP().save(pneusable41);
		Context.getInstance().getDaoP().save(pneusable42);
		Context.getInstance().getDaoP().save(pneusable43);
		Context.getInstance().getDaoP().save(pneusable44);
		Context.getInstance().getDaoP().save(pneusable45);
		Context.getInstance().getDaoP().save(pneusable46);
		Context.getInstance().getDaoP().save(pneusable47);
		Context.getInstance().getDaoP().save(pneusable48);
		Context.getInstance().getDaoP().save(pneusable49);
		Context.getInstance().getDaoP().save(pneusable50);
		Context.getInstance().getDaoP().save(pneusable51);
		Context.getInstance().getDaoP().save(pneusable52);
		Context.getInstance().getDaoP().save(pneusable53);
		Context.getInstance().getDaoP().save(pneusable54);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece pneuglace1 = new Piece("pneu",4500,glace, pluie,duo,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace2 = new Piece("pneu",4500,glace, pluie,duo,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace3 = new Piece("pneu",4500,glace, pluie,duo,false,tuning,"/Images/pneuglace.jpg");
		
		Piece pneuglace4 = new Piece("pneu",4500,glace, pluie,duo,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace5 = new Piece("pneu",4500,glace, pluie,duo,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace6 = new Piece("pneu",4500,glace, pluie,duo,true,tuning,"/Images/pneuglace.jpg");
		
		Piece pneuglace7 = new Piece("pneu",4500,glace, pluie,famille,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace8 = new Piece("pneu",4500,glace, pluie,famille,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace9 = new Piece("pneu",4500,glace, pluie,famille,false,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace10 = new Piece("pneu",4500,glace, pluie,famille,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace11 = new Piece("pneu",4500,glace, pluie,famille,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace12 = new Piece("pneu",4500,glace, pluie,famille,true,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace13 = new Piece("pneu",4500,glace, pluie,tourisme,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace14 = new Piece("pneu",4500,glace, pluie,tourisme,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace15 = new Piece("pneu",4500,glace, pluie,tourisme,false,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace16 = new Piece("pneu",4500,glace, pluie,tourisme,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace17 = new Piece("pneu",4500,glace, pluie,tourisme,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace18 = new Piece("pneu",4500,glace, pluie,tourisme,true,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace19 = new Piece("pneu",4500,glace, sec,duo,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace20 = new Piece("pneu",4500,glace, sec,duo,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace21 = new Piece("pneu",4500,glace, sec,duo,false,tuning,"/Images/pneuglace.jpg");
		
		Piece pneuglace22 = new Piece("pneu",4500,glace, sec,duo,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace23 = new Piece("pneu",4500,glace, sec,duo,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace24 = new Piece("pneu",4500,glace, sec,duo,true,tuning,"/Images/pneuglace.jpg");
		
		Piece pneuglace25 = new Piece("pneu",4500,glace, sec,famille,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace26 = new Piece("pneu",4500,glace, sec,famille,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace27 = new Piece("pneu",4500,glace, sec,famille,false,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace28 = new Piece("pneu",4500,glace, sec,famille,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace29 = new Piece("pneu",4500,glace, sec,famille,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace30 = new Piece("pneu",4500,glace, sec,famille,true,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace31 = new Piece("pneu",4500,glace, sec,tourisme,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace32 = new Piece("pneu",4500,glace, sec,tourisme,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace33 = new Piece("pneu",4500,glace, sec,tourisme,false,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace34 = new Piece("pneu",4500,glace, sec,tourisme,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace35 = new Piece("pneu",4500,glace, sec,tourisme,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace36 = new Piece("pneu",4500,glace, sec,tourisme,true,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace37 = new Piece("pneu",4500,glace, brouillard,duo,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace38 = new Piece("pneu",4500,glace, brouillard,duo,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace39 = new Piece("pneu",4500,glace, brouillard,duo,false,tuning,"/Images/pneuglace.jpg");
		
		Piece pneuglace40 = new Piece("pneu",4500,glace, brouillard,duo,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace41 = new Piece("pneu",4500,glace, brouillard,duo,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace42 = new Piece("pneu",4500,glace, brouillard,duo,true,tuning,"/Images/pneuglace.jpg");
		
		Piece pneuglace43 = new Piece("pneu",4500,glace, brouillard,famille,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace44 = new Piece("pneu",4500,glace, brouillard,famille,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace45 = new Piece("pneu",4500,glace, brouillard,famille,false,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace46 = new Piece("pneu",4500,glace, brouillard,famille,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace47 = new Piece("pneu",4500,glace, brouillard,famille,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace48 = new Piece("pneu",4500,glace, brouillard,famille,true,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace49 = new Piece("pneu",4500,glace, brouillard,tourisme,false,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace50 = new Piece("pneu",4500,glace, brouillard,tourisme,false,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace51 = new Piece("pneu",4500,glace, brouillard,tourisme,false,tuning,"/Images/pneuglace.jpg"); 
		
		Piece pneuglace52 = new Piece("pneu",4500,glace, brouillard,tourisme,true,ecoPlus,"/Images/pneuglace.jpg");
		Piece pneuglace53 = new Piece("pneu",4500,glace, brouillard,tourisme,true,luxe,"/Images/pneuglace.jpg");
		Piece pneuglace54 = new Piece("pneu",4500,glace, brouillard,tourisme,true,tuning,"/Images/pneuglace.jpg"); 
		
		Context.getInstance().getDaoP().save(pneuglace1);
		Context.getInstance().getDaoP().save(pneuglace2);
		Context.getInstance().getDaoP().save(pneuglace3);
		Context.getInstance().getDaoP().save(pneuglace4);
		Context.getInstance().getDaoP().save(pneuglace5);
		Context.getInstance().getDaoP().save(pneuglace6);
		Context.getInstance().getDaoP().save(pneuglace7);
		Context.getInstance().getDaoP().save(pneuglace8);
		Context.getInstance().getDaoP().save(pneuglace9);
		Context.getInstance().getDaoP().save(pneuglace10);
		Context.getInstance().getDaoP().save(pneuglace11);
		Context.getInstance().getDaoP().save(pneuglace12);
		Context.getInstance().getDaoP().save(pneuglace13);
		Context.getInstance().getDaoP().save(pneuglace14);
		Context.getInstance().getDaoP().save(pneuglace15);
		Context.getInstance().getDaoP().save(pneuglace16);
		Context.getInstance().getDaoP().save(pneuglace17);
		Context.getInstance().getDaoP().save(pneuglace18);
		Context.getInstance().getDaoP().save(pneuglace19);
		Context.getInstance().getDaoP().save(pneuglace20);
		Context.getInstance().getDaoP().save(pneuglace21);
		Context.getInstance().getDaoP().save(pneuglace22);
		Context.getInstance().getDaoP().save(pneuglace23);
		Context.getInstance().getDaoP().save(pneuglace24);
		Context.getInstance().getDaoP().save(pneuglace25);
		Context.getInstance().getDaoP().save(pneuglace26);
		Context.getInstance().getDaoP().save(pneuglace27);
		Context.getInstance().getDaoP().save(pneuglace28);
		Context.getInstance().getDaoP().save(pneuglace29);
		Context.getInstance().getDaoP().save(pneuglace30);
		Context.getInstance().getDaoP().save(pneuglace31);
		Context.getInstance().getDaoP().save(pneuglace32);
		Context.getInstance().getDaoP().save(pneuglace33);
		Context.getInstance().getDaoP().save(pneuglace34);
		Context.getInstance().getDaoP().save(pneuglace35);
		Context.getInstance().getDaoP().save(pneuglace36);
		Context.getInstance().getDaoP().save(pneuglace37);
		Context.getInstance().getDaoP().save(pneuglace38);
		Context.getInstance().getDaoP().save(pneuglace39);
		Context.getInstance().getDaoP().save(pneuglace40);
		Context.getInstance().getDaoP().save(pneuglace41);
		Context.getInstance().getDaoP().save(pneuglace42);
		Context.getInstance().getDaoP().save(pneuglace43);
		Context.getInstance().getDaoP().save(pneuglace44);
		Context.getInstance().getDaoP().save(pneuglace45);
		Context.getInstance().getDaoP().save(pneuglace46);
		Context.getInstance().getDaoP().save(pneuglace47);
		Context.getInstance().getDaoP().save(pneuglace48);
		Context.getInstance().getDaoP().save(pneuglace49);
		Context.getInstance().getDaoP().save(pneuglace50);
		Context.getInstance().getDaoP().save(pneuglace51);
		Context.getInstance().getDaoP().save(pneuglace52);
		Context.getInstance().getDaoP().save(pneuglace53);
		Context.getInstance().getDaoP().save(pneuglace54);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Piece pneubitume1 = new Piece("pneu",4500,bitume, pluie,duo,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume2 = new Piece("pneu",4500,bitume, pluie,duo,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume3 = new Piece("pneu",4500,bitume, pluie,duo,false,tuning,"/Images/pneubitume.jpg");
		
		Piece pneubitume4 = new Piece("pneu",4500,bitume, pluie,duo,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume5 = new Piece("pneu",4500,bitume, pluie,duo,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume6 = new Piece("pneu",4500,bitume, pluie,duo,true,tuning,"/Images/pneubitume.jpg");
		
		Piece pneubitume7 = new Piece("pneu",4500,bitume, pluie,famille,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume8 = new Piece("pneu",4500,bitume, pluie,famille,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume9 = new Piece("pneu",4500,bitume, pluie,famille,false,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume10 = new Piece("pneu",4500,bitume, pluie,famille,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume11 = new Piece("pneu",4500,bitume, pluie,famille,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume12 = new Piece("pneu",4500,bitume, pluie,famille,true,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume13 = new Piece("pneu",4500,bitume, pluie,tourisme,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume14 = new Piece("pneu",4500,bitume, pluie,tourisme,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume15 = new Piece("pneu",4500,bitume, pluie,tourisme,false,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume16 = new Piece("pneu",4500,bitume, pluie,tourisme,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume17 = new Piece("pneu",4500,bitume, pluie,tourisme,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume18 = new Piece("pneu",4500,bitume, pluie,tourisme,true,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume19 = new Piece("pneu",4500,bitume, sec,duo,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume20 = new Piece("pneu",4500,bitume, sec,duo,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume21 = new Piece("pneu",4500,bitume, sec,duo,false,tuning,"/Images/pneubitume.jpg");
		
		Piece pneubitume22 = new Piece("pneu",4500,bitume, sec,duo,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume23 = new Piece("pneu",4500,bitume, sec,duo,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume24 = new Piece("pneu",4500,bitume, sec,duo,true,tuning,"/Images/pneubitume.jpg");
		
		Piece pneubitume25 = new Piece("pneu",4500,bitume, sec,famille,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume26 = new Piece("pneu",4500,bitume, sec,famille,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume27 = new Piece("pneu",4500,bitume, sec,famille,false,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume28 = new Piece("pneu",4500,bitume, sec,famille,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume29 = new Piece("pneu",4500,bitume, sec,famille,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume30 = new Piece("pneu",4500,bitume, sec,famille,true,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume31 = new Piece("pneu",4500,bitume, sec,tourisme,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume32 = new Piece("pneu",4500,bitume, sec,tourisme,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume33 = new Piece("pneu",4500,bitume, sec,tourisme,false,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume34 = new Piece("pneu",4500,bitume, sec,tourisme,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume35 = new Piece("pneu",4500,bitume, sec,tourisme,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume36 = new Piece("pneu",4500,bitume, sec,tourisme,true,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume37 = new Piece("pneu",4500,bitume, brouillard,duo,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume38 = new Piece("pneu",4500,bitume, brouillard,duo,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume39 = new Piece("pneu",4500,bitume, brouillard,duo,false,tuning,"/Images/pneubitume.jpg");
		
		Piece pneubitume40 = new Piece("pneu",4500,bitume, brouillard,duo,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume41 = new Piece("pneu",4500,bitume, brouillard,duo,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume42 = new Piece("pneu",4500,bitume, brouillard,duo,true,tuning,"/Images/pneubitume.jpg");
		
		Piece pneubitume43 = new Piece("pneu",4500,bitume, brouillard,famille,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume44 = new Piece("pneu",4500,bitume, brouillard,famille,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume45 = new Piece("pneu",4500,bitume, brouillard,famille,false,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume46 = new Piece("pneu",4500,bitume, brouillard,famille,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume47 = new Piece("pneu",4500,bitume, brouillard,famille,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume48 = new Piece("pneu",4500,bitume, brouillard,famille,true,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume49 = new Piece("pneu",4500,bitume, brouillard,tourisme,false,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume50 = new Piece("pneu",4500,bitume, brouillard,tourisme,false,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume51 = new Piece("pneu",4500,bitume, brouillard,tourisme,false,tuning,"/Images/pneubitume.jpg"); 
		
		Piece pneubitume52 = new Piece("pneu",4500,bitume, brouillard,tourisme,true,ecoPlus,"/Images/pneubitume.jpg");
		Piece pneubitume53 = new Piece("pneu",4500,bitume, brouillard,tourisme,true,luxe,"/Images/pneubitume.jpg");
		Piece pneubitume54 = new Piece("pneu",4500,bitume, brouillard,tourisme,true,tuning,"/Images/pneubitume.jpg"); 
		
		Context.getInstance().getDaoP().save(pneubitume1);
		Context.getInstance().getDaoP().save(pneubitume2);
		Context.getInstance().getDaoP().save(pneubitume3);
		Context.getInstance().getDaoP().save(pneubitume4);
		Context.getInstance().getDaoP().save(pneubitume5);
		Context.getInstance().getDaoP().save(pneubitume6);
		Context.getInstance().getDaoP().save(pneubitume7);
		Context.getInstance().getDaoP().save(pneubitume8);
		Context.getInstance().getDaoP().save(pneubitume9);
		Context.getInstance().getDaoP().save(pneubitume10);
		Context.getInstance().getDaoP().save(pneubitume11);
		Context.getInstance().getDaoP().save(pneubitume12);
		Context.getInstance().getDaoP().save(pneubitume13);
		Context.getInstance().getDaoP().save(pneubitume14);
		Context.getInstance().getDaoP().save(pneubitume15);
		Context.getInstance().getDaoP().save(pneubitume16);
		Context.getInstance().getDaoP().save(pneubitume17);
		Context.getInstance().getDaoP().save(pneubitume18);
		Context.getInstance().getDaoP().save(pneubitume19);
		Context.getInstance().getDaoP().save(pneubitume20);
		Context.getInstance().getDaoP().save(pneubitume21);
		Context.getInstance().getDaoP().save(pneubitume22);
		Context.getInstance().getDaoP().save(pneubitume23);
		Context.getInstance().getDaoP().save(pneubitume24);
		Context.getInstance().getDaoP().save(pneubitume25);
		Context.getInstance().getDaoP().save(pneubitume26);
		Context.getInstance().getDaoP().save(pneubitume27);
		Context.getInstance().getDaoP().save(pneubitume28);
		Context.getInstance().getDaoP().save(pneubitume29);
		Context.getInstance().getDaoP().save(pneubitume30);
		Context.getInstance().getDaoP().save(pneubitume31);
		Context.getInstance().getDaoP().save(pneubitume32);
		Context.getInstance().getDaoP().save(pneubitume33);
		Context.getInstance().getDaoP().save(pneubitume34);
		Context.getInstance().getDaoP().save(pneubitume35);
		Context.getInstance().getDaoP().save(pneubitume36);
		Context.getInstance().getDaoP().save(pneubitume37);
		Context.getInstance().getDaoP().save(pneubitume38);
		Context.getInstance().getDaoP().save(pneubitume39);
		Context.getInstance().getDaoP().save(pneubitume40);
		Context.getInstance().getDaoP().save(pneubitume41);
		Context.getInstance().getDaoP().save(pneubitume42);
		Context.getInstance().getDaoP().save(pneubitume43);
		Context.getInstance().getDaoP().save(pneubitume44);
		Context.getInstance().getDaoP().save(pneubitume45);
		Context.getInstance().getDaoP().save(pneubitume46);
		Context.getInstance().getDaoP().save(pneubitume47);
		Context.getInstance().getDaoP().save(pneubitume48);
		Context.getInstance().getDaoP().save(pneubitume49);
		Context.getInstance().getDaoP().save(pneubitume50);
		Context.getInstance().getDaoP().save(pneubitume51);
		Context.getInstance().getDaoP().save(pneubitume52);
		Context.getInstance().getDaoP().save(pneubitume53);
		Context.getInstance().getDaoP().save(pneubitume54);
		
	}

}
