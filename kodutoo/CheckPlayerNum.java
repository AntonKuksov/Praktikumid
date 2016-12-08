package kodutoo;



public class CheckPlayerNum {
	
	 int[] score = new int[2];

	Gener num1;
	Gener2 num2;
	
	public CheckPlayerNum(Gener first, Gener2 second) {

		num1 = first;
		num2 = second;

	}
	
	public String Kontrol() {


		if (num1.sum < num2.sum) {
			System.out.println("Second player win!");
			score[1]++;
			String result = "Second player win!"; /* + "GAME SCORE " + score[0] + ":" + score[1];*/
			KostiGUI.Resultlabel.setText(result);
			System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			return result;
		}

		else if (num1.sum > num2.sum) {
			System.out.println("First player win!");
			score[0]++;
			String result = "First player win!"; /* + "GAME SCORE " + score[0] + ":" + score[1];*/
			KostiGUI.Resultlabel.setText(result);
			System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			return result;

		} else {
			
			String result = "DRAW!"; /* + "GAME SCORE " + score[0] + ":" + score[1];*/
			KostiGUI.Resultlabel.setText(result);
			System.out.println("DRAW!");
			System.out.println("GAME SCORE " + score[0] + ":" + score[1]);
			return result;

		}
			
		
	}

	public String Score(){
		
		
	//		System.out.print(arv + " ");
//			String FinalResult = Integer.toString(arv);
//			arv = Integer.parseInt(arv); // No more Exception in this line
			String arv = score[0] + ":" + score[1];
			return arv;
	
	}
	
		 
	

}
