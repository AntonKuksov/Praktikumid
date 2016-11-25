package praktikum15;

public class Ring {
	
	Punkt keskpunkt;
	Joon raadius;

	public Ring(Punkt o, Joon r) {
		
		keskpunkt = o;
		raadius = r;
		
	}
	
	public double umber() {
		return 2 * Math.PI * raadius.pikkus();
	}
	
	public double pindala() {
		return Math.PI * Math.pow(raadius.pikkus(), 2);
	}
	
	@Override
	public String toString() {
		return "Ring(" + keskpunkt + ", " + raadius + ")";
	}


}
