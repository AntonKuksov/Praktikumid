package praktikum9;


import java.util.ArrayList;

import lib.TextIO;

public class KummeSona {

	public static void main(String[] args) {

		// String[] sonad = new String[10];
		ArrayList<String> sonadlist = new ArrayList<String>();
		String word = null;
		System.out.println("Print 10 words in list: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("\t" + (i+1)  + ". ");
			word = TextIO.getlnString();
			sonadlist.add(word);
		}
		
		//System.out.println(sonadlist.size());
		for (int t = 0; t < sonadlist.size(); t++) {
			System.out.println((sonadlist.get(t)).length() + " " + sonadlist.get(t));
		}
	}

}
