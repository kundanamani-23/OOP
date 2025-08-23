package mypackage;

import java.util.Scanner;

class Coffee {
	int price;
	String size;
	
	Coffee(String size) {
		this.size = size;
		
		if (size.equalsIgnoreCase("Small"))
			price = 50;
		
		else if (size.equalsIgnoreCase("Medium"))
			price = 70;
		
		else if (size.equalsIgnoreCase("Large"))
			price = 90;
		
		else
			System.out.println("Invalid input");
	}
	
	void display() {
		System.out.println("Coffee Size: "+size);
		System.out.println("Coffee Price: "+price);
	}
}

public class CoffeeOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the coffee: ");
		String size = input.nextLine();
		
		Coffee c1 = new Coffee(size);
		c1.display();
		
		input.close();

	}

}
