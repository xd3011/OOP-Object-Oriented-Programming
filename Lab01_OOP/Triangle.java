package Exercises;

import java.util.Scanner;

// Example 6.3 Triangle
public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input n:");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) { 
	        for(int j = i; j < n; j++) {
	            System.out.print(" ");
	        }
	        for(int j = 1; j <= (2*i-1); j++) {
	        	System.out.print("*");
	        }
	        System.out.println();
	    }	
		input.close();
	}
}
