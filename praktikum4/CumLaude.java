package praktikum4;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {

		System.out.println("Palun sisesta lõputöö hinne");
		int l6putoo = TextIO.getlnInt();
		if (l6putoo < 0 || l6putoo > 5) {
			System.out.println("Vigane sisetus!");
			return; // väljuba meetodist
		}
		
		System.out.println("Palun sisesta keskmine hinne");
		double keskmine = TextIO.getlnDouble();
		if (keskmine < 0 || keskmine > 5) {
			System.out.println("Vigane sisetus!");
			return; // väljuba meetodist
		}

		// ! - eitus
		// == - võrdlemine
		// && - loogiline JA
		// || - loogiline VÕI

		if (keskmine > 4.5 && l6putoo == 5) {
			System.out.println("Saad Cum Laude!");
		} else {
			System.out.println("Ei saa Cum Laudet!");
		}

	}

}