package praktikum15;


public class Katsetused {

	public static void main(String[] args) {
		
		String tekst = new String("Tere");
		
		Punkt p1 = new Punkt(1, 1);
		Punkt p2 = new Punkt(3, 3);
		
		Joon j1 = new Joon(p1, p2);
		
		Ring r1 = new Ring(p1, j1);
		
		Silinder si1 = new Silinder(r1, 3);
//		
//		System.out.println(p1);
//		System.out.println(j1);
//		System.out.println(j1.pikkus());
//		
//		System.out.println(r1);
//		System.out.println(r1.umber());
//		System.out.println(r1.pindala());

		System.out.println(si1);
		System.out.println(si1.pindala());
		System.out.println(si1.ruumala());
	}

}
