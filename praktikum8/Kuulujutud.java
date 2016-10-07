package praktikum8;



public class Kuulujutud {

	public static void main(String[] args) {
		String[] meheNimed = {"Kalle", "Juku", "Peeter"};
		String[] naiseNimed = {"Jaana", "Kristi", "Kati"};
		String[] tegusonad = {"laulavad", "jooksevad", "kalutavad"};
		
		String mees = suvalineElement(meheNimed);
		String naine = suvalineElement(naiseNimed);
		String tegevus = suvalineElement(tegusonad);
		
		System.out.format("%s ja %s %s.", mees, naine, tegevus);
	}
	
	public static int suvalineArv(int min, int max) {
		int vahemik = max - min + 1;
		return min + (int) (Math.random() * vahemik);
	}
	
	public static String suvalineElement(String[] s6nad) {
		
		return s6nad[suvalineArv(0, s6nad.length - 1)];
		
	}

}
