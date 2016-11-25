package praktikum14;

import java.util.ArrayList;

public class NumbriteKeskmine {

	public static void main(String[] args) {
		
		// 1. lugeda sisse faili sisu (ArrayList<String>) <-- meetod olemas
		ArrayList<String> failiSisu = FailiLugeja.loeFail("numbrid.txt");
		System.out.println(failiSisu);
		
		// 2. ArrayList<String> -> ArrayList<Double> <-- teha meetod!
		ArrayList<Double> numbrid = teeNumbriteks(failiSisu);
		System.out.println(numbrid);
		
		// 3. ArrayList<Double> -> keskmine <-- teha meetod!
		double keskmine = arvutaKeskmine(numbrid);
		System.out.println("Arvude keskmine on: " + keskmine);

	}

	private static double arvutaKeskmine(ArrayList<Double> numbrid) {
		double summa = 0;
		for (Double number : numbrid) {
			summa += number;
		}
		return summa / numbrid.size();
	}

	private static ArrayList<Double> teeNumbriteks(ArrayList<String> read) {
		ArrayList<Double> numbrid = new ArrayList<Double>();
		for (String rida : read) {		
			try {
				double nr = Double.parseDouble(rida);
				numbrid.add(nr);
			} catch (NumberFormatException e) {
				System.out.println("Ei oska teha numbriks: " + rida);
			}
		}
		return numbrid;
	}

}