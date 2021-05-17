package frame ;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;


import dao.Logverif;
import metier.Client;
import util.Context;





public class Userlogin {

//	Connection connection= null;

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userlogin window = new Userlogin();
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
	public Userlogin() {
		initialize();
//		connection = MyysqlConnection.dbConnector();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 530);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//ENTTREE USERNAME
		JLabel usernameLabel = new JLabel("USERNAME");
		usernameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		usernameLabel.setForeground(Color.WHITE);
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setBounds(1, 153, 155, 54);
		frame.getContentPane().add(usernameLabel);

		textField = new JTextField();
		textField.setBackground(new Color(255, 245, 238));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(143, 163, 171, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10); 
		
		//ENTREE MDP
		JLabel passwordLabel = new JLabel(" PASSWORD");
		passwordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(10, 256, 131, 36);
		frame.getContentPane().add(passwordLabel);

		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 245, 238));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(143, 261, 171, 31);
		frame.getContentPane().add(passwordField);
		

		//BOUTON LOGIN
		JButton btnLOGIN = new JButton("LOG IN");
		btnLOGIN.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnLOGIN.setForeground(Color.WHITE);
		btnLOGIN.setBackground(new Color(139, 69, 19));
		btnLOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String login=textField.getText();
				String password=String.valueOf(passwordField.getPassword());

				Client c = Context.getInstance().getDaoC().seConnecter(login, password);
				if(login.equals(c.getLogin()) && password.equals(c.getPassword()))
				{
					Userlogsucces.main(new String[]{});
					frame.dispose();
				}
				else //EXCCEPTION NON PRISE EN COMPTE
				{
					System.out.println("ERROR ID ne correspondent pas");
					frame.dispose();
					Userlogin.main(new String[]{});
			    }
		}
		});
		btnLOGIN.setBounds(159, 339, 131, 36);
		frame.getContentPane().add(btnLOGIN);
		
		//BOUTON RETOUR ACCUEUIL
		JButton btnAccueil = new JButton("ACCUEIL");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application.main(new String[]{});
				frame.dispose();
			}
		});
		btnAccueil.setForeground(Color.WHITE);
		btnAccueil.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAccueil.setBackground(new Color(211, 211, 211));
		btnAccueil.setBounds(159, 400, 131, 36);
		frame.getContentPane().add(btnAccueil);
		
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(Userlogin.class.getResource("/Images/wallpaperLOGIN.jpg")));
		lblNewLabel.setBounds(1, 0, 1004, 517);
		frame.getContentPane().add(lblNewLabel);



	}
}

