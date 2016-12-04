package kodutoo;

import java.util.Random;


public class Kostjan {

	static int[] score = new int[2];
		
	public static void main(String[] args) {
		
		int gamearv = 10;
		
			for (int i = 0; i < gamearv; i++) {
				System.out.println("LET'S BEGIN!");
				Random rand = new Random();
				int num1 = rand.nextInt(7) + 1;
				System.out.println("The numbers of 1-st player:" + num1);
				Random rand2 = new Random();
				int num2 = rand2.nextInt(7) + 1;
				System.out.println("The numbers of 2-nd player:" + num2);
				
				Kontrol(num1, num2);
				
			}
		}	

	public static void Kontrol(int num1, int num2) {


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
