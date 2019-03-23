package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class max_freq_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 String str = scn.nextLine();
		 maxFreqChar(str);
	
	}
	
	public static void maxFreqChar(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				int of = map.get(ch);
				int nf = of + 1;
				map.put(ch, nf);
			} else {
				map.put(ch, 1);
			}
		}
		ArrayList<Character> list = new ArrayList<>(map.keySet());

		int maxfreq = 0;
		char maxchar = ' ';

		for (Character ch : list) {

			int pfreq = map.get(ch);
			if (pfreq > maxfreq) {
				maxfreq = pfreq;
				maxchar = ch;
			}
		}


		System.out.println(maxchar);

}
}