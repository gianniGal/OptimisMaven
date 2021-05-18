package frame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class ValidationPopUp2 extends javax.swing.JFrame{
	
	

	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidationPopUp2 window = new ValidationPopUp2();
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
	public ValidationPopUp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);

		frame.setBounds(0, 0, 320, 373);
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
		btnSearch.setBounds(109 , 300, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JLabel lblNewLabel_1 = new JLabel("La puuurge !");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(74, 71, 171, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ValidationPopUp2.class.getResource("/Images/ImageImposee.jpg")));
		lblNewLabel.setBounds(0, 0, 304, 334);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
