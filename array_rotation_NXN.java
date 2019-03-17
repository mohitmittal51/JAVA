package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class array_rotation_NXN {

	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		int arr[][] = takeInput();
		display(arr);

	}

	public static int[][] takeInput() {
		System.out.println("size ?");
		int rows = scn.nextInt();
		int cols = rows;
		int[][] arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {
			arr[row] = new int[cols];
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("[" + row + "," + col + "]");
				arr[row][col] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int j = arr[0].length - 1; j >= 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}

}
