package mypackage;

public class StringHandling {

	public static void main(String[] args) {
		String str = "Object Oriented Programming";
		System.out.println("Original String: "+str);
		System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Contains 'Programming': " + str.contains("Programming"));
        System.out.println("Index of 'Oriented': " + str.indexOf("Oriented"));

        String[] words = str.split(" ");
        System.out.print("Words: ");
        for (String word : words) {
            System.out.print(word+", ");
        }

	}

}
