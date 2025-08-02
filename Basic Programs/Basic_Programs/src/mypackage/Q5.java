/*Accept a character from the user and display its ASCII value. Also convert that ASCII value into 
 an integer.*/

package mypackage;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		int ascii = ch;
		
		System.out.println("Character value: "+" and it's ascii value: "+ascii);
		
		input.close();
	}

}
