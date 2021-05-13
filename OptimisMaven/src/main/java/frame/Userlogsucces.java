package frame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Userlogsucces {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userlogsucces window = new Userlogsucces();
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
	public Userlogsucces() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1004, 562);
		//METTRE LA FRAME AU CENTRE
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BOUTON POUR VOIR LES CONFIGURATIONS PRECEDENTES 
		JButton btnNewButton_1 = new JButton("Previous Config");
		btnNewButton_1.setIcon(new ImageIcon(Userlogsucces.class.getResource("/Images/previousconf.jpg")));
		btnNewButton_1.setBounds(169, 288, 228, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		//BOUTON POUR CREER NOUVELLE CONFIGURATION
		JButton btnNewButton_2 = new JButton("New Config");
		btnNewButton_2.setIcon(new ImageIcon(Userlogsucces.class.getResource("/Images/newconf.jpg")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NouvelleConfig.main(new String[]{});
				
			}
		});
		btnNewButton_2.setBounds(169, 357, 205, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		//BOUTON DE DECONNEXION
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.setIcon(new ImageIcon(Userlogsucces.class.getResource("/Images/logout.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(169, 425, 130, 33);
		frame.getContentPane().add(btnNewButton);
		
		//FOND ECRAN 
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Userlogsucces.class.getResource("/Images/choixconfig.jpg")));
		lblNewLabel.setBounds(0, 0, 988, 523);
		frame.getContentPane().add(lblNewLabel);
	}
}
