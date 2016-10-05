package praktikum2;

import lib.TextIO;

/**Kirjutada programm, mis küsib kasutajalt kaks arvu ja väljastab nende korrutise. */

public class ArvedKorrutis {

	public static void main(String[] args) {
		
		System.out.println("Palun sisesta kaks arvu!!!!");
		System.out.println("Arvude korrutis on: " + TextIO.getlnInt() * TextIO.getlnInt());
		
/*		int arv1;
		int arv2;
		int korrutis;
		
		System.out.println("Palun sisesta kaks arvu.");
		
        arv1 = TextIO.getlnInt();
        arv2 = TextIO.getlnInt();

        korrutis = arv1 * arv2;       // Korrutamine
       

        System.out.print("arv1 * arv2 = ");
        System.out.println(korrutis);
*/
	}

}
