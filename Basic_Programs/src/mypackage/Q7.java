/*Accept three numbers and calculate the average using a single expression. Analyze how precedence affects
 the result.*/

package mypackage;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 values: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int avg = (a+b+c)/3;
		
		System.out.println("Average value = "+avg);
		
		input.close();
	}
}

