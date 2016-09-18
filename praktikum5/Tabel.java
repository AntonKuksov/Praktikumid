package praktikum5;

public class Tabel {

	public static void main(String[] args) 
	{
		int Tabsuur = 7;
		
		for (int i = 0; i < Tabsuur; i++) {
			
			for (int j = 0; j < Tabsuur; j++) {
				
				if (i == j) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
					}
			} 
			
			System.out.println();
		}

	}

}
