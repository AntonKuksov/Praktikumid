package praktikum15;

public class Silinder extends Ring {

	double h;
	
	public Silinder(Ring ring, double h) {
		super(ring.keskpunkt, ring.raadius);
		this.h = h;
	}
	
	@Override
	public double pindala() {
		return 2 * super.pindala() + umber() * h;
	}
	
	public double ruumala() {
		return super.pindala() * h;
	}
}
