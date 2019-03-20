package assignments;

import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner = new Scanner(System.in);
		String s = Scanner.next();
		char x[] = new char[20], y;
		x = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				if (x[i] == '9')
					continue;
			}
			y = (char) changeDigit(x[i]);
			if (x[i] > y)
				x[i] = y;
		}
		System.out.println(x);
	}

	public static int changeDigit(char t) {
		return '9' - t + 48;
	}

}
