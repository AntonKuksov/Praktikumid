package kodutoo;

public class CheckPlayerNum {

	int[] score = new int[2];

	Gener num1;
	Gener num2;

	public CheckPlayerNum(Gener first, Gener second) {

		num1 = first;
		num2 = second;

	}

	public String Kontrol() {

		if (num1.sum < num2.sum) {
			System.out.println("Second player wins!");
			score[1]++;
			String result = RollDiceGUI.Second.player + " wins!";
			KostiGUI.Resultlabel.setText(result);
			System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			return result;
		}

		else if (num1.sum > num2.sum) {
			System.out.println("First player wins!");
			score[0]++;
			String result = RollDiceGUI.First.player + " wins!";
			KostiGUI.Resultlabel.setText(result);
			System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			return result;

		} else {

			String result = "DRAW!";
			KostiGUI.Resultlabel.setText(result);
			System.out.println("DRAW!");
			System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			return result;

		}

	}

	public String Score() {

		String arv = score[0] + ":" + score[1];
		return arv;

	}

}
