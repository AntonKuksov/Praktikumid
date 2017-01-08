package praktikum15;


public class Answer {

   public static void main (String[] args) {
      int[] res = veeruMinid (new int[][] { {1,2,6}, {4,5,3} }); // {1, 2, 3}
     for (int i = 0; i < res.length; i++) {
		System.out.print(res[i] + "");
	}
   }

   public static int[] veeruMinid (int[][] m) {

		int columns = 0;
		for (int i = 0; i < m.length; i++) {
			if (columns < m[i].length) {
				columns = m[i].length;
			}
		} 
		
		int[] ret = new int[columns];
		int min = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				min = m[0][j];
				System.out.println("min " + min);
				System.out.println("m[i][j] " + m[i][j]);
				if (min >= m[i][j]) {
					min = m[i][j];
					ret[j] = min;
				}
			}
		} // for
		
		return ret;
   }

}

