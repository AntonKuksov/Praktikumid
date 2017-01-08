package praktikum2;

import lib.TextIO;

public class Asendamine {

	public static void main(String[] args) {
		
		
		System.out.println("Palun sisesta text." + TextIO.getlnString());
		System.out.println("Kõik 'a' => '_' :"  + TextIO.getlnString().replace('a', '_'));

	}

}
