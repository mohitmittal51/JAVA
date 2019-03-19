package assignments;

import java.util.Scanner;

public class count_AAA {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();

		int count = 0, count1 = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'a') {

				count++;

			}

		}

		System.out.println(count);


	}
}