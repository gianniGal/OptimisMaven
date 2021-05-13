package frame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class ErrorChampsVide extends javax.swing.JFrame{
	
	

	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorChampsVide window = new ErrorChampsVide();
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
	public ErrorChampsVide() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);

		frame.setBounds(0, 0, 320, 205);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
	    //BOUTON DE RECHERCHE
		JButton btnSearch = new JButton("OK");
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			} 
		});
		btnSearch.setBounds(90 , 71, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JLabel lblNewLabel_1 = new JLabel("ERREUR CHAMPS VIDE");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(75, 46, 171, 14);
		frame.getContentPane().add(lblNewLabel_1);
		

	}
	

}
