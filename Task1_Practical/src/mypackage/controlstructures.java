package mypackage;

import java.util.Scanner;

public class controlstructures {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a & b: ");
		int a=input.nextInt();
		int b=input.nextInt();
		
		if (a>b) //if-else statements
			System.out.println("a is greater than b");
		
		else if (b>a)
			System.out.println("b is greater than a");
		
		else
			System.out.println("Both are equal");
		
		System.out.print("\nEnter your age: ");
		int age=input.nextInt();
		String result= (age>=18) ? "Can vote" : "Cannot vote"; //Ternary operator
		System.out.println(result);
		
		input.close();
	}

}
