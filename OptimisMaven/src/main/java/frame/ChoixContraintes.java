package frame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.List;


import metier.FiltresTerrain.*;
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


		//POSITION INITIAL DU 1ER TERRAIN AFFICHE
		int xRadioButton = 75 ;
		int yRadioButton = 55;

		for(Sol s : Context.getInstance().getTerrainSelected().getSol()) 
		{


			//CREATION BOUTON RADIO POUR LE TERRAIN
			JRadioButton rdbtnNewRadioButton = new JRadioButton(t.getClass().getSimpleName());		
			rdbtnNewRadioButton.addItemListener(new ItemListener() {    
				public void itemStateChanged(ItemEvent e) {                 
					String check =  e.getStateChange()==1?"checked":"unchecked"; 

					if (check.equals("checked") ) {
						Context.getInstance().setTerrainSelected(t);
					}
				}    
			});   

			rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
			rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			rdbtnNewRadioButton.setBounds(xRadioButton, yRadioButton, 97, 23);
			frame.getContentPane().add(rdbtnNewRadioButton);

			//MISE DANS LE GROUPE BOUTON RADIO POUR N'AVOIR QU'UN SEUL BOUTON ACTIF A LA FOIS
			group.add(rdbtnNewRadioButton);



			//MISE EN PLACE DE L'AFFICHAGE DU  PROCHAIN TERRAIN
			xRadioButton-=10;
			yRadioButton+=30;

			//MISE EN PLACE DE L'ICON DE TERRAIN
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(NouvelleConfig.class.getResource(t.lien)));

			lblNewLabel.setBounds(xRadioButton, yRadioButton, 118, 115);
			frame.getContentPane().add(lblNewLabel);
			lblNewLabel.addMouseListener(new MouseListener() {

				//ACTION AU SEIN DE L'IMAGE DE TERRAIN
				//PERMET DE DEFINIR SI NOS CONTRAINTES SONT FALSE
				@Override
				public void mouseClicked(MouseEvent e) {
					ChoixContraintes.main(null);
					frame.dispose();
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {

				}

				@Override
				public void mouseExited(MouseEvent e) {


				}


			});

			// INCREMENTATION POUR LA MISE EN PLACE DU PROCHAIN TERRAIN
			xRadioButton+=210;
			yRadioButton = 55;

			//MISE A LA LIGNE SI ON ARRIVE AU BORD DU TERRAIN
			if ( xRadioButton + 100 > frame.getWidth() ) {
				cpt++;
				xRadioButton=75;
				yRadioButton+=200*cpt;
				aboveBorder = true;
			}else if (aboveBorder = true && xRadioButton < frame.getWidth() ) {
				yRadioButton+=200*cpt;
			}


		}


		//BOUTON DE RETOUR EN ARRIERE
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Userlogsucces.main(new String[]{});
				frame.dispose();
			} 
		});
		btnBack.setBounds(frame.getWidth() - 150 , frame.getHeight() - 100 , 89, 23);
		frame.getContentPane().add(btnBack);

		//BOUTON DE RECHERCHE
		JButton btnSearch = new JButton("Validé");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//				la query retourne une liste de piece
				//				List<Piece> piecesOpti = DAOVehicule. find all pieces
				//				Vehicule vehiculeOpti = new Vehicule(login,password,piecesOpti)   1Client plusieurs Vehicules
				//						daoVehicule.save(v);

				//M
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
