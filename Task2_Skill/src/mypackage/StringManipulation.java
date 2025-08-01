package mypackage;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello World";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (0-5): " + str.substring(0, 5));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("To know whether it starts with HELLO: " + str.startsWith("Hello"));
        System.out.println("Ends with 'ld'? " + str.endsWith("ld"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
	}

}
