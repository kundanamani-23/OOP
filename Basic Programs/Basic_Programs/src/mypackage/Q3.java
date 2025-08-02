/*Write a program to demonstrate widening type conversion from int → long → float. Show that no data is 
 lost.*/

package mypackage;

public class Q3 {

	public static void main(String[] args) {
		int a = 100;
		long b = a;
		float c = b;
		
		System.out.println("int: "+a);
		System.out.println("long: "+b);
		System.out.println("float: "+c);
	}

}
