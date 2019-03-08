package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class whatisinparenthesis {

	static Scanner scn = new Scanner(System.in);
	
		
		public static void main(String[] args) {
		
			
			Scanner scn = new Scanner(System.in);
			String s = scn.nextLine();
			int c = 0;
			int q = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(')
					c = i;
				if (s.charAt(i) == ')')
					q = i;
			}
			for (int j = c + 1; j < q; j++) {
				System.out.print(s.charAt(j));
			}

		}
	}
