package frame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import metier.FiltresTerrain.Meteo;
import metier.FiltresTerrain.NbDePlaces;
import metier.FiltresTerrain.Sol;
import util.Context;

public class ChoixContraintes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixContraintes window = new ChoixContraintes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChoixContraintes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//frame.setBounds(0, 0, screenSize.width, screenSize.height);
		frame.setBounds(0, 0, 1060, 550);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		int cpt = 0;

		boolean aboveBorder = false;


		ButtonGroup group = new ButtonGroup();
		ButtonGroup group2 = new ButtonGroup();


		//POSITION INITIAL DU 1ER TERRAIN AFFICHE
		int xRadioButton = 75;
		int yRadioButton = 55;



		for(Sol s : Context.getInstance().getTerrainSelected().getSols()) 
		{


			//CREATION BOUTON RADIO POUR LE TERRAIN
			JRadioButton rdbtnNewRadioButton = new JRadioButton(s.getSol());		
			rdbtnNewRadioButton.addItemListener(new ItemListener() {    
				public void itemStateChanged(ItemEvent e) {                 
					String check =  e.getStateChange()==1?"checked":"unchecked"; 

					if (check.equals("checked") ) {
						Context.getInstance().setSolSelected(s);

					}
				}    
			});   


			rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnNewRadioButton.setBounds(xRadioButton, yRadioButton, 97, 23);
			frame.getContentPane().add(rdbtnNewRadioButton);

			//MISE DANS LE GROUPE BOUTON RADIO POUR N'AVOIR QU'UN SEUL BOUTON ACTIF A LA FOIS
			group.add(rdbtnNewRadioButton);

			// INCREMENTATION POUR LA MISE EN PLACE DU PROCHAIN TERRAIN
			xRadioButton+=210;
			yRadioButton = 55;
			

			//MISE A LA LIGNE SI ON ARRIVE AU BORD DU TERRAIN
			if ( xRadioButton + 100 > frame.getWidth() ) {
				cpt++;
				xRadioButton=75;
				yRadioButton+=50*cpt;
				aboveBorder = true;
			}else if (aboveBorder == true && xRadioButton < frame.getWidth() ) {
				yRadioButton+=50*cpt;
			}


		}





		//Contraintes Meteo


		xRadioButton = 75;
		yRadioButton += 75;
		int tmp = yRadioButton;
		aboveBorder = false;
		cpt=0;

		for(Meteo m : Context.getInstance().getTerrainSelected().getMeteos()) 
		{
          System.out.println(yRadioButton);
             
			//CREATION BOUTON RADIO POUR LE TERRAIN
			JRadioButton rdbtnNewRadioButton = new JRadioButton(m.getMeteo());		
			rdbtnNewRadioButton.addItemListener(new ItemListener() {    
				public void itemStateChanged(ItemEvent e) {                 
					String check =  e.getStateChange()==1?"checked":"unchecked"; 

					if (check.equals("checked") ) {
						Context.getInstance().setMeteoSelected(m);

					}
				}    
			});   


			rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnNewRadioButton.setBounds(xRadioButton, yRadioButton, 97, 23);
			frame.getContentPane().add(rdbtnNewRadioButton);

			//MISE DANS LE GROUPE BOUTON RADIO POUR N'AVOIR QU'UN SEUL BOUTON ACTIF A LA FOIS
			group2.add(rdbtnNewRadioButton);






			// INCREMENTATION POUR LA MISE EN PLACE DU PROCHAIN TERRAIN
			xRadioButton+=210;
			yRadioButton = tmp;

			//MISE A LA LIGNE SI ON ARRIVE AU BORD DU TERRAIN
			if ( xRadioButton + 100 > frame.getWidth() ) {
				cpt++;
				xRadioButton=75;
				yRadioButton+=50*cpt;
				aboveBorder = true;
			}else if (aboveBorder == true && xRadioButton < frame.getWidth() ) {
				yRadioButton+=50*cpt;
			}


		}
		
		//Contraintes NbPlace


		xRadioButton = 75;
		yRadioButton += 75;
		tmp = yRadioButton;
		aboveBorder = false;
		cpt=0;

		for(NbDePlaces nb : Context.getInstance().getTerrainSelected().getNombrePlaces()) 
		{
          System.out.println(yRadioButton);
             
			//CREATION BOUTON RADIO POUR LE TERRAIN
			JRadioButton rdbtnNewRadioButton = new JRadioButton(nb.getNombrePlaces());		
			rdbtnNewRadioButton.addItemListener(new ItemListener() {    
				public void itemStateChanged(ItemEvent e) {                 
					String check =  e.getStateChange()==1?"checked":"unchecked"; 

					if (check.equals("checked") ) {
						Context.getInstance().setNombrePlacesSelected(nb);

					}
				}    
			});   


			rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnNewRadioButton.setBounds(xRadioButton, yRadioButton, 97, 23);
			frame.getContentPane().add(rdbtnNewRadioButton);

			//MISE DANS LE GROUPE BOUTON RADIO POUR N'AVOIR QU'UN SEUL BOUTON ACTIF A LA FOIS
			group2.add(rdbtnNewRadioButton);






			// INCREMENTATION POUR LA MISE EN PLACE DU PROCHAIN TERRAIN
			xRadioButton+=210;
			yRadioButton = tmp;

			//MISE A LA LIGNE SI ON ARRIVE AU BORD DU TERRAIN
			if ( xRadioButton + 100 > frame.getWidth() ) {
				cpt++;
				xRadioButton=75;
				yRadioButton+=50*cpt;
				aboveBorder = true;
			}else if (aboveBorder == true && xRadioButton < frame.getWidth() ) {
				yRadioButton+=50*cpt;
			}


		}


		//BOUTON DE RETOUR EN ARRIERE
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NouvelleConfig.main(new String[]{});
				frame.dispose();
			} 
		});
		btnBack.setBounds(frame.getWidth() - 150 , frame.getHeight() - 100 , 89, 23);
		frame.getContentPane().add(btnBack);

		//BOUTON DE RECHERCHE
		JButton btnSearch = new JButton("Validé");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultatConfig.main(new String[]{});
				frame.dispose();
			} 
		});
		btnSearch.setBounds(frame.getWidth() - 250 , frame.getHeight() - 100, 89, 23);
		frame.getContentPane().add(btnSearch);


		//FOND D ECRAN DE LA FRAME
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(NouvelleConfig.class.getResource("/Images/BGterrain.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(0, 0, 1044, 511);
		frame.getContentPane().add(lblNewLabel_1);

		
	}

	
	
	

}
