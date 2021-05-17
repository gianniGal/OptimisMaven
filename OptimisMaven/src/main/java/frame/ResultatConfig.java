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


//		Piece roue = Context.getInstance().getDaoP().findTypePiece("pneu", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());			
		JLabel lblNewLabel = new JLabel("pneu");
//		lblNewLabel.setIcon(new ImageIcon(ResultatConfig.class.getResource(roue.getLien())));
		lblNewLabel.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/pneuRouteTune.jpg")));
		lblNewLabel.setBounds(1154, 623, 374, 300);
		frame.getContentPane().add(lblNewLabel);
//		
//		Piece moteur = Context.getInstance().getDaoP().findTypePiece("moteur", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_1 = new JLabel("moteur");
//		lblNewLabel_1.setIcon(new ImageIcon(ResultatConfig.class.getResource(moteur.getLien())));
		lblNewLabel_1.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/moteurSport.jpg")));
		lblNewLabel_1.setBounds(45, 212, 374, 300);
		frame.getContentPane().add(lblNewLabel_1);

//		Piece frein = Context.getInstance().getDaoP().findTypePiece("frein", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_2 = new JLabel("frein");
//		lblNewLabel_2.setIcon(new ImageIcon(ResultatConfig.class.getResource(frein.getLien())));
		lblNewLabel_2.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/freinSport.jpg")));
		lblNewLabel_2.setBounds(620, 623, 374, 300);
		frame.getContentPane().add(lblNewLabel_2);

//		Piece suspension = Context.getInstance().getDaoP().findTypePiece("suspension", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_3 = new JLabel("suspension");
//		lblNewLabel_3.setIcon(new ImageIcon(ResultatConfig.class.getResource(suspension.getLien())));
		lblNewLabel_3.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/suspensionAdaptative.jpg")));
		lblNewLabel_3.setBounds(45, 623, 374, 300);
		frame.getContentPane().add(lblNewLabel_3);

//		Piece chassis = Context.getInstance().getDaoP()	.findTypePiece("chassis", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_4 = new JLabel("chassis");
//		lblNewLabel_4.setIcon(new ImageIcon(ResultatConfig.class.getResource(chassis.getLien())));
		lblNewLabel_4.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/ChassisDuoFalseTu.jpg")));
		lblNewLabel_4.setBounds(447, 112, 736, 500);
		frame.getContentPane().add(lblNewLabel_4);

//		Piece phare = Context.getInstance().getDaoP()		.findTypePiece("phare", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_5 = new JLabel("phare");
//		lblNewLabel_5.setIcon(new ImageIcon(ResultatConfig.class.getResource(phare.getLien())));
		lblNewLabel_5.setIcon(new ImageIcon(ResultatConfig.class.getResource("/Images/phareTune.jpg")));
		lblNewLabel_5.setBounds(1154, 201, 374, 300);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Sauvegarder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Context.getInstance().getConfig().add(phare);
//		        Context.getInstance().getConfig().add(chassis);
//		        Context.getInstance().getConfig().add(moteur);
//		        Context.getInstance().getConfig().add(suspension);
//		        Context.getInstance().getConfig().add(frein);
//		        Context.getInstance().getConfig().add(roue);

		        System.out.println(Context.getInstance().getConfig());
			}
		});
		btnNewButton.setBounds(1650 , 623, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(1785 , 623, 89, 23);
		frame.getContentPane().add(btnNewButton_1);		
		

		
		
		JLabel lblNewLabel_9 = new JLabel("Contraintes choisies :");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(1650, 173, 166, 38);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_6 = new JLabel(Context.getInstance().getSolSelected().getSol());
		lblNewLabel_6.setBounds(1650, 416, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(Context.getInstance().getMeteoSelected().getMeteo());
		lblNewLabel_7.setBounds(1650, 325, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(Context.getInstance().getSurclasserSelected().getSurclasser());
		lblNewLabel_8.setBounds(1650, 251, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		if (Context.getInstance().isCourseSelected()) {
		JLabel lblNewLabel_10 = new JLabel("Mode course");
		lblNewLabel_10.setBounds(1650, 486, 46, 14);
		frame.getContentPane().add(lblNewLabel_10);
		}
	
		
		//PRIIIIIX
//		double a=roue.getPrix();
//		double b=phare.getPrix();
//		double c=chassis.getPrix();
//		double d=frein.getPrix();
//		double e=suspension.getPrix();
//		double f=moteur.getPrix();
//		double g = a+b+c+d+e+f;
//		String h = String.valueOf(g) + " €"; 
		
//		JLabel lblNewLabel_11 = new JLabel(h);
//		lblNewLabel_11.setBounds(1650, 489, 46, 14);
//		frame.getContentPane().add(lblNewLabel_11);
		
	}
}
