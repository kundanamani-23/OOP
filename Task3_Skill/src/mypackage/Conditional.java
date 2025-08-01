package mypackage;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if (number>0)
			System.out.println(number+" is positive");
		
		else if (number<0)
			System.out.println(number+" is negative");
		
		else
			System.out.println("Zero");
		
		System.out.print("Enter your grade: ");
		char grade = input.next().charAt(0);
		
		switch (grade) {
		case 'A': System.out.println("Excellent");
		break;
		
		case 'B': System.out.println("Good");
		break;
		
		case 'C': System.out.println("Average");
		break;
		
		default: System.out.println("Fail");
		break;
		}
		
		input.close();
	}

}
