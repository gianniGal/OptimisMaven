package frame;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import metier.Adresse;
import metier.Client;
import util.Context;

public class CreationCompte {

	private JFrame frame;

	private JTextField usernameField;
	private JTextField numRueField;
	private JTextField rueField;
	private JTextField villeField;
	private JTextField codeField;
	private JTextField telField;
	private JTextField mailField;


	private JTextField passwordField;

	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JLabel lblAdresse;
	private JLabel lblNumero;
	private JLabel lblRue;
	private JLabel lblVille;
	private JLabel lblCodePostal;
	private JLabel lblTelephone;
	private JLabel lblMail;
	private JButton btnNewButton;
	private JButton btnNewButton_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationCompte window = new CreationCompte();
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
	public CreationCompte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 940, 559);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);



		int x= 270;
		int y=110;

		//USERNAME
		usernameField = new JTextField();
		usernameField.setBackground(new Color(240, 248, 255));
		usernameField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);



		//PASSWORD
		y+=40;
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(240, 248, 255));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(x, y, 86, 20);
		passwordField.setColumns(10);
		frame.getContentPane().add(passwordField);


		//NUMERO DE RUE
		y+=80;
		numRueField = new JTextField();
		numRueField.setBackground(new Color(240, 248, 255));
		numRueField.setColumns(10);
		numRueField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(numRueField);


		//NOM DE RUE
		y+=40;
		rueField = new JTextField();
		rueField.setBackground(new Color(240, 248, 255));
		rueField.setColumns(10);
		rueField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(rueField);


		//NOM DE VILLE
		y+=40;
		villeField = new JTextField();
		villeField.setBackground(new Color(240, 248, 255));
		villeField.setColumns(10);
		villeField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(villeField);


		//CODE POSTAL
		y+=40;
		codeField = new JTextField();
		codeField.setBackground(new Color(240, 248, 255));
		codeField.setColumns(10);
		codeField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(codeField);



		//NUM TELEPHONE
		y+=40;
		telField = new JTextField();
		telField.setBackground(new Color(240, 248, 255));
		telField.setColumns(10);
		telField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(telField);


		//MAIL
		y+=40;
		mailField = new JTextField();
		mailField.setBackground(new Color(240, 248, 255));
		mailField.setColumns(10);
		mailField.setBounds(x, y, 86, 20);
		frame.getContentPane().add(mailField);


		//LABEL
		x= 160;
		y= 110;
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel.setBounds(x, y, 60, 14);
		frame.getContentPane().add(lblNewLabel);

		y+=40;
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblPassword.setBounds(x, y,  60, 14);
		frame.getContentPane().add(lblPassword);
		y+=40;
		lblAdresse = new JLabel("Adresse :");
		lblAdresse.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblAdresse.setBounds(x, y,   60, 14);
		frame.getContentPane().add(lblAdresse);
		y+=40;
		lblNumero = new JLabel("numero");
		lblNumero.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNumero.setBounds(x, y,   60, 14);
		frame.getContentPane().add(lblNumero);
		y+=40;
		lblRue = new JLabel("rue");
		lblRue.setBounds(x, y,   60, 14);
		lblRue.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		frame.getContentPane().add(lblRue);
		y+=40;
		lblVille = new JLabel("Ville");
		lblVille.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblVille.setBounds(x, y,   60, 14);
		frame.getContentPane().add(lblVille);
		y+=40;
		lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblCodePostal.setBounds(x, y,   70, 14);
		frame.getContentPane().add(lblCodePostal);
		y+=40;
		lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblTelephone.setBounds(x, y,  70, 14);
		frame.getContentPane().add(lblTelephone);
		y+=40;
		lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblMail.setBounds(x, y,   60, 14);
		frame.getContentPane().add(lblMail);


		//BOUTON CREATION COMPTE
		JLabel lblNewLabel_2 = 
				new JLabel("Creer");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//				
				// OU Integer.parseInt() mais StringToInt() don't work
				String username=usernameField.getText();
				String password=String.valueOf(((JPasswordField) passwordField).getPassword());
				String sNumero=numRueField.getText();
				int numero =  Integer.valueOf(sNumero);
				String rue=rueField.getText();
				String ville=villeField.getText();
				String sCodePostal=codeField.getText();
				int codePostal =  Integer.valueOf(sCodePostal);
				String sTelephone=telField.getText();
				int telephone =  Integer.valueOf(sTelephone);
				String mail=mailField.getText();


				

				Adresse a = new Adresse(rue, numero, ville, codePostal) ;
				Client c = new Client(username,password,a,telephone,mail);
				Context.getInstance().getDaoC().save(c);

				
				
				ValidationPopUp.main(null);



		}
	});
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(224, 255, 255));
		lblNewLabel_2.setBounds(x-25, y+40, 77, 20);
		frame.getContentPane().add(lblNewLabel_2);


		//BOUTON RETOUR ACCUEIL
		JLabel lblNewLabel_1 = 
				new JLabel("Back");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Application.main(null);
				frame.dispose();
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(224, 255, 255));
		lblNewLabel_1.setBounds(837, 22, 77, 20);
		frame.getContentPane().add(lblNewLabel_1);






		//FOND ECRAN
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(CreationCompte.class.getResource("/Images/creercompte.jpg")));
		lblNewLabel_3.setBounds(0, 0, 924, 520);
		frame.getContentPane().add(lblNewLabel_3);






}
}
