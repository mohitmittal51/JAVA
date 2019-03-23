package crux27may2018;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter n");
		int n = scn.nextInt();
		int nr = 2 * n - 1;
		int nsp = n - 1;
		int nst = n;
		int row = 1;
		while (row <= nr) {
			int csp = 1; // fs
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			if (row < n) {
				nst = nst - 1;
				nsp = nsp - 1;
			}

			else {
				nst = nst + 1;
				nsp = nsp + 1;
			}
			System.out.println();
			row = row + 1;
		}
	}
}
