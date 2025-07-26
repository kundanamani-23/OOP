package mypackage;

import java.util.Scanner;

public class typeconversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the price of the item: ");
		double price = input.nextFloat();
		double tax = 8.35;
		int total = (int)price+(int)tax; //Explicit casting
		long final_price=total; //Implicit casting
		System.out.println("Total price = "+final_price);
		input.close();
	}

}
