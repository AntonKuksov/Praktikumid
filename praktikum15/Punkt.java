package praktikum15;

public class Punkt extends Object {	
	
	int x, y;

	public Punkt(int x, int y){
	
	this.x = x;
	this.y =y;
	}
	
	@Override
	public String toString() {
		return "Punkt(" + x + ", " + y + ")";
	}
}
