/*Accept two numbers and perform all arithmetic operations (+, -, *, /, %) and print the results.*/

package mypackage;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=input.nextInt();
		System.out.print("Enter b: ");
		int b=input.nextInt();
		int sum=a+b;
		int difference=a-b;
		int product=a*b;
		int quotient=a/b;
		int remainder=a%b;
		
		System.out.println("Sum = "+sum);
		System.out.println("Difference = "+difference);
		System.out.println("Product = "+product);
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
		
		input.close();
	}

}
