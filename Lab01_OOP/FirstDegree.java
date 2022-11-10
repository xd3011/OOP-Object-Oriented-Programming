package HelloWorld;

import java.util.Scanner;

// Example 2.2.6 The first-degree equation 
public class FirstDegree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a: ");
		double a = input.nextDouble();
		while(a == 0) {
			a = input.nextDouble();
		};
		
		System.out.println("Input b: ");
		double b = input.nextDouble();
		
		double output = -b/a;
		
		System.out.println("Output x = " + output);
		input.close();
	}
}