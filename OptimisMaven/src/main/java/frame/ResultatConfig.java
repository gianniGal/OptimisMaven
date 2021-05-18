package frame;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import metier.Piece;
import util.Context;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ResultatConfig {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultatConfig window = new ResultatConfig();
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
	public ResultatConfig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//		frame.setBounds(0, 0, screenSize.width, screenSize.height);
		frame.setBounds(100, 100, 1900,1000);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		Piece roue = Context.getInstance().getDaoP().findTypePiece("pneu", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(),
				Context.getInstance().getNombrePlacesSelected(),Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());
//		System.out.println(roue);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ResultatConfig.class.getResource(roue.getLien())));
		//lblNewLabel.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/pneuRouteTune.jpg")));
		lblNewLabel.setBounds(559, 701, 200, 200);
		frame.getContentPane().add(lblNewLabel);
	
		
		Piece moteur = Context.getInstance().getDaoP().findTypePiece("moteur", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(),
				Context.getInstance().getNombrePlacesSelected(),Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(ResultatConfig.class.getResource(moteur.getLien())));
		//lblNewLabel_1.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/moteurSport.jpg")));
		lblNewLabel_1.setBounds(71, 194, 200, 200);
		frame.getContentPane().add(lblNewLabel_1);

		
		Piece frein = Context.getInstance().getDaoP().findTypePiece("frein", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(),
				Context.getInstance().getNombrePlacesSelected(),Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ResultatConfig.class.getResource(frein.getLien())));
		//lblNewLabel_2.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/freinSport.jpg")));
		lblNewLabel_2.setBounds(1075, 619, 200, 200);
		frame.getContentPane().add(lblNewLabel_2);

		
		Piece suspension = Context.getInstance().getDaoP().findTypePiece("suspension", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(),
				Context.getInstance().getNombrePlacesSelected(),Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ResultatConfig.class.getResource(suspension.getLien())));
		//lblNewLabel_3.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/suspensionAdaptative.jpg")));
		lblNewLabel_3.setBounds(166, 556, 200, 200);
		frame.getContentPane().add(lblNewLabel_3);

		
		Piece chassis = Context.getInstance().getDaoP().findTypePiece("chassis", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(),
				Context.getInstance().getNombrePlacesSelected(),Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ResultatConfig.class.getResource(chassis.getLien())));
		//lblNewLabel_4.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/ChassisDuoFalseTu.jpg")));
		lblNewLabel_4.setBounds(443, 63, 700, 500);
		frame.getContentPane().add(lblNewLabel_4);

		
		Piece phare = Context.getInstance().getDaoP().findTypePiece("phare", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(),
				Context.getInstance().getNombrePlacesSelected(),Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(ResultatConfig.class.getResource(phare.getLien())));
		//lblNewLabel_5.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/phareTune.jpg")));
		lblNewLabel_5.setBounds(1265, 323, 200, 200);
		frame.getContentPane().add(lblNewLabel_5);
		

		JButton btnNewButton = new JButton("Sauvegarder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				Context.getInstance().setConfig(phare);
				Context.getInstance().setConfig(chassis);
				Context.getInstance().setConfig(suspension);
				Context.getInstance().setConfig(frein);
				Context.getInstance().setConfig(roue);
				Context.getInstance().getDaoC().saveConfig(chassis, moteur, roue, phare, frein, suspension);


				System.out.println(Context.getInstance().getConfig());


			}
		});
		btnNewButton.setBounds(frame.getWidth()-250 , frame.getHeight()-100, 108, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoixContraintes.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(frame.getWidth()-130 , frame.getHeight()-100, 89, 23);
		frame.getContentPane().add(btnNewButton_1);		



        int yLabel = 140;
		JLabel lblNewLabel_9 = new JLabel("Contraintes choisies :");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		lblNewLabel_9.setBounds(1622, yLabel , 216, 38);
		frame.getContentPane().add(lblNewLabel_9);
		
        yLabel+=100;
		JLabel lblNewLabel_6 = new JLabel(Context.getInstance().getSolSelected().getSol());
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(1622, yLabel , 92, 28);
		frame.getContentPane().add(lblNewLabel_6);

		yLabel+=70;
		JLabel lblNewLabel_7 = new JLabel(Context.getInstance().getMeteoSelected().getMeteo());
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(1622, yLabel, 92, 28);
		frame.getContentPane().add(lblNewLabel_7);
		
		yLabel+=70;
		JLabel lblNewLabel_14 = new JLabel(Context.getInstance().getNombrePlacesSelected().getNombrePlaces());
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(1622, yLabel, 92, 28);
		frame.getContentPane().add(lblNewLabel_14);
		
        yLabel+=70;
		JLabel lblNewLabel_8 = new JLabel(Context.getInstance().getSurclasserSelected().getSurclasser());
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(1622, yLabel, 92, 28);
		frame.getContentPane().add(lblNewLabel_8);

		
		yLabel+=70;
		if (Context.getInstance().isCourseSelected() == true) {
			JLabel lblNewLabel_10 = new JLabel("Mode course");
			lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_10.setBounds(1622, yLabel, 92, 28);
			frame.getContentPane().add(lblNewLabel_10);
		}


		//PRIX
		double a=roue.getPrix();
		double b=phare.getPrix();
		double c=chassis.getPrix();
		double d=frein.getPrix();
		double e=suspension.getPrix();
		double f=moteur.getPrix();
		double g = a+b+c+d+e+f;
		String h = Double.toString(g) + " €";
		
		yLabel+=100;
		JLabel lblNewLabel_16 = new JLabel("TOTAL : ");
		lblNewLabel_16.setBounds(1622, yLabel, 100, 35);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_16);
		
		yLabel+=30;
		JLabel lblNewLabel_12 = new JLabel(h);
		lblNewLabel_12.setBounds(1622, yLabel, 100, 35);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_12);

		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/FondNouvelleConfig.jpg")));
		lblNewLabel_11.setBounds(0, 0, 1884, 961);
		frame.getContentPane().add(lblNewLabel_11);

		
	}
}
