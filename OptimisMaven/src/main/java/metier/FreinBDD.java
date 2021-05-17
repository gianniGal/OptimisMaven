package metier;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;

public class FreinBDD {
	
	public static void donneeFreinBDD() {
		
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
		
		Piece freinterre1 = new Piece("frein",4500,terre, pluie,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre2 = new Piece("frein",4500,terre, pluie,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre3 = new Piece("frein",4500,terre, pluie,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinterre4 = new Piece("frein",4500,terre, pluie,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre5 = new Piece("frein",4500,terre, pluie,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre6 = new Piece("frein",4500,terre, pluie,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinterre7 = new Piece("frein",4500,terre, pluie,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre8 = new Piece("frein",4500,terre, pluie,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre9 = new Piece("frein",4500,terre, pluie,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre10 = new Piece("frein",4500,terre, pluie,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre11 = new Piece("frein",4500,terre, pluie,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre12 = new Piece("frein",4500,terre, pluie,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre13 = new Piece("frein",4500,terre, pluie,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre14 = new Piece("frein",4500,terre, pluie,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre15 = new Piece("frein",4500,terre, pluie,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre16 = new Piece("frein",4500,terre, pluie,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre17 = new Piece("frein",4500,terre, pluie,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre18 = new Piece("frein",4500,terre, pluie,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre19 = new Piece("frein",4500,terre, sec,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre20 = new Piece("frein",4500,terre, sec,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre21 = new Piece("frein",4500,terre, sec,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinterre22 = new Piece("frein",4500,terre, sec,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre23 = new Piece("frein",4500,terre, sec,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre24 = new Piece("frein",4500,terre, sec,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinterre25 = new Piece("frein",4500,terre, sec,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre26 = new Piece("frein",4500,terre, sec,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre27 = new Piece("frein",4500,terre, sec,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre28 = new Piece("frein",4500,terre, sec,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre29 = new Piece("frein",4500,terre, sec,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre30 = new Piece("frein",4500,terre, sec,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre31 = new Piece("frein",4500,terre, sec,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre32 = new Piece("frein",4500,terre, sec,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre33 = new Piece("frein",4500,terre, sec,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre34 = new Piece("frein",4500,terre, sec,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre35 = new Piece("frein",4500,terre, sec,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre36 = new Piece("frein",4500,terre, sec,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre37 = new Piece("frein",4500,terre, brouillard,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre38 = new Piece("frein",4500,terre, brouillard,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre39 = new Piece("frein",4500,terre, brouillard,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinterre40 = new Piece("frein",4500,terre, brouillard,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre41 = new Piece("frein",4500,terre, brouillard,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre42 = new Piece("frein",4500,terre, brouillard,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinterre43 = new Piece("frein",4500,terre, brouillard,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre44 = new Piece("frein",4500,terre, brouillard,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre45 = new Piece("frein",4500,terre, brouillard,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre46 = new Piece("frein",4500,terre, brouillard,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre47 = new Piece("frein",4500,terre, brouillard,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre48 = new Piece("frein",4500,terre, brouillard,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre49 = new Piece("frein",4500,terre, brouillard,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre50 = new Piece("frein",4500,terre, brouillard,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre51 = new Piece("frein",4500,terre, brouillard,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinterre52 = new Piece("frein",4500,terre, brouillard,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinterre53 = new Piece("frein",4500,terre, brouillard,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinterre54 = new Piece("frein",4500,terre, brouillard,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Context.getInstance().getDaoP().save(freinterre1);
		Context.getInstance().getDaoP().save(freinterre2);
		Context.getInstance().getDaoP().save(freinterre3);
		Context.getInstance().getDaoP().save(freinterre4);
		Context.getInstance().getDaoP().save(freinterre5);
		Context.getInstance().getDaoP().save(freinterre6);
		Context.getInstance().getDaoP().save(freinterre7);
		Context.getInstance().getDaoP().save(freinterre8);
		Context.getInstance().getDaoP().save(freinterre9);
		Context.getInstance().getDaoP().save(freinterre10);
		Context.getInstance().getDaoP().save(freinterre11);
		Context.getInstance().getDaoP().save(freinterre12);
		Context.getInstance().getDaoP().save(freinterre13);
		Context.getInstance().getDaoP().save(freinterre14);
		Context.getInstance().getDaoP().save(freinterre15);
		Context.getInstance().getDaoP().save(freinterre16);
		Context.getInstance().getDaoP().save(freinterre17);
		Context.getInstance().getDaoP().save(freinterre18);
		Context.getInstance().getDaoP().save(freinterre19);
		Context.getInstance().getDaoP().save(freinterre20);
		Context.getInstance().getDaoP().save(freinterre21);
		Context.getInstance().getDaoP().save(freinterre22);
		Context.getInstance().getDaoP().save(freinterre23);
		Context.getInstance().getDaoP().save(freinterre24);
		Context.getInstance().getDaoP().save(freinterre25);
		Context.getInstance().getDaoP().save(freinterre26);
		Context.getInstance().getDaoP().save(freinterre27);
		Context.getInstance().getDaoP().save(freinterre28);
		Context.getInstance().getDaoP().save(freinterre29);
		Context.getInstance().getDaoP().save(freinterre30);
		Context.getInstance().getDaoP().save(freinterre31);
		Context.getInstance().getDaoP().save(freinterre32);
		Context.getInstance().getDaoP().save(freinterre33);
		Context.getInstance().getDaoP().save(freinterre34);
		Context.getInstance().getDaoP().save(freinterre35);
		Context.getInstance().getDaoP().save(freinterre36);
		Context.getInstance().getDaoP().save(freinterre37);
		Context.getInstance().getDaoP().save(freinterre38);
		Context.getInstance().getDaoP().save(freinterre39);
		Context.getInstance().getDaoP().save(freinterre40);
		Context.getInstance().getDaoP().save(freinterre41);
		Context.getInstance().getDaoP().save(freinterre42);
		Context.getInstance().getDaoP().save(freinterre43);
		Context.getInstance().getDaoP().save(freinterre44);
		Context.getInstance().getDaoP().save(freinterre45);
		Context.getInstance().getDaoP().save(freinterre46);
		Context.getInstance().getDaoP().save(freinterre47);
		Context.getInstance().getDaoP().save(freinterre48);
		Context.getInstance().getDaoP().save(freinterre49);
		Context.getInstance().getDaoP().save(freinterre50);
		Context.getInstance().getDaoP().save(freinterre51);
		Context.getInstance().getDaoP().save(freinterre52);
		Context.getInstance().getDaoP().save(freinterre53);
		Context.getInstance().getDaoP().save(freinterre54);

		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece freinsable1 = new Piece("frein",250,sable, pluie,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable2 = new Piece("frein",1000,sable, pluie,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable3 = new Piece("frein",500,sable, pluie,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinsable4 = new Piece("frein",4500,sable, pluie,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable5 = new Piece("frein",4500,sable, pluie,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable6 = new Piece("frein",4500,sable, pluie,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinsable7 = new Piece("frein",4500,sable, pluie,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable8 = new Piece("frein",4500,sable, pluie,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable9 = new Piece("frein",4500,sable, pluie,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable10 = new Piece("frein",4500,sable, pluie,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable11 = new Piece("frein",4500,sable, pluie,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable12 = new Piece("frein",4500,sable, pluie,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable13 = new Piece("frein",4500,sable, pluie,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable14 = new Piece("frein",4500,sable, pluie,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable15 = new Piece("frein",4500,sable, pluie,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable16 = new Piece("frein",4500,sable, pluie,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable17 = new Piece("frein",4500,sable, pluie,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable18 = new Piece("frein",4500,sable, pluie,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable19 = new Piece("frein",4500,sable, sec,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable20 = new Piece("frein",4500,sable, sec,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable21 = new Piece("frein",4500,sable, sec,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinsable22 = new Piece("frein",4500,sable, sec,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable23 = new Piece("frein",4500,sable, sec,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable24 = new Piece("frein",4500,sable, sec,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinsable25 = new Piece("frein",4500,sable, sec,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable26 = new Piece("frein",4500,sable, sec,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable27 = new Piece("frein",4500,sable, sec,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable28 = new Piece("frein",4500,sable, sec,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable29 = new Piece("frein",4500,sable, sec,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable30 = new Piece("frein",4500,sable, sec,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable31 = new Piece("frein",4500,sable, sec,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable32 = new Piece("frein",4500,sable, sec,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable33 = new Piece("frein",4500,sable, sec,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable34 = new Piece("frein",4500,sable, sec,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable35 = new Piece("frein",4500,sable, sec,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable36 = new Piece("frein",4500,sable, sec,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable37 = new Piece("frein",4500,sable, brouillard,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable38 = new Piece("frein",4500,sable, brouillard,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable39 = new Piece("frein",4500,sable, brouillard,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinsable40 = new Piece("frein",4500,sable, brouillard,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable41 = new Piece("frein",4500,sable, brouillard,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable42 = new Piece("frein",4500,sable, brouillard,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinsable43 = new Piece("frein",4500,sable, brouillard,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable44 = new Piece("frein",4500,sable, brouillard,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable45 = new Piece("frein",4500,sable, brouillard,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable46 = new Piece("frein",4500,sable, brouillard,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable47 = new Piece("frein",4500,sable, brouillard,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable48 = new Piece("frein",4500,sable, brouillard,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable49 = new Piece("frein",4500,sable, brouillard,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable50 = new Piece("frein",4500,sable, brouillard,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable51 = new Piece("frein",4500,sable, brouillard,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinsable52 = new Piece("frein",4500,sable, brouillard,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinsable53 = new Piece("frein",4500,sable, brouillard,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinsable54 = new Piece("frein",4500,sable, brouillard,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		
		Context.getInstance().getDaoP().save(freinsable1);
		Context.getInstance().getDaoP().save(freinsable2);
		Context.getInstance().getDaoP().save(freinsable3);
		Context.getInstance().getDaoP().save(freinsable4);
		Context.getInstance().getDaoP().save(freinsable5);
		Context.getInstance().getDaoP().save(freinsable6);
		Context.getInstance().getDaoP().save(freinsable7);
		Context.getInstance().getDaoP().save(freinsable8);
		Context.getInstance().getDaoP().save(freinsable9);
		Context.getInstance().getDaoP().save(freinsable10);
		Context.getInstance().getDaoP().save(freinsable11);
		Context.getInstance().getDaoP().save(freinsable12);
		Context.getInstance().getDaoP().save(freinsable13);
		Context.getInstance().getDaoP().save(freinsable14);
		Context.getInstance().getDaoP().save(freinsable15);
		Context.getInstance().getDaoP().save(freinsable16);
		Context.getInstance().getDaoP().save(freinsable17);
		Context.getInstance().getDaoP().save(freinsable18);
		Context.getInstance().getDaoP().save(freinsable19);
		Context.getInstance().getDaoP().save(freinsable20);
		Context.getInstance().getDaoP().save(freinsable21);
		Context.getInstance().getDaoP().save(freinsable22);
		Context.getInstance().getDaoP().save(freinsable23);
		Context.getInstance().getDaoP().save(freinsable24);
		Context.getInstance().getDaoP().save(freinsable25);
		Context.getInstance().getDaoP().save(freinsable26);
		Context.getInstance().getDaoP().save(freinsable27);
		Context.getInstance().getDaoP().save(freinsable28);
		Context.getInstance().getDaoP().save(freinsable29);
		Context.getInstance().getDaoP().save(freinsable30);
		Context.getInstance().getDaoP().save(freinsable31);
		Context.getInstance().getDaoP().save(freinsable32);
		Context.getInstance().getDaoP().save(freinsable33);
		Context.getInstance().getDaoP().save(freinsable34);
		Context.getInstance().getDaoP().save(freinsable35);
		Context.getInstance().getDaoP().save(freinsable36);
		Context.getInstance().getDaoP().save(freinsable37);
		Context.getInstance().getDaoP().save(freinsable38);
		Context.getInstance().getDaoP().save(freinsable39);
		Context.getInstance().getDaoP().save(freinsable40);
		Context.getInstance().getDaoP().save(freinsable41);
		Context.getInstance().getDaoP().save(freinsable42);
		Context.getInstance().getDaoP().save(freinsable43);
		Context.getInstance().getDaoP().save(freinsable44);
		Context.getInstance().getDaoP().save(freinsable45);
		Context.getInstance().getDaoP().save(freinsable46);
		Context.getInstance().getDaoP().save(freinsable47);
		Context.getInstance().getDaoP().save(freinsable48);
		Context.getInstance().getDaoP().save(freinsable49);
		Context.getInstance().getDaoP().save(freinsable50);
		Context.getInstance().getDaoP().save(freinsable51);
		Context.getInstance().getDaoP().save(freinsable52);
		Context.getInstance().getDaoP().save(freinsable53);
		Context.getInstance().getDaoP().save(freinsable54);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece freinglace1 = new Piece("frein",4500,glace, pluie,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace2 = new Piece("frein",4500,glace, pluie,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace3 = new Piece("frein",4500,glace, pluie,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinglace4 = new Piece("frein",4500,glace, pluie,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace5 = new Piece("frein",4500,glace, pluie,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace6 = new Piece("frein",4500,glace, pluie,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinglace7 = new Piece("frein",4500,glace, pluie,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace8 = new Piece("frein",4500,glace, pluie,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace9 = new Piece("frein",4500,glace, pluie,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace10 = new Piece("frein",4500,glace, pluie,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace11 = new Piece("frein",4500,glace, pluie,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace12 = new Piece("frein",4500,glace, pluie,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace13 = new Piece("frein",4500,glace, pluie,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace14 = new Piece("frein",4500,glace, pluie,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace15 = new Piece("frein",4500,glace, pluie,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace16 = new Piece("frein",4500,glace, pluie,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace17 = new Piece("frein",4500,glace, pluie,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace18 = new Piece("frein",4500,glace, pluie,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace19 = new Piece("frein",4500,glace, sec,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace20 = new Piece("frein",4500,glace, sec,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace21 = new Piece("frein",4500,glace, sec,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinglace22 = new Piece("frein",4500,glace, sec,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace23 = new Piece("frein",4500,glace, sec,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace24 = new Piece("frein",4500,glace, sec,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinglace25 = new Piece("frein",4500,glace, sec,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace26 = new Piece("frein",4500,glace, sec,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace27 = new Piece("frein",4500,glace, sec,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace28 = new Piece("frein",4500,glace, sec,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace29 = new Piece("frein",4500,glace, sec,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace30 = new Piece("frein",4500,glace, sec,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace31 = new Piece("frein",4500,glace, sec,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace32 = new Piece("frein",4500,glace, sec,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace33 = new Piece("frein",4500,glace, sec,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace34 = new Piece("frein",4500,glace, sec,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace35 = new Piece("frein",4500,glace, sec,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace36 = new Piece("frein",4500,glace, sec,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace37 = new Piece("frein",4500,glace, brouillard,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace38 = new Piece("frein",4500,glace, brouillard,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace39 = new Piece("frein",4500,glace, brouillard,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinglace40 = new Piece("frein",4500,glace, brouillard,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace41 = new Piece("frein",4500,glace, brouillard,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace42 = new Piece("frein",4500,glace, brouillard,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinglace43 = new Piece("frein",4500,glace, brouillard,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace44 = new Piece("frein",4500,glace, brouillard,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace45 = new Piece("frein",4500,glace, brouillard,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace46 = new Piece("frein",4500,glace, brouillard,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace47 = new Piece("frein",4500,glace, brouillard,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace48 = new Piece("frein",4500,glace, brouillard,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace49 = new Piece("frein",4500,glace, brouillard,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace50 = new Piece("frein",4500,glace, brouillard,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace51 = new Piece("frein",4500,glace, brouillard,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinglace52 = new Piece("frein",4500,glace, brouillard,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinglace53 = new Piece("frein",4500,glace, brouillard,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinglace54 = new Piece("frein",4500,glace, brouillard,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Context.getInstance().getDaoP().save(freinglace1);
		Context.getInstance().getDaoP().save(freinglace2);
		Context.getInstance().getDaoP().save(freinglace3);
		Context.getInstance().getDaoP().save(freinglace4);
		Context.getInstance().getDaoP().save(freinglace5);
		Context.getInstance().getDaoP().save(freinglace6);
		Context.getInstance().getDaoP().save(freinglace7);
		Context.getInstance().getDaoP().save(freinglace8);
		Context.getInstance().getDaoP().save(freinglace9);
		Context.getInstance().getDaoP().save(freinglace10);
		Context.getInstance().getDaoP().save(freinglace11);
		Context.getInstance().getDaoP().save(freinglace12);
		Context.getInstance().getDaoP().save(freinglace13);
		Context.getInstance().getDaoP().save(freinglace14);
		Context.getInstance().getDaoP().save(freinglace15);
		Context.getInstance().getDaoP().save(freinglace16);
		Context.getInstance().getDaoP().save(freinglace17);
		Context.getInstance().getDaoP().save(freinglace18);
		Context.getInstance().getDaoP().save(freinglace19);
		Context.getInstance().getDaoP().save(freinglace20);
		Context.getInstance().getDaoP().save(freinglace21);
		Context.getInstance().getDaoP().save(freinglace22);
		Context.getInstance().getDaoP().save(freinglace23);
		Context.getInstance().getDaoP().save(freinglace24);
		Context.getInstance().getDaoP().save(freinglace25);
		Context.getInstance().getDaoP().save(freinglace26);
		Context.getInstance().getDaoP().save(freinglace27);
		Context.getInstance().getDaoP().save(freinglace28);
		Context.getInstance().getDaoP().save(freinglace29);
		Context.getInstance().getDaoP().save(freinglace30);
		Context.getInstance().getDaoP().save(freinglace31);
		Context.getInstance().getDaoP().save(freinglace32);
		Context.getInstance().getDaoP().save(freinglace33);
		Context.getInstance().getDaoP().save(freinglace34);
		Context.getInstance().getDaoP().save(freinglace35);
		Context.getInstance().getDaoP().save(freinglace36);
		Context.getInstance().getDaoP().save(freinglace37);
		Context.getInstance().getDaoP().save(freinglace38);
		Context.getInstance().getDaoP().save(freinglace39);
		Context.getInstance().getDaoP().save(freinglace40);
		Context.getInstance().getDaoP().save(freinglace41);
		Context.getInstance().getDaoP().save(freinglace42);
		Context.getInstance().getDaoP().save(freinglace43);
		Context.getInstance().getDaoP().save(freinglace44);
		Context.getInstance().getDaoP().save(freinglace45);
		Context.getInstance().getDaoP().save(freinglace46);
		Context.getInstance().getDaoP().save(freinglace47);
		Context.getInstance().getDaoP().save(freinglace48);
		Context.getInstance().getDaoP().save(freinglace49);
		Context.getInstance().getDaoP().save(freinglace50);
		Context.getInstance().getDaoP().save(freinglace51);
		Context.getInstance().getDaoP().save(freinglace52);
		Context.getInstance().getDaoP().save(freinglace53);
		Context.getInstance().getDaoP().save(freinglace54);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Piece freinbitume1 = new Piece("frein",4500,bitume, pluie,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume2 = new Piece("frein",4500,bitume, pluie,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume3 = new Piece("frein",4500,bitume, pluie,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinbitume4 = new Piece("frein",4500,bitume, pluie,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume5 = new Piece("frein",4500,bitume, pluie,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume6 = new Piece("frein",4500,bitume, pluie,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinbitume7 = new Piece("frein",4500,bitume, pluie,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume8 = new Piece("frein",4500,bitume, pluie,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume9 = new Piece("frein",4500,bitume, pluie,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume10 = new Piece("frein",4500,bitume, pluie,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume11 = new Piece("frein",4500,bitume, pluie,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume12 = new Piece("frein",4500,bitume, pluie,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume13 = new Piece("frein",4500,bitume, pluie,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume14 = new Piece("frein",4500,bitume, pluie,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume15 = new Piece("frein",4500,bitume, pluie,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume16 = new Piece("frein",4500,bitume, pluie,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume17 = new Piece("frein",4500,bitume, pluie,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume18 = new Piece("frein",4500,bitume, pluie,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume19 = new Piece("frein",4500,bitume, sec,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume20 = new Piece("frein",4500,bitume, sec,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume21 = new Piece("frein",4500,bitume, sec,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinbitume22 = new Piece("frein",4500,bitume, sec,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume23 = new Piece("frein",4500,bitume, sec,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume24 = new Piece("frein",4500,bitume, sec,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinbitume25 = new Piece("frein",4500,bitume, sec,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume26 = new Piece("frein",4500,bitume, sec,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume27 = new Piece("frein",4500,bitume, sec,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume28 = new Piece("frein",4500,bitume, sec,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume29 = new Piece("frein",4500,bitume, sec,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume30 = new Piece("frein",4500,bitume, sec,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume31 = new Piece("frein",4500,bitume, sec,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume32 = new Piece("frein",4500,bitume, sec,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume33 = new Piece("frein",4500,bitume, sec,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume34 = new Piece("frein",4500,bitume, sec,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume35 = new Piece("frein",4500,bitume, sec,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume36 = new Piece("frein",4500,bitume, sec,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume37 = new Piece("frein",4500,bitume, brouillard,duo,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume38 = new Piece("frein",4500,bitume, brouillard,duo,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume39 = new Piece("frein",4500,bitume, brouillard,duo,false,tuning,"/Images/freinSport.jpg");
		
		Piece freinbitume40 = new Piece("frein",4500,bitume, brouillard,duo,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume41 = new Piece("frein",4500,bitume, brouillard,duo,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume42 = new Piece("frein",4500,bitume, brouillard,duo,true,tuning,"/Images/freinSport.jpg");
		
		Piece freinbitume43 = new Piece("frein",4500,bitume, brouillard,famille,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume44 = new Piece("frein",4500,bitume, brouillard,famille,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume45 = new Piece("frein",4500,bitume, brouillard,famille,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume46 = new Piece("frein",4500,bitume, brouillard,famille,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume47 = new Piece("frein",4500,bitume, brouillard,famille,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume48 = new Piece("frein",4500,bitume, brouillard,famille,true,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume49 = new Piece("frein",4500,bitume, brouillard,tourisme,false,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume50 = new Piece("frein",4500,bitume, brouillard,tourisme,false,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume51 = new Piece("frein",4500,bitume, brouillard,tourisme,false,tuning,"/Images/freinSport.jpg"); 
		
		Piece freinbitume52 = new Piece("frein",4500,bitume, brouillard,tourisme,true,ecoPlus,"/Images/freinClassic.jpg");
		Piece freinbitume53 = new Piece("frein",4500,bitume, brouillard,tourisme,true,luxe,"/Images/freinLuxe.jpg");
		Piece freinbitume54 = new Piece("frein",4500,bitume, brouillard,tourisme,true,tuning,"/Images/freinSport.jpg"); 
		
		Context.getInstance().getDaoP().save(freinbitume1);
		Context.getInstance().getDaoP().save(freinbitume2);
		Context.getInstance().getDaoP().save(freinbitume3);
		Context.getInstance().getDaoP().save(freinbitume4);
		Context.getInstance().getDaoP().save(freinbitume5);
		Context.getInstance().getDaoP().save(freinbitume6);
		Context.getInstance().getDaoP().save(freinbitume7);
		Context.getInstance().getDaoP().save(freinbitume8);
		Context.getInstance().getDaoP().save(freinbitume9);
		Context.getInstance().getDaoP().save(freinbitume10);
		Context.getInstance().getDaoP().save(freinbitume11);
		Context.getInstance().getDaoP().save(freinbitume12);
		Context.getInstance().getDaoP().save(freinbitume13);
		Context.getInstance().getDaoP().save(freinbitume14);
		Context.getInstance().getDaoP().save(freinbitume15);
		Context.getInstance().getDaoP().save(freinbitume16);
		Context.getInstance().getDaoP().save(freinbitume17);
		Context.getInstance().getDaoP().save(freinbitume18);
		Context.getInstance().getDaoP().save(freinbitume19);
		Context.getInstance().getDaoP().save(freinbitume20);
		Context.getInstance().getDaoP().save(freinbitume21);
		Context.getInstance().getDaoP().save(freinbitume22);
		Context.getInstance().getDaoP().save(freinbitume23);
		Context.getInstance().getDaoP().save(freinbitume24);
		Context.getInstance().getDaoP().save(freinbitume25);
		Context.getInstance().getDaoP().save(freinbitume26);
		Context.getInstance().getDaoP().save(freinbitume27);
		Context.getInstance().getDaoP().save(freinbitume28);
		Context.getInstance().getDaoP().save(freinbitume29);
		Context.getInstance().getDaoP().save(freinbitume30);
		Context.getInstance().getDaoP().save(freinbitume31);
		Context.getInstance().getDaoP().save(freinbitume32);
		Context.getInstance().getDaoP().save(freinbitume33);
		Context.getInstance().getDaoP().save(freinbitume34);
		Context.getInstance().getDaoP().save(freinbitume35);
		Context.getInstance().getDaoP().save(freinbitume36);
		Context.getInstance().getDaoP().save(freinbitume37);
		Context.getInstance().getDaoP().save(freinbitume38);
		Context.getInstance().getDaoP().save(freinbitume39);
		Context.getInstance().getDaoP().save(freinbitume40);
		Context.getInstance().getDaoP().save(freinbitume41);
		Context.getInstance().getDaoP().save(freinbitume42);
		Context.getInstance().getDaoP().save(freinbitume43);
		Context.getInstance().getDaoP().save(freinbitume44);
		Context.getInstance().getDaoP().save(freinbitume45);
		Context.getInstance().getDaoP().save(freinbitume46);
		Context.getInstance().getDaoP().save(freinbitume47);
		Context.getInstance().getDaoP().save(freinbitume48);
		Context.getInstance().getDaoP().save(freinbitume49);
		Context.getInstance().getDaoP().save(freinbitume50);
		Context.getInstance().getDaoP().save(freinbitume51);
		Context.getInstance().getDaoP().save(freinbitume52);
		Context.getInstance().getDaoP().save(freinbitume53);
		Context.getInstance().getDaoP().save(freinbitume54);
		
	}

}
