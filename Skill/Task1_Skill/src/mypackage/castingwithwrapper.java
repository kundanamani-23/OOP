package mypackage;

public class castingwithwrapper {

	public static void main(String[] args) {
		Double x = 123.456; 

        //Casting Double -> int, byte, and float using wrapper methods
        int a = x.intValue();
        byte b = x.byteValue();
        float c = x.floatValue();

        System.out.println("Original Double: " + x);
        System.out.println("Casted to int: " + a);
        System.out.println("Casted to byte: " + b);
        System.out.println("Casted to float: " + c);

	}

}
