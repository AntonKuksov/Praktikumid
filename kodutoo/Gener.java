package kodutoo;

import java.util.Random;

public class Gener extends Object{
	
	int x, y;
	int sum;
	
	
//	public Gener (){
//
//	}

	public void rand1 (){
		
		System.out.println("LET'S BEGIN!");
		Random rand1 = new Random();
		x = rand1.nextInt(6) + 1;
//	    System.out.println("The numbers of 1-st player:" + x);
		Random rand12 = new Random();
		y = rand12.nextInt(6) + 1;
		sum = x + y;
		System.out.println("The numbers of 1-nd player: " + x + " " + y);
		System.out.println("Sum of 1-nd player's number: " + sum);
	
	} 
	
	public void rand2 (){
		
//		System.out.println("LET'S BEGIN!");
//		Random rand1 = new Random();
//		x = rand1.nextInt(6) + 1;
//	    System.out.println("The numbers of 1-st player:" + x);
//		Random rand12 = new Random();
//		y = rand12.nextInt(6) + 1;
//		sum = x + y;
//		System.out.println("The numbers of 1-nd player: " + x + " " + y);
//		System.out.println("Sum of 1-nd player's number: " + sum);
	
	} 

	@Override
	public String toString() {
		
		return "" + x;
	}
}
