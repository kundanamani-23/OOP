/*Write a program to demonstrate narrowing type conversion from double to int. Accept a double input and 
 cast it to int. Print both values.*/

package mypackage;

public class Q4 {

	public static void main(String[] args) {
		double a = 100.85;
		int b = (int)a;
		
		System.out.println("double: "+a);
		System.out.println("int: "+b);
	}
}
