package praktikum8;

import lib.TextIO;

public class VastupidiArv {

	public static void main(String[] args) {
		
//		int[] arvud = new int[3]; //
//		arvud[0] = 123;
//		arvud[1] = 234;
//		arvud[2] = 4455;
//		
//		int[] arvud = {11, 22, 11};
//		for (int i = 0; i < arvud.length; i++) {	
//			System.out.println(arvud[i]);	}
		
	int[] arvud = new int[5];
	
	
	for (int i = 0; i < arvud.length; i++) {
		
		System.out.print("Pane numbri siin: ");
		arvud[i] = TextIO.getlnInt();
	}
	
	int[] arvudTagurpidi = tagurpidi(arvud);
	
	for (int i = 0; i < arvudTagurpidi.length; i++) {
		System.out.println(arvudTagurpidi[i]);
	}

//	for (int i = arvud.length - 1; i > 0; i--) {
//		System.out.print(arvud[i]);
//	}
	
	}
	
	public static int[] tagurpidi(int[] numbrid) {
		int[] tagurpidi = new int[numbrid.length];
		for (int i = 0; i < tagurpidi.length; i++) {
			int indeks = numbrid.length - 1 - i;
			tagurpidi[i] = numbrid[indeks];
		}
		return tagurpidi;
	}
}
