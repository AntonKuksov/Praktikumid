package kodutoo;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;


public class KostiGUI extends JFrame {
	private JButton Go1_button = new JButton("GO FIRST!");
	private JButton Go2_button = new JButton("GO SECOND!");
	private JButton Compare_button = new JButton("Compare");

	private JLabel FirtPlayerlabel = new JLabel("FirtPlayer: ");
	private JLabel SecondPlayerlabel = new JLabel("SecondPlayer: ");
	private JLabel Resultlabel = new JLabel("Result: ");
	
	static int[] score = new int[2];
	static int num1;
	static int num2;
	
	

	
	public KostiGUI() {
	    super("KostiGUI");
	    this.setBounds(800,100,500,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,2,2,2));
	    container.add(FirtPlayerlabel);
	    container.add(SecondPlayerlabel);
//	    container.add(Resultlabel);



	    Go1_button.addActionListener(new ButtonEventListener());
	    container.add(Go1_button);
	    Go2_button.addActionListener(new ButtonEventListener2());
	    container.add(Go2_button);
	    Compare_button.addActionListener(new ButtonEventListener3());
	    container.add(Compare_button);
	    
	}
	class ButtonEventListener3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			


				if (num1 < num2) {
					System.out.println("Second player win!");
					score[1]++;
					System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
				}

				else if (num1 > num2) {
					System.out.println("First player win!");
					score[0]++;
					System.out.println("GAME SCORE " + score[0] + ":" + score[1]);


				} else {
					System.out.println("DRAW!");
					System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
					
				}

				return;
			
			
		}
	}
	
	class ButtonEventListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Random rand2 = new Random();
			num2 = rand2.nextInt(7) + 1;
			String text = "The numbers of 2-st player: " + num2;
			SecondPlayerlabel.setText(text);
			System.out.println("The numbers of 2-st player:" + num2);
			
		}
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			Random rand = new Random();
			num1 = rand.nextInt(7) + 1;
			String text = "The numbers of 1-st player: " + num1;
			FirtPlayerlabel.setText(text);
			System.out.println("The numbers of 1-st player:" + num1);
			
		}
	}

	public static void main(String[] args) {
		KostiGUI app = new KostiGUI();
		app.setVisible(true);
	}
}