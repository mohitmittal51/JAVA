package assignments;

import java.util.Scanner;

public class generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		char[] str = new char[6];
//		_printParenthesis(str,0,n,0,0);
		printParenthesis(str, n);
	}

	static void printParenthesis(char str[], int n) {
		if (n > 0)
			_printParenthesis(str, 0, n, 0, 0);
		return;
	}

	// Function that print all combinations of 
    // balanced parentheses
    // open store the count of opening parenthesis
    // close store the count of closing parenthesis
	static void _printParenthesis(char str[], int pos, int n, int open, int close) {
		if (close == n) {
			// print the possible combinations
			for (int i = 0; i < str.length; i++)
				System.out.print(str[i]);
			System.out.println();
			return;
		} else {
			if (open > close) {
				str[pos] = ')';
				_printParenthesis(str, pos + 1, n, open, close + 1);
			}
			if (open < n) {
				str[pos] = '(';
				_printParenthesis(str, pos + 1, n, open + 1, close);
			}
		}
	}

}
