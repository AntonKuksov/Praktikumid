package praktikum13;

public class Massiivid {

	public static void main(String[] args) {
		
		int[] arvud = {3, 4, 5, -3, 2};
		
		int [][] neo = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};

	//	tryki(arvud);
	//	tryki(neo);
		tryki(ridadeSummad(neo));
	//	System.out.println(peaDiagonaaliSumma(neo));
	//	System.out.println(peaDiagonaaliSummaEfektiivsemalt(neo));
	//	System.out.println(korvalDiagonaaliSummaEfektiivsemalt(neo));
	//	tryki(ridadeMaksimumid(neo));
	}
	
	/*
	 * Kirjutada meetod, mis trükib ekraanile ühel real parameetrina etteantud ühemõõtmelise täisarvumassiivi elemendid
	 */
	
	public static void tryki(int[] massiiv) {

		for (int i = 0; i < massiiv.length; i++) {
			System.out.print(massiiv[i] + " ");
		}
		for (int arv : massiiv) {
			System.out.print(arv + " ");
		}

		System.out.println();
	}
	
	/*
	 * Kirjutada meetod, mis trükib ekraanile parameetrina etteantud kahemõõtmelise massiivi (maatriksi)
	 */
	public static void tryki(int[][] maatriks){
		
		for (int [] rida : maatriks) {
			tryki(rida);
			}	
	}
	
	/*Arvutada maatriksi iga rea elementide summa*/
	
	public static int[] ridadeSummad(int[][] maatriks){
		int[] summad = new int[maatriks.length];
		
		for (int i = 0; i < maatriks.length; i++) {
			summad[i] = reaSumma(maatriks[i]);
		}
		
		return summad;
	}
	
	public static int reaSumma(int[] massiiv){
		int summa = 0;
		for (int arv : massiiv) {
			summa += arv;
			}	
		return summa;
	}
	
	/*Arvutada kõrvaldiagonaali elementide summa (kõrvaldiagonaal on see, mis jookseb ülevalt paremast nurgast alla vasakusse nurka).*/
	
	public static int peaDiagonaaliSumma(int[][] maatriks){
	int summa = 0;
	for (int i = 0; i < maatriks.length; i++) {
		for (int j = 0; j < maatriks[i].length; j++) {
			if (i == j){
				summa += maatriks[i][j];
			}
		//	System.out.print(maatriks[i][j]);
		}
	//	System.out.println();
	}
	return summa;
	}
	
	public static int peaDiagonaaliSummaEfektiivsemalt(int[][] maatriks){
		int summa = 0;
		for (int i = 0; i < maatriks.length; i++) {
			summa += maatriks[i][i];
		}
		return summa;
		}
	
	public static int korvalDiagonaaliSummaEfektiivsemalt(int[][] maatriks){
		int summa = 0;
		for (int i = 0; i < maatriks.length; i++) {
			summa += maatriks[i][maatriks[i].length - i - 1];
		}
		return summa;
		}
	
	/*
	 * Leida iga rea suurim element
	 */
	public static int[] ridadeMaksimumid(int[][] maatriks) {
		int[] maksimumid = new int[maatriks.length];
		for (int i = 0; i < maksimumid.length; i++) {
			maksimumid[i] = reaMaksimum(maatriks[i]);
		}
		return maksimumid;
	}
	
	public static int reaMaksimum(int[] massiiv) {
		int maksimum = Integer.MIN_VALUE;
		for (int arv : massiiv) {
			if (arv > maksimum) {
				maksimum = arv;
			}
		}
		return maksimum;
	}

}
