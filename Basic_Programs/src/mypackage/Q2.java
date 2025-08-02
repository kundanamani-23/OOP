/*Accept a student’s details like name, roll number, age, gender, and percentage. Display them using
  formatted output.*/

package mypackage;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("Enter your roll number: ");
		long roll = input.nextInt();
		System.out.print("Enter your age: ");
		long age = input.nextLong();
		System.out.print("Enter your gender (M/F): ");
		char gender = input.next().charAt(0);
		System.out.print("Enter your percentage: ");
		float percent = input.nextFloat();
		
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+roll);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Percentage: "+percent);
		
		input.close();
	}

}
