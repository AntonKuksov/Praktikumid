package kodutoo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KostiGUI extends JFrame {
	private JButton Go1_button = new JButton("GO FIRST!");
	private JButton Go2_button = new JButton("GO SECOND!");
	private JButton Compare_button = new JButton("Compare");

	private JLabel FirstPlayerInfolabel = new JLabel("FirtPlayer: ");
	private JLabel SecondPlayerInfolabel = new JLabel("SecondPlayer: ");

	private JLabel FirstPlayerlabel = new JLabel("");
	private JLabel SecondPlayerlabel = new JLabel("");
	static JLabel Resultlabel = new JLabel("Result: ");

	Gener First = new Gener();
	Gener Second = new Gener();
	CheckPlayerNum Check = new CheckPlayerNum(First, Second);

	public KostiGUI() {
		super("KostiGUI");
		this.setBounds(800, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.add(FirstPlayerInfolabel);
		container.add(SecondPlayerInfolabel);
		container.add(FirstPlayerlabel);
		container.add(SecondPlayerlabel);
		container.add(Resultlabel);

		Go1_button.addActionListener(new ButtonEventListener());
		container.add(Go1_button);
		Go2_button.addActionListener(new ButtonEventListener2());
		container.add(Go2_button);
		Compare_button.addActionListener(new ButtonEventListener3());
		container.add(Compare_button);

	}

	class ButtonEventListener3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Check.Kontrol();

			/*
			 * if (num1 < num2) { System.out.println("Second player win!");
			 * score[1]++; String result = "Second player win " + "GAME SCORE "
			 * + score[0] + ":" + score[1]; Resultlabel.setText(result);
			 * System.out.println("GAME SCORE " + score[0] + ":" + score[1]); }
			 * 
			 * else if (num1 > num2) { System.out.println("First player win!");
			 * score[0]++; String result = "First player win! " + " GAME SCORE "
			 * + score[0] + ":" + score[1]; Resultlabel.setText(result);
			 * System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			 * 
			 * 
			 * } else { System.out.println("DRAW!"); String result = "DRAW! " +
			 * "GAME SCORE " + score[0] + ":" + score[1];
			 * Resultlabel.setText(result); System.out.println("GAME SCORE " +
			 * score[0] + ":" + score[1]);
			 * 
			 * }
			 * 
			 * return;
			 */

		}
	}

	class ButtonEventListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Second.rand1();
			String text = "" + Second;
			SecondPlayerlabel.setText(text);

		}
	}

	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			First.rand1();
			String text = "" + First;
			FirstPlayerlabel.setText(text);

		}

	}

	public static void main(String[] args) {
		KostiGUI app = new KostiGUI();
		app.setVisible(true);
	}
}