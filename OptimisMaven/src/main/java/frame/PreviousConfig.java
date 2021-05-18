package frame;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import metier.Piece;
import util.Context;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PreviousConfig {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreviousConfig window = new PreviousConfig();
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
	public PreviousConfig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1060, 550);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


				
		JButton btnNewButton = new JButton("1\u00E8re configuration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultatConfigPrevious.main(null);
				Context.getInstance().setIdconfig(1);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton.setBounds(92, 165, 214, 171);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2\u00E8me configuration");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultatConfigPrevious.main(null);
				Context.getInstance().setIdconfig(2);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_1.setBounds(416, 165, 214, 171);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3\u00E8me configuration");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultatConfigPrevious.main(null);
				Context.getInstance().setIdconfig(3);
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNewButton_2.setBounds(723, 165, 224, 171);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Userlogsucces.main(null);
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_3.setBounds(945, 477, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PreviousConfig.class.getResource("/Images/BGterrain.jpg")));
		lblNewLabel.setBounds(0, 0, 1044, 511);
		frame.getContentPane().add(lblNewLabel);
	}
}
