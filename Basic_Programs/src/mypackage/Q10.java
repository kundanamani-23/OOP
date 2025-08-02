/*Write a program to check if a number is divisible by 3 AND 5 using logical operators.*/

package mypackage;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		
		if (a%3==0 && a%5==0)
			System.out.println(a+" is divisible by 3 and 5");
		
		else
			System.out.println(a+" is not divisible by 3 and 5");
		
		input.close();
	}

}
