/*Write a Java program to declare variables of all primitive data types. Initialize them with valid values 
 and print their sizes using appropriate wrappers.*/

package mypackage;

public class Q1 {

	public static void main(String[] args) {
		byte ByteVal=127;
		short ShortVal=32767;
		int IntVal=123456789;
		long LongVal=1234567890L;
		float FloatVal=3.14159265359F;
		double DoubleVal=3.14;
		char CharVal='I';
		
		System.out.println("Example of a Byte Value: "+ByteVal+" and it's size is "+Byte.BYTES);
		System.out.println("Example of a Short Value: "+ShortVal+" and it's size is "+Short.BYTES);
		System.out.println("Example of a Integer Value: "+IntVal+" and it's size is "+Integer.BYTES);
		System.out.println("Example of a Long Value: "+LongVal+" and it's size is "+Long.BYTES);
		System.out.println("Example of a Float Value: "+FloatVal+" and it's size is "+Float.BYTES);
		System.out.println("Example of a Double Value: "+DoubleVal+" and it's size is "+Double.BYTES);
		System.out.println("Example of a Char Value: "+CharVal+" and it's size is "+Character.BYTES);

	}

}
