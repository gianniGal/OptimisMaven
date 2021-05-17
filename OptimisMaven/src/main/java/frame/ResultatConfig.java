package frame;

import java.awt.EventQueue;

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
		frame.setBounds(100, 100, 920,696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		System.out.println(Context.getInstance().getSolSelected());
		Piece roue = Context.getInstance().getDaoP().findTypePiece("pneu", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
//		String ValueRoue = roue.getLien();
//		System.out.println(ValueRoue);
		
		
		JLabel lblNewLabel = new JLabel("pneu");
		lblNewLabel.setIcon(new ImageIcon(ResultatConfig.class.getResource(roue.getLien())));
		lblNewLabel.setBounds(613, 300, 163, 194);
		frame.getContentPane().add(lblNewLabel);
		
		Piece moteur = Context.getInstance().getDaoP()
				.findTypePiece("moteur", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_1 = new JLabel("moteur");
		lblNewLabel_1.setIcon(new ImageIcon(ResultatConfig.class.getResource(moteur.getLien())));
		lblNewLabel_1.setBounds(65, 63, 212, 139);
		frame.getContentPane().add(lblNewLabel_1);

		Piece frein = Context.getInstance().getDaoP()
				.findTypePiece("frein", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_2 = new JLabel("frein");
		lblNewLabel_2.setIcon(new ImageIcon(ResultatConfig.class.getResource(frein.getLien())));
		lblNewLabel_2.setBounds(65, 300, 99, 85);
		frame.getContentPane().add(lblNewLabel_2);

		Piece suspension = Context.getInstance().getDaoP()
				.findTypePiece("suspension", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_3 = new JLabel("suspension");
		lblNewLabel_3.setIcon(new ImageIcon(ResultatConfig.class.getResource(suspension.getLien())));
		lblNewLabel_3.setBounds(65, 439, 136, 133);
		frame.getContentPane().add(lblNewLabel_3);

		Piece chassis = Context.getInstance().getDaoP()
				.findTypePiece("chassis", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_4 = new JLabel("chassis");
		lblNewLabel_4.setIcon(new ImageIcon(ResultatConfig.class.getResource(chassis.getLien())));
		lblNewLabel_4.setBounds(255, 183, 322, 248);
		frame.getContentPane().add(lblNewLabel_4);

		Piece phare = Context.getInstance().getDaoP()
				.findTypePiece("phare", Context.getInstance().getSolSelected(),Context.getInstance().getMeteoSelected(), Context.getInstance().getSurclasserSelected(), Context.getInstance().isCourseSelected());	
		JLabel lblNewLabel_5 = new JLabel("phare");
		lblNewLabel_5.setIcon(new ImageIcon(ResultatConfig.class.getResource(phare.getLien())));
		lblNewLabel_5.setBounds(603, 93, 204, 210);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Sauvegarder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setBounds(637, 526, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(740, 526, 89, 23);
		frame.getContentPane().add(btnNewButton_1);		
		
	}
}
