package mypackage;

public class wrappertypecon {

	public static void main(String[] args) {
		int a = 23;
		Integer b = a; //Boxing
		double c = b; //Auto-Unboxing, Integer -> double
		long d = b; //Auto-unboxing, Integer -> long
		
		System.out.println("Primitive int: " + a);
        System.out.println("Boxed Integer: " + b);
        System.out.println("Converted to double: " + c);
        System.out.println("Converted to long: " + d);
	}
}
