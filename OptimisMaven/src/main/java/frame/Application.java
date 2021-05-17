package frame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Application {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1004, 554);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//FOND ECRAN 
		JLabel lblNewLabel = new JLabel("wallpaper");
		lblNewLabel.setIcon(new ImageIcon(Application.class.getResource("/Images/wallpaperapplismallVF2.jpg")));
		lblNewLabel.setBounds(0, 30, 992, 485);
		frame.getContentPane().add(lblNewLabel);
		
		//BOUTON CONNEXION
		JLabel lblNewLabel_4_2 = new JLabel("Se connecter");
		lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Userlogin.main(new String[]{});
				frame.dispose();
			}
		});
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_4_2.setBounds(713, 0, 83, 27);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		//BOUTON CREER UN COMPTE
		JLabel lblNewLabel_4_2_1 = new JLabel("Creer un compte");
		lblNewLabel_4_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				CreationCompte.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_4_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_4_2_1.setBounds(806, 0, 125, 27);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
		//BOUTON EXIT APPLICATION
		JLabel lblNewLabel_4_2_2 = new JLabel("Exit");
		lblNewLabel_4_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel_4_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_4_2_2.setBounds(933, 0, 45, 27);
		frame.getContentPane().add(lblNewLabel_4_2_2);
		

	}
}
