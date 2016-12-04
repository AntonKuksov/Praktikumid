package praktikum7;

import java.util.Random;

import lib.TextIO;

public class GuessNum {

	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(5) + 1;

		while (true) {

			System.out.println("Try!!");
			int guess = TextIO.getlnInt();
			Kontroll(num1, guess);
			if (num1 == guess) {
				break;
			}
		}
	}

	public static void Kontroll(int num1, int guess) {

		if (num1 == guess) {
			System.out.println("You Win!");
		}

		else if (num1 > guess) {
			System.out.println("It's small. Close enough");

		} else {
			System.out.println("It's big. Try again");
		}

		return;
	}

}
