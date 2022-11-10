package HelloWorld;

import java.util.Scanner;

// Example 2.2.6 The system of first-degree equations 
public class TheSystemOfFirstDegree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a11: ");
		double a11 = input.nextDouble();
		
		System.out.println("Input a12: ");
		double a12 = input.nextDouble();
		
		System.out.println("Input b1: ");
		double b1 = input.nextDouble();
		
		System.out.println("Input a21: ");
		double a21 = input.nextDouble();
		
		System.out.println("Input a22: ");
		double a22 = input.nextDouble();
		
		System.out.println("Input b2: ");
		double b2 = input.nextDouble();
		
		double D = a11*a22 - a21*a12;
		double D1 = b1*a22 - b2*a12;
		double D2 = a11*b2 - a21*b1;
		
		if(D != 0) {
			double x1 = D1/D;
			double x2 = D2/D;
			
			System.out.println("Output x1 = " + x1);
			System.out.println("Output x2 = " + x2);
		}
		else {
			if(D1 == 0 || D2 == 0) {
				System.out.println("The equation has no solution");
			}
			else {
				System.out.println("Equation with infinite solutions");
			}
		}			
		input.close();
	}
}
