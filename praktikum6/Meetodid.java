package praktikum6;


import lib.TextIO;

public class Meetodid {
	
	
	/*public static int kasutajaSisestus(int min, int max) {
		System.out.println("Siseta arv " + min + " kuni " + max);
		int sissetus = TextIO.getlnInt();	
		return sissetus;
	}
	*/

	public static void main(String[] args) {
		
	/*	int kasutajaSisestusArv = kasutajaSisestus(0, 10);
		System.out.println("Kasutaja sisestas " + kasutajaSisestusArv);
	*/
		System.out.println("Tere! Sisseta arv");
		int arv = TextIO.getlnInt();	
		int vastus = ruut(arv);
		System.out.println("Arv ruudus on " + vastus);
		int vastus2 = kuup(arv);
		System.out.println("Arv kuup on " + vastus2);
	}
	public static int ruut(int i) {
		return i*i;
		
	}
	public static int kuup(int i) {
		return (int) Math.pow(i, 3);
		
	}
	

		
	

}
