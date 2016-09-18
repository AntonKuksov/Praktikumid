package praktikum4;

import lib.TextIO;

public class Tehisintellekt {

	public static void main(String[] args) {
		
				System.out.println("Palun sisesta esimene vanus");
				int vanus1 = TextIO.getlnInt();
				System.out.println("Palun sisesta teine vanus");
				int vanus2 = TextIO.getlnInt();
				
				int vanuseVahe = Math.abs(vanus1 - vanus2);
				
				if (vanuseVahe > 10){
					System.out.println("Midagi krõbedat");
				} else if (vanuseVahe > 5){
					System.out.println("No ikka ei sobi");
				} else {
					System.out.println("Sobib!");
				}
				
	}
}
	
