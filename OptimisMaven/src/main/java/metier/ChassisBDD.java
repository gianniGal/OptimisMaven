package metier;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import metier.FiltresTerrain.Surclasser;
import util.Context;

public class ChassisBDD {
	
	public static void donneeChassisBDD() {
		
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
		
		Piece chassisterre1 = new Piece("chassis",8000,terre, pluie,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisterre2 = new Piece("chassis",50000,terre, pluie,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisterre3 = new Piece("chassis",12000,terre, pluie,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisterre4 = new Piece("chassis",12000,terre, pluie,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisterre5 = new Piece("chassis",65000,terre, pluie,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisterre6 = new Piece("chassis",35000,terre, pluie,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisterre7 = new Piece("chassis",15000,terre, pluie,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisterre8 = new Piece("chassis",70000,terre, pluie,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisterre9 = new Piece("chassis",35000,terre, pluie,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisterre10 = new Piece("chassis",12000,terre, pluie,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisterre11 = new Piece("chassis",105000,terre, pluie,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisterre12 = new Piece("chassis",60000,terre, pluie,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisterre13 = new Piece("chassis",35000,terre, pluie,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisterre14 = new Piece("chassis",50000,terre, pluie,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisterre15 = new Piece("chassis",95000,terre, pluie,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisterre16 = new Piece("chassis",35000,terre, pluie,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisterre17 = new Piece("chassis",95000,terre, pluie,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisterre18 = new Piece("chassis",75500,terre, pluie,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisterre19 = new Piece("chassis",8000,terre, sec,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisterre20 = new Piece("chassis",50000,terre, sec,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisterre21 = new Piece("chassis",12000,terre, sec,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisterre22 = new Piece("chassis",12000,terre, sec,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisterre23 = new Piece("chassis",65000,terre, sec,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisterre24 = new Piece("chassis",35000,terre, sec,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisterre25 = new Piece("chassis",15000,terre, sec,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisterre26 = new Piece("chassis",70000,terre, sec,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisterre27 = new Piece("chassis",35000,terre, sec,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisterre28 = new Piece("chassis",12000,terre, sec,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisterre29 = new Piece("chassis",105000,terre, sec,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisterre30 = new Piece("chassis",60000,terre, sec,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisterre31 = new Piece("chassis",35000,terre, sec,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisterre32 = new Piece("chassis",50000,terre, sec,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisterre33 = new Piece("chassis",90000,terre, sec,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisterre34 = new Piece("chassis",35000,terre, sec,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisterre35 = new Piece("chassis",95000,terre, sec,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisterre36 = new Piece("chassis",75500,terre, sec,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisterre37 = new Piece("chassis",8000,terre, brouillard,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisterre38 = new Piece("chassis",50000,terre, brouillard,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisterre39 = new Piece("chassis",12200,terre, brouillard,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisterre40 = new Piece("chassis",12000,terre, brouillard,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisterre41 = new Piece("chassis",65000,terre, brouillard,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisterre42 = new Piece("chassis",35000,terre, brouillard,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisterre43 = new Piece("chassis",15000,terre, brouillard,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisterre44 = new Piece("chassis",70000,terre, brouillard,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisterre45 = new Piece("chassis",35000,terre, brouillard,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisterre46 = new Piece("chassis",12000,terre, brouillard,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisterre47 = new Piece("chassis",10500,terre, brouillard,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisterre48 = new Piece("chassis",60000,terre, brouillard,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisterre49 = new Piece("chassis",35000,terre, brouillard,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisterre50 = new Piece("chassis",50000,terre, brouillard,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisterre51 = new Piece("chassis",90000,terre, brouillard,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisterre52 = new Piece("chassis",35000,terre, brouillard,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisterre53 = new Piece("chassis",95000,terre, brouillard,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisterre54 = new Piece("chassis",75500,terre, brouillard,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		
		Context.getInstance().getDaoP().save(chassisterre1);
		Context.getInstance().getDaoP().save(chassisterre2);
		Context.getInstance().getDaoP().save(chassisterre3);
		Context.getInstance().getDaoP().save(chassisterre4);
		Context.getInstance().getDaoP().save(chassisterre5);
		Context.getInstance().getDaoP().save(chassisterre6);
		Context.getInstance().getDaoP().save(chassisterre7);
		Context.getInstance().getDaoP().save(chassisterre8);
		Context.getInstance().getDaoP().save(chassisterre9);
		Context.getInstance().getDaoP().save(chassisterre10);
		Context.getInstance().getDaoP().save(chassisterre11);
		Context.getInstance().getDaoP().save(chassisterre12);
		Context.getInstance().getDaoP().save(chassisterre13);
		Context.getInstance().getDaoP().save(chassisterre14);
		Context.getInstance().getDaoP().save(chassisterre15);
		Context.getInstance().getDaoP().save(chassisterre16);
		Context.getInstance().getDaoP().save(chassisterre17);
		Context.getInstance().getDaoP().save(chassisterre18);
		Context.getInstance().getDaoP().save(chassisterre19);
		Context.getInstance().getDaoP().save(chassisterre20);
		Context.getInstance().getDaoP().save(chassisterre21);
		Context.getInstance().getDaoP().save(chassisterre22);
		Context.getInstance().getDaoP().save(chassisterre23);
		Context.getInstance().getDaoP().save(chassisterre24);
		Context.getInstance().getDaoP().save(chassisterre25);
		Context.getInstance().getDaoP().save(chassisterre26);
		Context.getInstance().getDaoP().save(chassisterre27);
		Context.getInstance().getDaoP().save(chassisterre28);
		Context.getInstance().getDaoP().save(chassisterre29);
		Context.getInstance().getDaoP().save(chassisterre30);
		Context.getInstance().getDaoP().save(chassisterre31);
		Context.getInstance().getDaoP().save(chassisterre32);
		Context.getInstance().getDaoP().save(chassisterre33);
		Context.getInstance().getDaoP().save(chassisterre34);
		Context.getInstance().getDaoP().save(chassisterre35);
		Context.getInstance().getDaoP().save(chassisterre36);
		Context.getInstance().getDaoP().save(chassisterre37);
		Context.getInstance().getDaoP().save(chassisterre38);
		Context.getInstance().getDaoP().save(chassisterre39);
		Context.getInstance().getDaoP().save(chassisterre40);
		Context.getInstance().getDaoP().save(chassisterre41);
		Context.getInstance().getDaoP().save(chassisterre42);
		Context.getInstance().getDaoP().save(chassisterre43);
		Context.getInstance().getDaoP().save(chassisterre44);
		Context.getInstance().getDaoP().save(chassisterre45);
		Context.getInstance().getDaoP().save(chassisterre46);
		Context.getInstance().getDaoP().save(chassisterre47);
		Context.getInstance().getDaoP().save(chassisterre48);
		Context.getInstance().getDaoP().save(chassisterre49);
		Context.getInstance().getDaoP().save(chassisterre50);
		Context.getInstance().getDaoP().save(chassisterre51);
		Context.getInstance().getDaoP().save(chassisterre52);
		Context.getInstance().getDaoP().save(chassisterre53);
		Context.getInstance().getDaoP().save(chassisterre54);

		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassissable1 = new Piece("chassis",8000,sable, pluie,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassissable2 = new Piece("chassis",50000,sable, pluie,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassissable3 = new Piece("chassis",12000,sable, pluie,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassissable4 = new Piece("chassis",12000,sable, pluie,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassissable5 = new Piece("chassis",65000,sable, pluie,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassissable6 = new Piece("chassis",35000,sable, pluie,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassissable7 = new Piece("chassis",15000,sable, pluie,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassissable8 = new Piece("chassis",70000,sable, pluie,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassissable9 = new Piece("chassis",35000,sable, pluie,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassissable10 = new Piece("chassis",12000,sable, pluie,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassissable11 = new Piece("chassis",105000,sable, pluie,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassissable12 = new Piece("chassis",60000,sable, pluie,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassissable13 = new Piece("chassis",35000,sable, pluie,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassissable14 = new Piece("chassis",50000,sable, pluie,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassissable15 = new Piece("chassis",95000,sable, pluie,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassissable16 = new Piece("chassis",35000,sable, pluie,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassissable17 = new Piece("chassis",95000,sable, pluie,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassissable18 = new Piece("chassis",75500,sable, pluie,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassissable19 = new Piece("chassis",8000,sable, sec,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassissable20 = new Piece("chassis",50000,sable, sec,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassissable21 = new Piece("chassis",12000,sable, sec,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassissable22 = new Piece("chassis",12000,sable, sec,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassissable23 = new Piece("chassis",65000,sable, sec,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassissable24 = new Piece("chassis",35000,sable, sec,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassissable25 = new Piece("chassis",15000,sable, sec,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassissable26 = new Piece("chassis",70000,sable, sec,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassissable27 = new Piece("chassis",35000,sable, sec,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassissable28 = new Piece("chassis",12000,sable, sec,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassissable29 = new Piece("chassis",105000,sable, sec,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassissable30 = new Piece("chassis",60000,sable, sec,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassissable31 = new Piece("chassis",35000,sable, sec,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassissable32 = new Piece("chassis",50000,sable, sec,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassissable33 = new Piece("chassis",90000,sable, sec,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassissable34 = new Piece("chassis",35000,sable, sec,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassissable35 = new Piece("chassis",95000,sable, sec,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassissable36 = new Piece("chassis",75500,sable, sec,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassissable37 = new Piece("chassis",8000,sable, brouillard,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassissable38 = new Piece("chassis",50000,sable, brouillard,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassissable39 = new Piece("chassis",12200,sable, brouillard,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassissable40 = new Piece("chassis",12000,sable, brouillard,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassissable41 = new Piece("chassis",65000,sable, brouillard,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassissable42 = new Piece("chassis",35000,sable, brouillard,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassissable43 = new Piece("chassis",15000,sable, brouillard,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassissable44 = new Piece("chassis",70000,sable, brouillard,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassissable45 = new Piece("chassis",35000,sable, brouillard,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassissable46 = new Piece("chassis",12000,sable, brouillard,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassissable47 = new Piece("chassis",10500,sable, brouillard,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassissable48 = new Piece("chassis",60000,sable, brouillard,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassissable49 = new Piece("chassis",35000,sable, brouillard,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassissable50 = new Piece("chassis",50000,sable, brouillard,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassissable51 = new Piece("chassis",90000,sable, brouillard,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassissable52 = new Piece("chassis",35000,sable, brouillard,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassissable53 = new Piece("chassis",95000,sable, brouillard,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassissable54 = new Piece("chassis",75500,sable, brouillard,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		
		
		Context.getInstance().getDaoP().save(chassissable1);
		Context.getInstance().getDaoP().save(chassissable2);
		Context.getInstance().getDaoP().save(chassissable3);
		Context.getInstance().getDaoP().save(chassissable4);
		Context.getInstance().getDaoP().save(chassissable5);
		Context.getInstance().getDaoP().save(chassissable6);
		Context.getInstance().getDaoP().save(chassissable7);
		Context.getInstance().getDaoP().save(chassissable8);
		Context.getInstance().getDaoP().save(chassissable9);
		Context.getInstance().getDaoP().save(chassissable10);
		Context.getInstance().getDaoP().save(chassissable11);
		Context.getInstance().getDaoP().save(chassissable12);
		Context.getInstance().getDaoP().save(chassissable13);
		Context.getInstance().getDaoP().save(chassissable14);
		Context.getInstance().getDaoP().save(chassissable15);
		Context.getInstance().getDaoP().save(chassissable16);
		Context.getInstance().getDaoP().save(chassissable17);
		Context.getInstance().getDaoP().save(chassissable18);
		Context.getInstance().getDaoP().save(chassissable19);
		Context.getInstance().getDaoP().save(chassissable20);
		Context.getInstance().getDaoP().save(chassissable21);
		Context.getInstance().getDaoP().save(chassissable22);
		Context.getInstance().getDaoP().save(chassissable23);
		Context.getInstance().getDaoP().save(chassissable24);
		Context.getInstance().getDaoP().save(chassissable25);
		Context.getInstance().getDaoP().save(chassissable26);
		Context.getInstance().getDaoP().save(chassissable27);
		Context.getInstance().getDaoP().save(chassissable28);
		Context.getInstance().getDaoP().save(chassissable29);
		Context.getInstance().getDaoP().save(chassissable30);
		Context.getInstance().getDaoP().save(chassissable31);
		Context.getInstance().getDaoP().save(chassissable32);
		Context.getInstance().getDaoP().save(chassissable33);
		Context.getInstance().getDaoP().save(chassissable34);
		Context.getInstance().getDaoP().save(chassissable35);
		Context.getInstance().getDaoP().save(chassissable36);
		Context.getInstance().getDaoP().save(chassissable37);
		Context.getInstance().getDaoP().save(chassissable38);
		Context.getInstance().getDaoP().save(chassissable39);
		Context.getInstance().getDaoP().save(chassissable40);
		Context.getInstance().getDaoP().save(chassissable41);
		Context.getInstance().getDaoP().save(chassissable42);
		Context.getInstance().getDaoP().save(chassissable43);
		Context.getInstance().getDaoP().save(chassissable44);
		Context.getInstance().getDaoP().save(chassissable45);
		Context.getInstance().getDaoP().save(chassissable46);
		Context.getInstance().getDaoP().save(chassissable47);
		Context.getInstance().getDaoP().save(chassissable48);
		Context.getInstance().getDaoP().save(chassissable49);
		Context.getInstance().getDaoP().save(chassissable50);
		Context.getInstance().getDaoP().save(chassissable51);
		Context.getInstance().getDaoP().save(chassissable52);
		Context.getInstance().getDaoP().save(chassissable53);
		Context.getInstance().getDaoP().save(chassissable54);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisglace1 = new Piece("chassis",8000,glace, pluie,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisglace2 = new Piece("chassis",50000,glace, pluie,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisglace3 = new Piece("chassis",12000,glace, pluie,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisglace4 = new Piece("chassis",12000,glace, pluie,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisglace5 = new Piece("chassis",65000,glace, pluie,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisglace6 = new Piece("chassis",35000,glace, pluie,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisglace7 = new Piece("chassis",15000,glace, pluie,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisglace8 = new Piece("chassis",70000,glace, pluie,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisglace9 = new Piece("chassis",35000,glace, pluie,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisglace10 = new Piece("chassis",12000,glace, pluie,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisglace11 = new Piece("chassis",105000,glace, pluie,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisglace12 = new Piece("chassis",60000,glace, pluie,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisglace13 = new Piece("chassis",35000,glace, pluie,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisglace14 = new Piece("chassis",50000,glace, pluie,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisglace15 = new Piece("chassis",95000,glace, pluie,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisglace16 = new Piece("chassis",35000,glace, pluie,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisglace17 = new Piece("chassis",95000,glace, pluie,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisglace18 = new Piece("chassis",75500,glace, pluie,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisglace19 = new Piece("chassis",8000,glace, sec,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisglace20 = new Piece("chassis",50000,glace, sec,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisglace21 = new Piece("chassis",12000,glace, sec,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisglace22 = new Piece("chassis",12000,glace, sec,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisglace23 = new Piece("chassis",65000,glace, sec,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisglace24 = new Piece("chassis",35000,glace, sec,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisglace25 = new Piece("chassis",15000,glace, sec,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisglace26 = new Piece("chassis",70000,glace, sec,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisglace27 = new Piece("chassis",35000,glace, sec,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisglace28 = new Piece("chassis",12000,glace, sec,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisglace29 = new Piece("chassis",105000,glace, sec,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisglace30 = new Piece("chassis",60000,glace, sec,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisglace31 = new Piece("chassis",35000,glace, sec,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisglace32 = new Piece("chassis",50000,glace, sec,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisglace33 = new Piece("chassis",90000,glace, sec,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisglace34 = new Piece("chassis",35000,glace, sec,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisglace35 = new Piece("chassis",95000,glace, sec,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisglace36 = new Piece("chassis",75500,glace, sec,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisglace37 = new Piece("chassis",8000,glace, brouillard,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisglace38 = new Piece("chassis",50000,glace, brouillard,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisglace39 = new Piece("chassis",12200,glace, brouillard,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisglace40 = new Piece("chassis",12000,glace, brouillard,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisglace41 = new Piece("chassis",65000,glace, brouillard,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisglace42 = new Piece("chassis",35000,glace, brouillard,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisglace43 = new Piece("chassis",15000,glace, brouillard,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisglace44 = new Piece("chassis",70000,glace, brouillard,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisglace45 = new Piece("chassis",35000,glace, brouillard,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisglace46 = new Piece("chassis",12000,glace, brouillard,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisglace47 = new Piece("chassis",10500,glace, brouillard,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisglace48 = new Piece("chassis",60000,glace, brouillard,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisglace49 = new Piece("chassis",35000,glace, brouillard,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisglace50 = new Piece("chassis",50000,glace, brouillard,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisglace51 = new Piece("chassis",90000,glace, brouillard,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisglace52 = new Piece("chassis",35000,glace, brouillard,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisglace53 = new Piece("chassis",95000,glace, brouillard,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisglace54 = new Piece("chassis",75500,glace, brouillard,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		
		Context.getInstance().getDaoP().save(chassisglace1);
		Context.getInstance().getDaoP().save(chassisglace2);
		Context.getInstance().getDaoP().save(chassisglace3);
		Context.getInstance().getDaoP().save(chassisglace4);
		Context.getInstance().getDaoP().save(chassisglace5);
		Context.getInstance().getDaoP().save(chassisglace6);
		Context.getInstance().getDaoP().save(chassisglace7);
		Context.getInstance().getDaoP().save(chassisglace8);
		Context.getInstance().getDaoP().save(chassisglace9);
		Context.getInstance().getDaoP().save(chassisglace10);
		Context.getInstance().getDaoP().save(chassisglace11);
		Context.getInstance().getDaoP().save(chassisglace12);
		Context.getInstance().getDaoP().save(chassisglace13);
		Context.getInstance().getDaoP().save(chassisglace14);
		Context.getInstance().getDaoP().save(chassisglace15);
		Context.getInstance().getDaoP().save(chassisglace16);
		Context.getInstance().getDaoP().save(chassisglace17);
		Context.getInstance().getDaoP().save(chassisglace18);
		Context.getInstance().getDaoP().save(chassisglace19);
		Context.getInstance().getDaoP().save(chassisglace20);
		Context.getInstance().getDaoP().save(chassisglace21);
		Context.getInstance().getDaoP().save(chassisglace22);
		Context.getInstance().getDaoP().save(chassisglace23);
		Context.getInstance().getDaoP().save(chassisglace24);
		Context.getInstance().getDaoP().save(chassisglace25);
		Context.getInstance().getDaoP().save(chassisglace26);
		Context.getInstance().getDaoP().save(chassisglace27);
		Context.getInstance().getDaoP().save(chassisglace28);
		Context.getInstance().getDaoP().save(chassisglace29);
		Context.getInstance().getDaoP().save(chassisglace30);
		Context.getInstance().getDaoP().save(chassisglace31);
		Context.getInstance().getDaoP().save(chassisglace32);
		Context.getInstance().getDaoP().save(chassisglace33);
		Context.getInstance().getDaoP().save(chassisglace34);
		Context.getInstance().getDaoP().save(chassisglace35);
		Context.getInstance().getDaoP().save(chassisglace36);
		Context.getInstance().getDaoP().save(chassisglace37);
		Context.getInstance().getDaoP().save(chassisglace38);
		Context.getInstance().getDaoP().save(chassisglace39);
		Context.getInstance().getDaoP().save(chassisglace40);
		Context.getInstance().getDaoP().save(chassisglace41);
		Context.getInstance().getDaoP().save(chassisglace42);
		Context.getInstance().getDaoP().save(chassisglace43);
		Context.getInstance().getDaoP().save(chassisglace44);
		Context.getInstance().getDaoP().save(chassisglace45);
		Context.getInstance().getDaoP().save(chassisglace46);
		Context.getInstance().getDaoP().save(chassisglace47);
		Context.getInstance().getDaoP().save(chassisglace48);
		Context.getInstance().getDaoP().save(chassisglace49);
		Context.getInstance().getDaoP().save(chassisglace50);
		Context.getInstance().getDaoP().save(chassisglace51);
		Context.getInstance().getDaoP().save(chassisglace52);
		Context.getInstance().getDaoP().save(chassisglace53);
		Context.getInstance().getDaoP().save(chassisglace54);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		Piece chassisbitume1 = new Piece("chassis",8000,bitume, pluie,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisbitume2 = new Piece("chassis",50000,bitume, pluie,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisbitume3 = new Piece("chassis",12000,bitume, pluie,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisbitume4 = new Piece("chassis",12000,bitume, pluie,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisbitume5 = new Piece("chassis",65000,bitume, pluie,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisbitume6 = new Piece("chassis",35000,bitume, pluie,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisbitume7 = new Piece("chassis",15000,bitume, pluie,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisbitume8 = new Piece("chassis",70000,bitume, pluie,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisbitume9 = new Piece("chassis",35000,bitume, pluie,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisbitume10 = new Piece("chassis",12000,bitume, pluie,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisbitume11 = new Piece("chassis",105000,bitume, pluie,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisbitume12 = new Piece("chassis",60000,bitume, pluie,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisbitume13 = new Piece("chassis",35000,bitume, pluie,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisbitume14 = new Piece("chassis",50000,bitume, pluie,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisbitume15 = new Piece("chassis",95000,bitume, pluie,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisbitume16 = new Piece("chassis",35000,bitume, pluie,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisbitume17 = new Piece("chassis",95000,bitume, pluie,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisbitume18 = new Piece("chassis",75500,bitume, pluie,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisbitume19 = new Piece("chassis",8000,bitume, sec,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisbitume20 = new Piece("chassis",50000,bitume, sec,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisbitume21 = new Piece("chassis",12000,bitume, sec,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisbitume22 = new Piece("chassis",12000,bitume, sec,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisbitume23 = new Piece("chassis",65000,bitume, sec,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisbitume24 = new Piece("chassis",35000,bitume, sec,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisbitume25 = new Piece("chassis",15000,bitume, sec,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisbitume26 = new Piece("chassis",70000,bitume, sec,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisbitume27 = new Piece("chassis",35000,bitume, sec,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisbitume28 = new Piece("chassis",12000,bitume, sec,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisbitume29 = new Piece("chassis",105000,bitume, sec,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisbitume30 = new Piece("chassis",60000,bitume, sec,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisbitume31 = new Piece("chassis",35000,bitume, sec,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisbitume32 = new Piece("chassis",50000,bitume, sec,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisbitume33 = new Piece("chassis",90000,bitume, sec,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisbitume34 = new Piece("chassis",35000,bitume, sec,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisbitume35 = new Piece("chassis",95000,bitume, sec,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg");
		Piece chassisbitume36 = new Piece("chassis",75500,bitume, sec,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Piece chassisbitume37 = new Piece("chassis",8000,bitume, brouillard,duo,false,ecoPlus,"/Images/ChassisDuoFalseEp.jpg");
		Piece chassisbitume38 = new Piece("chassis",50000,bitume, brouillard,duo,false,luxe,"/Images/ChassisDuoFalseLu.png");
		Piece chassisbitume39 = new Piece("chassis",12200,bitume, brouillard,duo,false,tuning,"/Images/ChassisDuoFalseTu.jpg");
		
		Piece chassisbitume40 = new Piece("chassis",12000,bitume, brouillard,duo,true,ecoPlus,"/Images/ChassisDuoTrueEp.jpg");
		Piece chassisbitume41 = new Piece("chassis",65000,bitume, brouillard,duo,true,luxe,"/Images/ChassisDuoTrueLu.png");
		Piece chassisbitume42 = new Piece("chassis",35000,bitume, brouillard,duo,true,tuning,"/Images/ChassisDuoTrueTu.jpg");
		
		Piece chassisbitume43 = new Piece("chassis",15000,bitume, brouillard,famille,false,ecoPlus,"/Images/ChassisFamFalseEp.png");
		Piece chassisbitume44 = new Piece("chassis",70000,bitume, brouillard,famille,false,luxe,"/Images/ChassisFamFalseLu.png");
		Piece chassisbitume45 = new Piece("chassis",35000,bitume, brouillard,famille,false,tuning,"/Images/ChassisFamFalseTu.jpg"); 
		
		Piece chassisbitume46 = new Piece("chassis",12000,bitume, brouillard,famille,true,ecoPlus,"/Images/ChassisFamiTrueTu.jpg");
		Piece chassisbitume47 = new Piece("chassis",10500,bitume, brouillard,famille,true,luxe,"/Images/ChassisFamTrueLu.jpg");
		Piece chassisbitume48 = new Piece("chassis",60000,bitume, brouillard,famille,true,tuning,"/Images/ChassisFamTrueTu.jpg"); 
		
		Piece chassisbitume49 = new Piece("chassis",35000,bitume, brouillard,tourisme,false,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisbitume50 = new Piece("chassis",50000,bitume, brouillard,tourisme,false,luxe,"/Images/ChassisTouFalseLu.jpg");
		Piece chassisbitume51 = new Piece("chassis",90000,bitume, brouillard,tourisme,false,tuning,"/Images/ChassisTouFalseTu.jpg"); 
		
		Piece chassisbitume52 = new Piece("chassis",35000,bitume, brouillard,tourisme,true,ecoPlus,"/Images/ChassisTouFalseEp.png");
		Piece chassisbitume53 = new Piece("chassis",95000,bitume, brouillard,tourisme,true,luxe,"/Images/ChassisTouTrueLu.jpg\"");
		Piece chassisbitume54 = new Piece("chassis",75500,bitume, brouillard,tourisme,true,tuning,"/Images/ChassisTouTrueTu.jpg"); 
		
		Context.getInstance().getDaoP().save(chassisbitume1);
		Context.getInstance().getDaoP().save(chassisbitume2);
		Context.getInstance().getDaoP().save(chassisbitume3);
		Context.getInstance().getDaoP().save(chassisbitume4);
		Context.getInstance().getDaoP().save(chassisbitume5);
		Context.getInstance().getDaoP().save(chassisbitume6);
		Context.getInstance().getDaoP().save(chassisbitume7);
		Context.getInstance().getDaoP().save(chassisbitume8);
		Context.getInstance().getDaoP().save(chassisbitume9);
		Context.getInstance().getDaoP().save(chassisbitume10);
		Context.getInstance().getDaoP().save(chassisbitume11);
		Context.getInstance().getDaoP().save(chassisbitume12);
		Context.getInstance().getDaoP().save(chassisbitume13);
		Context.getInstance().getDaoP().save(chassisbitume14);
		Context.getInstance().getDaoP().save(chassisbitume15);
		Context.getInstance().getDaoP().save(chassisbitume16);
		Context.getInstance().getDaoP().save(chassisbitume17);
		Context.getInstance().getDaoP().save(chassisbitume18);
		Context.getInstance().getDaoP().save(chassisbitume19);
		Context.getInstance().getDaoP().save(chassisbitume20);
		Context.getInstance().getDaoP().save(chassisbitume21);
		Context.getInstance().getDaoP().save(chassisbitume22);
		Context.getInstance().getDaoP().save(chassisbitume23);
		Context.getInstance().getDaoP().save(chassisbitume24);
		Context.getInstance().getDaoP().save(chassisbitume25);
		Context.getInstance().getDaoP().save(chassisbitume26);
		Context.getInstance().getDaoP().save(chassisbitume27);
		Context.getInstance().getDaoP().save(chassisbitume28);
		Context.getInstance().getDaoP().save(chassisbitume29);
		Context.getInstance().getDaoP().save(chassisbitume30);
		Context.getInstance().getDaoP().save(chassisbitume31);
		Context.getInstance().getDaoP().save(chassisbitume32);
		Context.getInstance().getDaoP().save(chassisbitume33);
		Context.getInstance().getDaoP().save(chassisbitume34);
		Context.getInstance().getDaoP().save(chassisbitume35);
		Context.getInstance().getDaoP().save(chassisbitume36);
		Context.getInstance().getDaoP().save(chassisbitume37);
		Context.getInstance().getDaoP().save(chassisbitume38);
		Context.getInstance().getDaoP().save(chassisbitume39);
		Context.getInstance().getDaoP().save(chassisbitume40);
		Context.getInstance().getDaoP().save(chassisbitume41);
		Context.getInstance().getDaoP().save(chassisbitume42);
		Context.getInstance().getDaoP().save(chassisbitume43);
		Context.getInstance().getDaoP().save(chassisbitume44);
		Context.getInstance().getDaoP().save(chassisbitume45);
		Context.getInstance().getDaoP().save(chassisbitume46);
		Context.getInstance().getDaoP().save(chassisbitume47);
		Context.getInstance().getDaoP().save(chassisbitume48);
		Context.getInstance().getDaoP().save(chassisbitume49);
		Context.getInstance().getDaoP().save(chassisbitume50);
		Context.getInstance().getDaoP().save(chassisbitume51);
		Context.getInstance().getDaoP().save(chassisbitume52);
		Context.getInstance().getDaoP().save(chassisbitume53);
		Context.getInstance().getDaoP().save(chassisbitume54);
		
	}

}
