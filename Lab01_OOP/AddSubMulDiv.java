package HelloWorld;

import javax.swing.JOptionPane;

// Example 2.2.5 Add Sub Mul Div Two Numbers
public class AddSubMulDiv {
	public static void main(String[] args) {
		String strNum1, strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		String AddSubMulDiv_TwoNumber = "Add Two Number: ";
		AddSubMulDiv_TwoNumber += (num1 + num2);
		AddSubMulDiv_TwoNumber += "\nSub Two Number:" + (num1 - num2);
		AddSubMulDiv_TwoNumber += "\nMul Two Number:" + (num1 * num2);
		AddSubMulDiv_TwoNumber += "\nDiv Two Number:" + (num1 / num2);
		JOptionPane.showMessageDialog(null, AddSubMulDiv_TwoNumber, 
				"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
