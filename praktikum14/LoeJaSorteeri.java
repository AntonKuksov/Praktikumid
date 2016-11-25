package praktikum14;

import java.util.ArrayList;
import java.util.Collections;
	

public class LoeJaSorteeri {

	public static void main(String[] args) {
		   
		ArrayList<String> failiSisu = FailiLugeja.loeFail("kala.txt");
		System.out.println(failiSisu);
		Collections.sort(failiSisu);
		Collections.reverse(failiSisu);
		System.out.println(failiSisu);	}

}