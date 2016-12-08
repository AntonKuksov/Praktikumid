package kodutoo;

import java.util.Random;

public class Gener2 extends Object{
	
	int x, y;
	int sum;
	
//	public Gener2 (){
//
//	}

	public void rand3 (){
		
		System.out.println("LET'S BEGIN!");
		Random rand2 = new Random();
		x = rand2.nextInt(6) + 1;
		Random rand22 = new Random();
		y = rand22.nextInt(6) + 1;
		sum = x + y;
		System.out.println("The numbers of 2-nd player: " + x + " " + y);
		System.out.println("Sum of 2-nd player's number: " + sum);	
	
	} 
	
	public void rand4 (){
//		
//		System.out.println("LET'S BEGIN!");
//		Random rand22 = new Random();
//		y = rand22.nextInt(6) + 1;
//		sum = x + y;
//		System.out.println("The numbers of 2-nd player: " + x + " " + y);
//		System.out.println("Sum of 2-nd player's number: " + sum);	
	} 
	
	@Override
	public String toString() {
		
		return "" + y;
	}
}
