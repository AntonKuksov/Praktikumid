package praktikum15;

public class Joon {
	Punkt algus, l6pp;

	public Joon(Punkt p1, Punkt p2) {
		
		algus = p1;
		l6pp = p2;
		
	}
	
	public double pikkus() {
		return Math.sqrt(Math.pow((algus.x-l6pp.x), 2) + Math.pow((algus.y-l6pp.y), 2));
	}
	
	@Override
	public String toString() {
		return "Joon(" + algus + ", " + l6pp + ")";
	}


}
