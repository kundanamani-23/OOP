package mypackage;

public class Array_1D {

	public static void main(String[] args) {
		int sum=0;
		int[] numbers = {10,20,30,40,50};
		
		System.out.print("Numbers in the array: ");
		for (int i=0;i<5;i++)
			System.out.print(numbers[i]+" ");
		
		System.out.println(" ");
		for (int i=0;i<5;i++)
			sum=sum+numbers[i];
		
		System.out.println("Sum = "+sum);

	}

}
