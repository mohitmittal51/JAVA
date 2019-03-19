package assignments;

import java.util.Scanner;

public class spiralprint_clockwise {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] array = takeinput(r,c);
		
		
		spiralPrint(r,c, array);
		System.out.println("END");
	}

	public static int[][] takeinput(int r, int c) {

		
		int[][] arr = new int[r][c];

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[0].length; col++) {

				arr[row][col] = scn.nextInt();

			}
		}
		return arr;

	}

	static void spiralPrint(int m, int n, int[][] arr)
		    {
		        int i, k = 0, l = 0;
		        /*  k - starting row index
		        m - ending row index
		        l - starting column index
		        n - ending column index
		        i - iterator
		        */
		          
		        while (k < m && l < n)
		        {
		            // Print the first row from the remaining rows
		            for (i = l; i < n; ++i)
		            {
		                System.out.print(arr[k][i]+", ");
		            }
		            k++;
		  
		            // Print the last column from the remaining columns 
		            for (i = k; i < m; ++i)
		            {
		                System.out.print(arr[i][n-1]+", ");
		            }
		            n--;
		  
		            // Print the last row from the remaining rows */
		            if ( k < m)
		            {
		                for (i = n-1; i >= l; --i)
		                {
		                    System.out.print(arr[m-1][i]+", ");
		                }
		                m--;
		            }
		  
		            // Print the first column from the remaining columns */
		            if (l < n)
		            {
		                for (i = m-1; i >= k; --i)
		                {
		                    System.out.print(arr[i][l]+", ");
		                }
		                l++;    
		            }        
		        
		        }
		    
		    
		    }}
