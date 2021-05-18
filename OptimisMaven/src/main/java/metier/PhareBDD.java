package metier;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;

public class PhareBDD {
	
	public static void donneePhareBDD() {
		
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
		
		Piece phareterre1 = new Piece("phare",200,terre, pluie,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre2 = new Piece("phare",4000,terre, pluie,duo,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre3 = new Piece("phare",400,terre, pluie,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareterre4 = new Piece("phare",200,terre, pluie,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre5 = new Piece("phare",1200,terre, pluie,duo,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre6 = new Piece("phare",400,terre, pluie,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareterre7 = new Piece("phare",200,terre, pluie,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre8 = new Piece("phare",1200,terre, pluie,famille,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre9 = new Piece("phare",400,terre, pluie,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre10 = new Piece("phare",200,terre, pluie,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre11 = new Piece("phare",1200,terre, pluie,famille,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre12 = new Piece("phare",400,terre, pluie,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre13 = new Piece("phare",200,terre, pluie,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre14 = new Piece("phare",1200,terre, pluie,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre15 = new Piece("phare",400,terre, pluie,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre16 = new Piece("phare",200,terre, pluie,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre17 = new Piece("phare",1200,terre, pluie,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre18 = new Piece("phare",400,terre, pluie,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre19 = new Piece("phare",200,terre, pluie,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre20 = new Piece("phare",1200,terre, sec,duo,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre21 = new Piece("phare",400,terre, sec,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareterre22 = new Piece("phare",200,terre, sec,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre23 = new Piece("phare",1200,terre, sec,duo,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre24 = new Piece("phare",400,terre, sec,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareterre25 = new Piece("phare",200,terre, sec,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre26 = new Piece("phare",1200,terre, sec,famille,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre27 = new Piece("phare",400,terre, sec,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre28 = new Piece("phare",200,terre, sec,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre29 = new Piece("phare",1200,terre, sec,famille,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre30 = new Piece("phare",400,terre, sec,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre31 = new Piece("phare",200,terre, sec,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareterre32 = new Piece("phare",1200,terre, sec,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre33 = new Piece("phare",400,terre, sec,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre34 = new Piece("phare",200,terre, sec,tourisme,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre35 = new Piece("phare",1200,terre, sec,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre36 = new Piece("phare",400,terre, sec,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre37 = new Piece("phare",200,terre, brouillard,duo,false,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre38 = new Piece("phare",1200,terre, brouillard,duo,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre39 = new Piece("phare",400,terre, brouillard,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareterre40 = new Piece("phare",200,terre, brouillard,duo,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre41 = new Piece("phare",1200,terre, brouillard,duo,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre42 = new Piece("phare",400,terre, brouillard,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareterre43 = new Piece("phare",200,terre, brouillard,famille,false,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre44 = new Piece("phare",1200,terre, brouillard,famille,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre45 = new Piece("phare",400,terre, brouillard,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre46 = new Piece("phare",200,terre, brouillard,famille,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre47 = new Piece("phare",1200,terre, brouillard,famille,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre48 = new Piece("phare",400,terre, brouillard,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre49 = new Piece("phare",200,terre, brouillard,tourisme,false,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre200 = new Piece("phare",1200,terre, brouillard,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece phareterre51 = new Piece("phare",400,terre, brouillard,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareterre52 = new Piece("phare",200,terre, brouillard,tourisme,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareterre53 = new Piece("phare",1200,terre, brouillard,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece phareterre54 = new Piece("phare",400,terre, brouillard,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Context.getInstance().getDaoP().save(phareterre1);
		Context.getInstance().getDaoP().save(phareterre2);
		Context.getInstance().getDaoP().save(phareterre3);
		Context.getInstance().getDaoP().save(phareterre4);
		Context.getInstance().getDaoP().save(phareterre5);
		Context.getInstance().getDaoP().save(phareterre6);
		Context.getInstance().getDaoP().save(phareterre7);
		Context.getInstance().getDaoP().save(phareterre8);
		Context.getInstance().getDaoP().save(phareterre9);
		Context.getInstance().getDaoP().save(phareterre10);
		Context.getInstance().getDaoP().save(phareterre11);
		Context.getInstance().getDaoP().save(phareterre12);
		Context.getInstance().getDaoP().save(phareterre13);
		Context.getInstance().getDaoP().save(phareterre14);
		Context.getInstance().getDaoP().save(phareterre15);
		Context.getInstance().getDaoP().save(phareterre16);
		Context.getInstance().getDaoP().save(phareterre17);
		Context.getInstance().getDaoP().save(phareterre18);
		Context.getInstance().getDaoP().save(phareterre19);
		Context.getInstance().getDaoP().save(phareterre20);
		Context.getInstance().getDaoP().save(phareterre21);
		Context.getInstance().getDaoP().save(phareterre22);
		Context.getInstance().getDaoP().save(phareterre23);
		Context.getInstance().getDaoP().save(phareterre24);
		Context.getInstance().getDaoP().save(phareterre25);
		Context.getInstance().getDaoP().save(phareterre26);
		Context.getInstance().getDaoP().save(phareterre27);
		Context.getInstance().getDaoP().save(phareterre28);
		Context.getInstance().getDaoP().save(phareterre29);
		Context.getInstance().getDaoP().save(phareterre30);
		Context.getInstance().getDaoP().save(phareterre31);
		Context.getInstance().getDaoP().save(phareterre32);
		Context.getInstance().getDaoP().save(phareterre33);
		Context.getInstance().getDaoP().save(phareterre34);
		Context.getInstance().getDaoP().save(phareterre35);
		Context.getInstance().getDaoP().save(phareterre36);
		Context.getInstance().getDaoP().save(phareterre37);
		Context.getInstance().getDaoP().save(phareterre38);
		Context.getInstance().getDaoP().save(phareterre39);
		Context.getInstance().getDaoP().save(phareterre40);
		Context.getInstance().getDaoP().save(phareterre41);
		Context.getInstance().getDaoP().save(phareterre42);
		Context.getInstance().getDaoP().save(phareterre43);
		Context.getInstance().getDaoP().save(phareterre44);
		Context.getInstance().getDaoP().save(phareterre45);
		Context.getInstance().getDaoP().save(phareterre46);
		Context.getInstance().getDaoP().save(phareterre47);
		Context.getInstance().getDaoP().save(phareterre48);
		Context.getInstance().getDaoP().save(phareterre49);
		Context.getInstance().getDaoP().save(phareterre200);
		Context.getInstance().getDaoP().save(phareterre51);
		Context.getInstance().getDaoP().save(phareterre52);
		Context.getInstance().getDaoP().save(phareterre53);
		Context.getInstance().getDaoP().save(phareterre54);

		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece pharesable1 = new Piece("phare",200,sable, pluie,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable2 = new Piece("phare",1200,sable, pluie,duo,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable3 = new Piece("phare",2000,sable, pluie,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharesable4 = new Piece("phare",200,sable, pluie,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable5 = new Piece("phare",1200,sable, pluie,duo,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable6 = new Piece("phare",400,sable, pluie,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharesable7 = new Piece("phare",200,sable, pluie,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable8 = new Piece("phare",1200,sable, pluie,famille,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable9 = new Piece("phare",400,sable, pluie,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable10 = new Piece("phare",200,sable, pluie,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable11 = new Piece("phare",1200,sable, pluie,famille,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable12 = new Piece("phare",400,sable, pluie,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable13 = new Piece("phare",200,sable, pluie,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable14 = new Piece("phare",1200,sable, pluie,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable15 = new Piece("phare",400,sable, pluie,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable16 = new Piece("phare",200,sable, pluie,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable17 = new Piece("phare",1200,sable, pluie,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable18 = new Piece("phare",400,sable, pluie,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable19 = new Piece("phare",200,sable, sec,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable20 = new Piece("phare",1200,sable, sec,duo,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable21 = new Piece("phare",400,sable, sec,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharesable22 = new Piece("phare",200,sable, sec,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable23 = new Piece("phare",1200,sable, sec,duo,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable24 = new Piece("phare",400,sable, sec,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharesable25 = new Piece("phare",200,sable, sec,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable26 = new Piece("phare",1200,sable, sec,famille,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable27 = new Piece("phare",400,sable, sec,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable28 = new Piece("phare",200,sable, sec,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable29 = new Piece("phare",1200,sable, sec,famille,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable30 = new Piece("phare",400,sable, sec,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable31 = new Piece("phare",200,sable, sec,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable32 = new Piece("phare",1200,sable, sec,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable33 = new Piece("phare",400,sable, sec,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable34 = new Piece("phare",200,sable, sec,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharesable35 = new Piece("phare",1200,sable, sec,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable36 = new Piece("phare",400,sable, sec,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable37 = new Piece("phare",200,sable, brouillard,duo,false,ecoPlus,"/Images/phareTune.jpg");
		Piece pharesable38 = new Piece("phare",1200,sable, brouillard,duo,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable39 = new Piece("phare",400,sable, brouillard,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharesable40 = new Piece("phare",200,sable, brouillard,duo,true,ecoPlus,"/Images/phareTune.jpg");
		Piece pharesable41 = new Piece("phare",1200,sable, brouillard,duo,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable42 = new Piece("phare",400,sable, brouillard,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharesable43 = new Piece("phare",200,sable, brouillard,famille,false,ecoPlus,"/Images/phareTune.jpg");
		Piece pharesable44 = new Piece("phare",1200,sable, brouillard,famille,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable45 = new Piece("phare",400,sable, brouillard,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable46 = new Piece("phare",200,sable, brouillard,famille,true,ecoPlus,"/Images/phareTune.jpg");
		Piece pharesable47 = new Piece("phare",1200,sable, brouillard,famille,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable48 = new Piece("phare",400,sable, brouillard,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable49 = new Piece("phare",200,sable, brouillard,tourisme,false,ecoPlus,"/Images/phareTune.jpg");
		Piece pharesable200 = new Piece("phare",1200,sable, brouillard,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece pharesable51 = new Piece("phare",400,sable, brouillard,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharesable52 = new Piece("phare",200,sable, brouillard,tourisme,true,ecoPlus,"/Images/phareTune.jpg");
		Piece pharesable53 = new Piece("phare",1200,sable, brouillard,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece pharesable54 = new Piece("phare",400,sable, brouillard,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		
		Context.getInstance().getDaoP().save(pharesable1);
		Context.getInstance().getDaoP().save(pharesable2);
		Context.getInstance().getDaoP().save(pharesable3);
		Context.getInstance().getDaoP().save(pharesable4);
		Context.getInstance().getDaoP().save(pharesable5);
		Context.getInstance().getDaoP().save(pharesable6);
		Context.getInstance().getDaoP().save(pharesable7);
		Context.getInstance().getDaoP().save(pharesable8);
		Context.getInstance().getDaoP().save(pharesable9);
		Context.getInstance().getDaoP().save(pharesable10);
		Context.getInstance().getDaoP().save(pharesable11);
		Context.getInstance().getDaoP().save(pharesable12);
		Context.getInstance().getDaoP().save(pharesable13);
		Context.getInstance().getDaoP().save(pharesable14);
		Context.getInstance().getDaoP().save(pharesable15);
		Context.getInstance().getDaoP().save(pharesable16);
		Context.getInstance().getDaoP().save(pharesable17);
		Context.getInstance().getDaoP().save(pharesable18);
		Context.getInstance().getDaoP().save(pharesable19);
		Context.getInstance().getDaoP().save(pharesable20);
		Context.getInstance().getDaoP().save(pharesable21);
		Context.getInstance().getDaoP().save(pharesable22);
		Context.getInstance().getDaoP().save(pharesable23);
		Context.getInstance().getDaoP().save(pharesable24);
		Context.getInstance().getDaoP().save(pharesable25);
		Context.getInstance().getDaoP().save(pharesable26);
		Context.getInstance().getDaoP().save(pharesable27);
		Context.getInstance().getDaoP().save(pharesable28);
		Context.getInstance().getDaoP().save(pharesable29);
		Context.getInstance().getDaoP().save(pharesable30);
		Context.getInstance().getDaoP().save(pharesable31);
		Context.getInstance().getDaoP().save(pharesable32);
		Context.getInstance().getDaoP().save(pharesable33);
		Context.getInstance().getDaoP().save(pharesable34);
		Context.getInstance().getDaoP().save(pharesable35);
		Context.getInstance().getDaoP().save(pharesable36);
		Context.getInstance().getDaoP().save(pharesable37);
		Context.getInstance().getDaoP().save(pharesable38);
		Context.getInstance().getDaoP().save(pharesable39);
		Context.getInstance().getDaoP().save(pharesable40);
		Context.getInstance().getDaoP().save(pharesable41);
		Context.getInstance().getDaoP().save(pharesable42);
		Context.getInstance().getDaoP().save(pharesable43);
		Context.getInstance().getDaoP().save(pharesable44);
		Context.getInstance().getDaoP().save(pharesable45);
		Context.getInstance().getDaoP().save(pharesable46);
		Context.getInstance().getDaoP().save(pharesable47);
		Context.getInstance().getDaoP().save(pharesable48);
		Context.getInstance().getDaoP().save(pharesable49);
		Context.getInstance().getDaoP().save(pharesable200);
		Context.getInstance().getDaoP().save(pharesable51);
		Context.getInstance().getDaoP().save(pharesable52);
		Context.getInstance().getDaoP().save(pharesable53);
		Context.getInstance().getDaoP().save(pharesable54);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece phareglace1 = new Piece("phare",200,glace, pluie,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace2 = new Piece("phare",1200,glace, pluie,duo,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace3 = new Piece("phare",400,glace, pluie,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareglace4 = new Piece("phare",200,glace, pluie,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace5 = new Piece("phare",1200,glace, pluie,duo,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace6 = new Piece("phare",400,glace, pluie,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareglace7 = new Piece("phare",200,glace, pluie,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace8 = new Piece("phare",1200,glace, pluie,famille,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace9 = new Piece("phare",400,glace, pluie,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace10 = new Piece("phare",200,glace, pluie,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace11 = new Piece("phare",1200,glace, pluie,famille,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace12 = new Piece("phare",400,glace, pluie,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace13 = new Piece("phare",200,glace, pluie,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace14 = new Piece("phare",1200,glace, pluie,tourisme,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace15 = new Piece("phare",400,glace, pluie,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace16 = new Piece("phare",200,glace, pluie,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace17 = new Piece("phare",1200,glace, pluie,tourisme,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace18 = new Piece("phare",400,glace, pluie,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace19 = new Piece("phare",200,glace, sec,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace20 = new Piece("phare",1200,glace, sec,duo,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace21 = new Piece("phare",400,glace, sec,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareglace22 = new Piece("phare",200,glace, sec,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace23 = new Piece("phare",1200,glace, sec,duo,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace24 = new Piece("phare",400,glace, sec,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareglace25 = new Piece("phare",200,glace, sec,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace26 = new Piece("phare",1200,glace, sec,famille,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace27 = new Piece("phare",400,glace, sec,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace28 = new Piece("phare",200,glace, sec,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace29 = new Piece("phare",1200,glace, sec,famille,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace30 = new Piece("phare",400,glace, sec,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace31 = new Piece("phare",200,glace, sec,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace32 = new Piece("phare",1200,glace, sec,tourisme,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace33 = new Piece("phare",400,glace, sec,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace34 = new Piece("phare",200,glace, sec,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece phareglace35 = new Piece("phare",1200,glace, sec,tourisme,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace36 = new Piece("phare",400,glace, sec,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace37 = new Piece("phare",200,glace, brouillard,duo,false,ecoPlus,"/Images/phareTune.jpg");
		Piece phareglace38 = new Piece("phare",1200,glace, brouillard,duo,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace39 = new Piece("phare",400,glace, brouillard,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareglace40 = new Piece("phare",200,glace, brouillard,duo,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareglace41 = new Piece("phare",1200,glace, brouillard,duo,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace42 = new Piece("phare",400,glace, brouillard,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece phareglace43 = new Piece("phare",200,glace, brouillard,famille,false,ecoPlus,"/Images/phareTune.jpg");
		Piece phareglace44 = new Piece("phare",1200,glace, brouillard,famille,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace45 = new Piece("phare",400,glace, brouillard,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace46 = new Piece("phare",200,glace, brouillard,famille,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareglace47 = new Piece("phare",1200,glace, brouillard,famille,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace48 = new Piece("phare",400,glace, brouillard,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace49 = new Piece("phare",200,glace, brouillard,tourisme,false,ecoPlus,"/Images/phareTune.jpg");
		Piece phareglace200 = new Piece("phare",1200,glace, brouillard,tourisme,false,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace51 = new Piece("phare",400,glace, brouillard,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece phareglace52 = new Piece("phare",200,glace, brouillard,tourisme,true,ecoPlus,"/Images/phareTune.jpg");
		Piece phareglace53 = new Piece("phare",1200,glace, brouillard,tourisme,true,luxe,"/Images/phareCourseRoute.jpg");
		Piece phareglace54 = new Piece("phare",400,glace, brouillard,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Context.getInstance().getDaoP().save(phareglace1);
		Context.getInstance().getDaoP().save(phareglace2);
		Context.getInstance().getDaoP().save(phareglace3);
		Context.getInstance().getDaoP().save(phareglace4);
		Context.getInstance().getDaoP().save(phareglace5);
		Context.getInstance().getDaoP().save(phareglace6);
		Context.getInstance().getDaoP().save(phareglace7);
		Context.getInstance().getDaoP().save(phareglace8);
		Context.getInstance().getDaoP().save(phareglace9);
		Context.getInstance().getDaoP().save(phareglace10);
		Context.getInstance().getDaoP().save(phareglace11);
		Context.getInstance().getDaoP().save(phareglace12);
		Context.getInstance().getDaoP().save(phareglace13);
		Context.getInstance().getDaoP().save(phareglace14);
		Context.getInstance().getDaoP().save(phareglace15);
		Context.getInstance().getDaoP().save(phareglace16);
		Context.getInstance().getDaoP().save(phareglace17);
		Context.getInstance().getDaoP().save(phareglace18);
		Context.getInstance().getDaoP().save(phareglace19);
		Context.getInstance().getDaoP().save(phareglace20);
		Context.getInstance().getDaoP().save(phareglace21);
		Context.getInstance().getDaoP().save(phareglace22);
		Context.getInstance().getDaoP().save(phareglace23);
		Context.getInstance().getDaoP().save(phareglace24);
		Context.getInstance().getDaoP().save(phareglace25);
		Context.getInstance().getDaoP().save(phareglace26);
		Context.getInstance().getDaoP().save(phareglace27);
		Context.getInstance().getDaoP().save(phareglace28);
		Context.getInstance().getDaoP().save(phareglace29);
		Context.getInstance().getDaoP().save(phareglace30);
		Context.getInstance().getDaoP().save(phareglace31);
		Context.getInstance().getDaoP().save(phareglace32);
		Context.getInstance().getDaoP().save(phareglace33);
		Context.getInstance().getDaoP().save(phareglace34);
		Context.getInstance().getDaoP().save(phareglace35);
		Context.getInstance().getDaoP().save(phareglace36);
		Context.getInstance().getDaoP().save(phareglace37);
		Context.getInstance().getDaoP().save(phareglace38);
		Context.getInstance().getDaoP().save(phareglace39);
		Context.getInstance().getDaoP().save(phareglace40);
		Context.getInstance().getDaoP().save(phareglace41);
		Context.getInstance().getDaoP().save(phareglace42);
		Context.getInstance().getDaoP().save(phareglace43);
		Context.getInstance().getDaoP().save(phareglace44);
		Context.getInstance().getDaoP().save(phareglace45);
		Context.getInstance().getDaoP().save(phareglace46);
		Context.getInstance().getDaoP().save(phareglace47);
		Context.getInstance().getDaoP().save(phareglace48);
		Context.getInstance().getDaoP().save(phareglace49);
		Context.getInstance().getDaoP().save(phareglace200);
		Context.getInstance().getDaoP().save(phareglace51);
		Context.getInstance().getDaoP().save(phareglace52);
		Context.getInstance().getDaoP().save(phareglace53);
		Context.getInstance().getDaoP().save(phareglace54);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Piece pharebitume1 = new Piece("phare",200,bitume, pluie,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume2 = new Piece("phare",1200,bitume, pluie,duo,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume3 = new Piece("phare",400,bitume, pluie,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharebitume4 = new Piece("phare",200,bitume, pluie,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume5 = new Piece("phare",1200,bitume, pluie,duo,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume6 = new Piece("phare",400,bitume, pluie,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharebitume7 = new Piece("phare",200,bitume, pluie,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume8 = new Piece("phare",1200,bitume, pluie,famille,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume9 = new Piece("phare",400,bitume, pluie,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume10 = new Piece("phare",200,bitume, pluie,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume11 = new Piece("phare",1200,bitume, pluie,famille,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume12 = new Piece("phare",400,bitume, pluie,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume13 = new Piece("phare",200,bitume, pluie,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume14 = new Piece("phare",1200,bitume, pluie,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume15 = new Piece("phare",400,bitume, pluie,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume16 = new Piece("phare",200,bitume, pluie,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume17 = new Piece("phare",1200,bitume, pluie,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume18 = new Piece("phare",400,bitume, pluie,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume19 = new Piece("phare",200,bitume, sec,duo,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume20 = new Piece("phare",1200,bitume, sec,duo,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume21 = new Piece("phare",400,bitume, sec,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharebitume22 = new Piece("phare",200,bitume, sec,duo,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume23 = new Piece("phare",1200,bitume, sec,duo,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume24 = new Piece("phare",400,bitume, sec,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharebitume25 = new Piece("phare",200,bitume, sec,famille,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume26 = new Piece("phare",1200,bitume, sec,famille,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume27 = new Piece("phare",400,bitume, sec,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume28 = new Piece("phare",200,bitume, sec,famille,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume29 = new Piece("phare",1200,bitume, sec,famille,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume30 = new Piece("phare",400,bitume, sec,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume31 = new Piece("phare",200,bitume, sec,tourisme,false,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume32 = new Piece("phare",1200,bitume, sec,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume33 = new Piece("phare",400,bitume, sec,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume34 = new Piece("phare",200,bitume, sec,tourisme,true,ecoPlus,"/Images/phareEco.jpg");
		Piece pharebitume35 = new Piece("phare",1200,bitume, sec,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume36 = new Piece("phare",400,bitume, sec,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume37 = new Piece("phare",200,bitume, brouillard,duo,false,ecoPlus,"/Images/phareTune.jpg");
		Piece pharebitume38 = new Piece("phare",1200,bitume, brouillard,duo,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume39 = new Piece("phare",400,bitume, brouillard,duo,false,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharebitume40 = new Piece("phare",200,bitume, brouillard,duo,true,ecoPlus,"/Images/phareTune.jpg");
		Piece pharebitume41 = new Piece("phare",1200,bitume, brouillard,duo,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume42 = new Piece("phare",400,bitume, brouillard,duo,true,tuning,"/Images/phareCourseRoute.jpg");
		
		Piece pharebitume43 = new Piece("phare",200,bitume, brouillard,famille,false,ecoPlus,"/Images/phareTune.jpg");
		Piece pharebitume44 = new Piece("phare",1200,bitume, brouillard,famille,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume45 = new Piece("phare",400,bitume, brouillard,famille,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume46 = new Piece("phare",200,bitume, brouillard,famille,true,ecoPlus,"/Images/phareTune.jpg");
		Piece pharebitume47 = new Piece("phare",1200,bitume, brouillard,famille,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume48 = new Piece("phare",400,bitume, brouillard,famille,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume49 = new Piece("phare",200,bitume, brouillard,tourisme,false,ecoPlus,"/Images/phareTune.jpg");
		Piece pharebitume200 = new Piece("phare",1200,bitume, brouillard,tourisme,false,luxe,"/Images/phareTune.jpg");
		Piece pharebitume51 = new Piece("phare",400,bitume, brouillard,tourisme,false,tuning,"/Images/phareCourseRoute.jpg"); 
		
		Piece pharebitume52 = new Piece("phare",200,bitume, brouillard,tourisme,true,ecoPlus,"/Images/phareTune.jpg");
		Piece pharebitume53 = new Piece("phare",1200,bitume, brouillard,tourisme,true,luxe,"/Images/phareTune.jpg");
		Piece pharebitume54 = new Piece("phare",400,bitume, brouillard,tourisme,true,tuning,"/Images/phareCourseRoute.jpg"); 
		
		
		Context.getInstance().getDaoP().save(pharebitume1);
		Context.getInstance().getDaoP().save(pharebitume2);
		Context.getInstance().getDaoP().save(pharebitume3);
		Context.getInstance().getDaoP().save(pharebitume4);
		Context.getInstance().getDaoP().save(pharebitume5);
		Context.getInstance().getDaoP().save(pharebitume6);
		Context.getInstance().getDaoP().save(pharebitume7);
		Context.getInstance().getDaoP().save(pharebitume8);
		Context.getInstance().getDaoP().save(pharebitume9);
		Context.getInstance().getDaoP().save(pharebitume10);
		Context.getInstance().getDaoP().save(pharebitume11);
		Context.getInstance().getDaoP().save(pharebitume12);
		Context.getInstance().getDaoP().save(pharebitume13);
		Context.getInstance().getDaoP().save(pharebitume14);
		Context.getInstance().getDaoP().save(pharebitume15);
		Context.getInstance().getDaoP().save(pharebitume16);
		Context.getInstance().getDaoP().save(pharebitume17);
		Context.getInstance().getDaoP().save(pharebitume18);
		Context.getInstance().getDaoP().save(pharebitume19);
		Context.getInstance().getDaoP().save(pharebitume20);
		Context.getInstance().getDaoP().save(pharebitume21);
		Context.getInstance().getDaoP().save(pharebitume22);
		Context.getInstance().getDaoP().save(pharebitume23);
		Context.getInstance().getDaoP().save(pharebitume24);
		Context.getInstance().getDaoP().save(pharebitume25);
		Context.getInstance().getDaoP().save(pharebitume26);
		Context.getInstance().getDaoP().save(pharebitume27);
		Context.getInstance().getDaoP().save(pharebitume28);
		Context.getInstance().getDaoP().save(pharebitume29);
		Context.getInstance().getDaoP().save(pharebitume30);
		Context.getInstance().getDaoP().save(pharebitume31);
		Context.getInstance().getDaoP().save(pharebitume32);
		Context.getInstance().getDaoP().save(pharebitume33);
		Context.getInstance().getDaoP().save(pharebitume34);
		Context.getInstance().getDaoP().save(pharebitume35);
		Context.getInstance().getDaoP().save(pharebitume36);
		Context.getInstance().getDaoP().save(pharebitume37);
		Context.getInstance().getDaoP().save(pharebitume38);
		Context.getInstance().getDaoP().save(pharebitume39);
		Context.getInstance().getDaoP().save(pharebitume40);
		Context.getInstance().getDaoP().save(pharebitume41);
		Context.getInstance().getDaoP().save(pharebitume42);
		Context.getInstance().getDaoP().save(pharebitume43);
		Context.getInstance().getDaoP().save(pharebitume44);
		Context.getInstance().getDaoP().save(pharebitume45);
		Context.getInstance().getDaoP().save(pharebitume46);
		Context.getInstance().getDaoP().save(pharebitume47);
		Context.getInstance().getDaoP().save(pharebitume48);
		Context.getInstance().getDaoP().save(pharebitume49);
		Context.getInstance().getDaoP().save(pharebitume200);
		Context.getInstance().getDaoP().save(pharebitume51);
		Context.getInstance().getDaoP().save(pharebitume52);
		Context.getInstance().getDaoP().save(pharebitume53);
		Context.getInstance().getDaoP().save(pharebitume54);
		
	}

}
