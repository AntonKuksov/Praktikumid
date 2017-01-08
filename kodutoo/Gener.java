package kodutoo;

import java.util.Random;

public class Gener extends Object {

	int x, y;
	int sum;
	String player;

	public void rand1() {

		System.out.println("LET'S BEGIN!");
		Random rand1 = new Random();
		x = rand1.nextInt(6) + 1;
		Random rand12 = new Random();
		y = rand12.nextInt(6) + 1;
		sum = x + y;
		System.out.println("The numbers of " + player + ": " + x + " " + y);
		System.out.println("Sum of " + player + " 's numbers: " + sum);

	}

	@Override
	public String toString() {

		return "" + x;
	}
}
