package HelloWorld;

import java.util.Scanner;

// Example 2.2.6 The second-degree equation 
public class TheSecondDegree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a: ");
		double a = input.nextDouble();
		while(a == 0) {
			a = input.nextDouble();
		};
		
		System.out.println("Input b: ");
		double b = input.nextDouble();
		
		System.out.println("Input c: ");
		double c = input.nextDouble();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		if (delta < 0) {
			System.out.println("The equation has no solution");
		}
		else if(delta == 0) {
			double output = -b/(2*a);
			System.out.println("Output x1 = x2 = " + output);
		}
		else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Output x1 = " + x1 + ", x2 = " + x2);
		}
		
		input.close();
	}
}
