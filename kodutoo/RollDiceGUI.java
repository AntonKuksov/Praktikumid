package kodutoo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class RollDiceGUI {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RollDiceGUI window = new RollDiceGUI();
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

	public static Gener First = new Gener();

	public static Gener Second = new Gener();
	CheckPlayerNum Check = new CheckPlayerNum(First, Second);

	public RollDiceGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.scrollbar);
		frame.setBackground(SystemColor.controlHighlight);
		frame.setBounds(100, 100, 440, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Dice Roller v0.1");

		JLabel lblDicePic = new JLabel("");
		lblDicePic.setBounds(148, 72, 141, 95);
		frame.getContentPane().add(lblDicePic);

		JLabel lblDiceStartWin = new JLabel("");
		lblDiceStartWin.setIcon(new ImageIcon(RollDiceGUI.class.getResource("/kodutoo/ThrowDice.gif")));
		lblDiceStartWin.setBounds(100, 10, 141, 95);

		JLabel lblFirstPlayer = new JLabel(First.player);
		lblFirstPlayer.setBounds(10, 27, 118, 34);
		lblFirstPlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstPlayer.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblSecondPlayer = new JLabel(Second.player);
		lblSecondPlayer.setBounds(280, 27, 134, 34);
		lblSecondPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondPlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblScore = new JLabel("Score");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblScore.setBounds(148, 11, 118, 34);
		frame.getContentPane().add(lblScore);

		JLabel lblFinalScore = new JLabel("");
		lblFinalScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalScore.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblFinalScore.setBounds(148, 42, 118, 34);
		frame.getContentPane().add(lblFinalScore);

		JTextArea txtFirstPlayer = new JTextArea();
		txtFirstPlayer.setBounds(51, 72, 50, 43);
		txtFirstPlayer.setEditable(false);
		txtFirstPlayer.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JTextArea txtSecondPlayer = new JTextArea();
		txtSecondPlayer.setBounds(328, 72, 50, 43);
		txtSecondPlayer.setEditable(false);
		txtSecondPlayer.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JTextArea txtFinalResult = new JTextArea();
		txtFinalResult.setBounds(148, 234, 230, 29);
		txtFinalResult.setEditable(false);
		txtFinalResult.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JTextArea txtFirstPlayerNUM1 = new JTextArea();
		txtFirstPlayerNUM1.setBounds(20, 133, 50, 43);
		txtFirstPlayerNUM1.setEditable(false);
		txtFirstPlayerNUM1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JTextArea txtFirstPlayerNUM2 = new JTextArea();
		txtFirstPlayerNUM2.setBounds(88, 133, 47, 43);
		txtFirstPlayerNUM2.setEditable(false);
		txtFirstPlayerNUM2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JTextArea txtSecondPlayerNUM1 = new JTextArea();
		txtSecondPlayerNUM1.setBounds(299, 133, 50, 43);
		txtSecondPlayerNUM1.setEditable(false);
		txtSecondPlayerNUM1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JTextArea txtSecondPlayerNUM2 = new JTextArea();
		txtSecondPlayerNUM2.setBounds(367, 133, 47, 43);
		txtSecondPlayerNUM2.setEditable(false);
		txtSecondPlayerNUM2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JButton btnSecondPlayer = new JButton("GO!");
		btnSecondPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnSecondPlayer.setEnabled(false);
				lblDicePic.setIcon(new ImageIcon(RollDiceGUI.class.getResource("/kodutoo/ThrowDice.gif")));
				txtFinalResult.setText("");

				final Timer t = new Timer(900, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {

						Second.rand1();
						String num3 = "" + Second.x;
						String num4 = "" + Second.y;
						String secondsum = "" + Second.sum;
						txtSecondPlayerNUM1.setText(num3);
						txtSecondPlayerNUM2.setText(num4);
						txtSecondPlayer.setText(secondsum);
						lblDicePic.setIcon(new ImageIcon(RollDiceGUI.class.getResource("")));
						if (First.sum != 0) {
							txtFinalResult.setText(Check.Kontrol());
							lblFinalScore.setText(Check.Score());
						}

					}
				});
				t.setRepeats(false);
				t.start();
			}
		});
		btnSecondPlayer.setBounds(322, 187, 80, 33);
		btnSecondPlayer.setFont(new Font("Tahoma", Font.BOLD, 20));

		JLabel lblFinalResult = new JLabel("Final result:");
		lblFinalResult.setBounds(17, 231, 118, 34);
		lblFinalResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalResult.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JButton btnFirstPlayer = new JButton("GO!");
		btnFirstPlayer.setBounds(38, 187, 80, 33);
		btnFirstPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				btnFirstPlayer.setEnabled(false);
				lblDicePic.setIcon(new ImageIcon(RollDiceGUI.class.getResource("/kodutoo/ThrowDice.gif")));
				txtFinalResult.setText("");

				final Timer t = new Timer(900, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {

						First.rand1();
						String num1 = "" + First.x;
						String num2 = "" + First.y;
						String firstsum = "" + First.sum;
						txtFirstPlayerNUM1.setText(num1);
						txtFirstPlayerNUM2.setText(num2);
						txtFirstPlayer.setText(firstsum);
						lblDicePic.setIcon(new ImageIcon(RollDiceGUI.class.getResource("")));

						if (Second.sum != 0) {
							txtFinalResult.setText(Check.Kontrol());
							lblFinalScore.setText(Check.Score());
						}
					}
				});
				t.setRepeats(false);
				t.start();

			}
		});

		btnFirstPlayer.setFont(new Font("Tahoma", Font.BOLD, 20));

		JButton btnNewGame = new JButton("New game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!btnFirstPlayer.isEnabled() && !btnSecondPlayer.isEnabled()) {
					First.sum = 0;
					Second.sum = 0;
					Check.score[0] = 0;
					Check.score[1] = 0;

					txtFirstPlayer.setText(null);
					txtFirstPlayerNUM1.setText(null);
					txtFirstPlayerNUM2.setText(null);
					txtSecondPlayer.setText(null);
					txtSecondPlayerNUM1.setText(null);
					txtSecondPlayerNUM2.setText(null);
					lblFinalScore.setText(null);
					txtFinalResult.setText(null);
					btnFirstPlayer.setEnabled(true);
					btnSecondPlayer.setEnabled(true);
				} else {
					txtFinalResult.setText("Press GO!");
				}
			}
		});
		btnNewGame.setBounds(158, 187, 134, 33);
		btnNewGame.setFont(new Font("Tahoma", Font.BOLD, 18));

		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblFirstPlayer);
		frame.getContentPane().add(txtFirstPlayer);
		frame.getContentPane().add(txtFirstPlayerNUM1);
		frame.getContentPane().add(txtFirstPlayerNUM2);
		frame.getContentPane().add(btnFirstPlayer);
		frame.getContentPane().add(lblSecondPlayer);
		frame.getContentPane().add(txtSecondPlayer);
		frame.getContentPane().add(txtSecondPlayerNUM1);
		frame.getContentPane().add(txtSecondPlayerNUM2);
		frame.getContentPane().add(btnSecondPlayer);
		frame.getContentPane().add(lblFinalResult);
		frame.getContentPane().add(txtFinalResult);
		frame.getContentPane().add(btnNewGame);

		JLabel label = new JLabel("");
		label.setEnabled(false);
		label.setIcon(new ImageIcon(RollDiceGUI.class.getResource("/kodutoo/diceintro.gif")));
		label.setBounds(0, -30, 424, 340);
		frame.getContentPane().add(label);

	}
}
