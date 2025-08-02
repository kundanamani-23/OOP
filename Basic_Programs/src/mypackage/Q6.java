/* Evaluate and print the result of the following expressions:
10 + 2 * 5
(10 + 2) * 5
100 / 5 + 2 * 3 - 4
Explain the results based on operator precedence and associativity.*/

package mypackage;

public class Q6 {

	public static void main(String[] args) {
		int a = 10 + 2 * 5; //2*5=10, 10+10=20
		int b = (10 + 2) * 5; //(10+2)=12, 12*5=60
		int c = 100 / 5 + 2 * 3 - 4; //20 + 6 - 4 = 22
		
		System.out.println("10 + 2 * 5 = " + a);
        System.out.println("(10 + 2) * 5 = " + b);
        System.out.println("100 / 5 + 2 * 3 - 4 = " + c);

        // Operator precedence: / * + -
        // Associativity: left to right
	}
}
