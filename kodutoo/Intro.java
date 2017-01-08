package kodutoo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Intro {

	private JFrame frame2;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro window = new Intro();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 378, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("New Game");

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RollDiceGUI.First.player = textField.getText();
				RollDiceGUI.Second.player = textField_1.getText();
				RollDiceGUI window = new RollDiceGUI();
				window.frame.setVisible(true);
				frame2.dispose();

			}
		});
		btnNewButton.setBounds(99, 200, 158, 50);
		frame2.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(10, 39, 166, 28);
		frame2.getContentPane().add(textField);
		textField.setText("Player 1");
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Enter 1st player's name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 166, 30);
		frame2.getContentPane().add(lblNewLabel);

		JLabel lblEnterSecondPlayers = new JLabel("Enter 2nd player's name");
		lblEnterSecondPlayers.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterSecondPlayers.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterSecondPlayers.setBounds(186, 11, 174, 30);
		frame2.getContentPane().add(lblEnterSecondPlayers);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(186, 39, 174, 28);
		textField_1.setText("Player 2");
		frame2.getContentPane().add(textField_1);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Intro.class.getResource("/kodutoo/cube2.gif")));
		lblNewLabel_1.setBounds(122, 68, 135, 133);
		frame2.getContentPane().add(lblNewLabel_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Intro.class.getResource("/kodutoo/cube2.gif")));
		label.setBounds(0, 68, 135, 133);
		frame2.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Intro.class.getResource("/kodutoo/cube2.gif")));
		label_1.setBounds(235, 68, 125, 133);
		frame2.getContentPane().add(label_1);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					RollDiceGUI.First.player = textField.getText();
					RollDiceGUI.Second.player = textField_1.getText();
					RollDiceGUI window = new RollDiceGUI();
					window.frame.setVisible(true);
					frame2.dispose();
					System.out.println("Pressed");
				}
			}
		});
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					RollDiceGUI.First.player = textField.getText();
					RollDiceGUI.Second.player = textField_1.getText();
					RollDiceGUI window = new RollDiceGUI();
					window.frame.setVisible(true);
					frame2.dispose();
					System.out.println("Pressed");
				}
			}
		});
	}
}
