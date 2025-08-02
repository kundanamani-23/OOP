/*Accept two integers and apply all bitwise operations (&, |, ^, <<, >>), then display the results in 
 both binary and decimal formats.*/

package mypackage;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		System.out.print("Enter any two integers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Decimal value of a & b = " + (a & b) + " and Binary value of a & b = " + Integer.toBinaryString(a & b));
        System.out.println("Decimal value of a | b = " + (a | b) + " and Binary value of a | b = " + Integer.toBinaryString(a | b));
        System.out.println("Decimal value of a ^ b = " + (a ^ b) + " and Binary value of a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("Decimal value of a << 1 = " + (a << 1) + " and Binary value of a << b = " + Integer.toBinaryString(a << 1));
        System.out.println("Decimal value of b >> 1 = " + (b >> 1) + " and Binary value of a >> b = " + Integer.toBinaryString(b >> 1));
        
        input.close();
	}
}
