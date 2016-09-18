package praktikum2;

import lib.TextIO;

public class GruppideArv {

	public static void main(String[] args) {
		
		System.out.println("Palun sisesta inimeste arvu.");
		int InimesteArv = TextIO.getlnInt();
        
		System.out.println("Palun sisesta gruppi suurus.");
		int GruppiSuurus = TextIO.getlnInt();

		int GruppideArv = InimesteArv / GruppiSuurus;       
       
        System.out.println("Saab moodustada " + GruppideArv + " gruppi");
        
        int j22k = InimesteArv % GruppideArv;
        
        System.out.println("Üle jääb  " + j22k + " inimest");
	}

}
