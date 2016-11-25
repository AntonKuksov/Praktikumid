package praktikum14;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FailiLugeja {
	public static void main(String[] args) {
	    
		
	    loeFail("kala.txt");
	
		}
		public static ArrayList<String> loeFail(String failinimi){
			
		ArrayList<String> read = new ArrayList<String>();
			
		String kataloogitee = FailiLugeja.class.getResource(".").getPath();
	    
	    // otsime samast kataloogist kala.txt-nimelist faili
		File file = new File(kataloogitee + failinimi);
		
		try {
		    // avame faili lugemise jaoks
			BufferedReader in = new BufferedReader(new FileReader(file));
			String rida;

			// loeme failist rida haaval
			while ((rida = in.readLine()) != null) {
				read.add(rida);
			//	System.out.println(rida);
			}
		}
		catch (FileNotFoundException e) {
		    System.out.println("Faili ei leitud: \n" + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error, jee, mingi muu error: " + e.getMessage());
		}
		return read;
	}
}