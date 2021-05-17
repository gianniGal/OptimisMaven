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

//		System.out.println(Context.getInstance().getSolSelected());
//		Piece roue = Context.getInstance().getDaoP().findTypePiece("pneu", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
//		String ValueRoue = roue.getLien();
//		System.out.println(ValueRoue);
		
		
		JLabel lblNewLabel = new JLabel("pneu");
//		lblNewLabel.setIcon(new ImageIcon(ResultatConfig.class.getResource(roue.getLien())));
		lblNewLabel.setBounds(1282, 565, 322, 292);
		frame.getContentPane().add(lblNewLabel);
//		
//		Piece moteur = Context.getInstance().getDaoP()
//				.findTypePiece("moteur", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_1 = new JLabel("moteur");
//		lblNewLabel_1.setIcon(new ImageIcon(ResultatConfig.class.getResource(moteur.getLien())));
		lblNewLabel_1.setBounds(731, 805, 293, 225);
		frame.getContentPane().add(lblNewLabel_1);

//		Piece frein = Context.getInstance().getDaoP()
//				.findTypePiece("frein", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_2 = new JLabel("frein");
//		lblNewLabel_2.setIcon(new ImageIcon(ResultatConfig.class.getResource(frein.getLien())));
		lblNewLabel_2.setBounds(121, 303, 229, 216);
		frame.getContentPane().add(lblNewLabel_2);

//		Piece suspension = Context.getInstance().getDaoP()
//				.findTypePiece("suspension", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_3 = new JLabel("suspension");
//		lblNewLabel_3.setIcon(new ImageIcon(ResultatConfig.class.getResource(suspension.getLien())));
		lblNewLabel_3.setBounds(121, 664, 278, 284);
		frame.getContentPane().add(lblNewLabel_3);

//		Piece chassis = Context.getInstance().getDaoP()
//				.findTypePiece("chassis", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_4 = new JLabel("chassis");
//		lblNewLabel_4.setIcon(new ImageIcon(ResultatConfig.class.getResource(chassis.getLien())));
		lblNewLabel_4.setBounds(534, 296, 595, 491);
		frame.getContentPane().add(lblNewLabel_4);

//		Piece phare = Context.getInstance().getDaoP()
//				.findTypePiece("phare", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_5 = new JLabel("phare");
//		lblNewLabel_5.setIcon(new ImageIcon(ResultatConfig.class.getResource(phare.getLien())));
		lblNewLabel_5.setBounds(1282, 296, 302, 303);
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
		btnNewButton.setBounds(frame.getWidth() - 250 , frame.getHeight() - 100, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(frame.getWidth() - 300 , frame.getHeight() - 150, 89, 23);
		frame.getContentPane().add(btnNewButton_1);		
		
	}
}
