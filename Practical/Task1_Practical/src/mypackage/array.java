package mypackage;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		int num[] = new int[n];
		System.out.print("Enter the numbers: ");
		for (int i=0;i<n;i++)
			num[i]=input.nextInt();
		
		int sum=0;
		for (int j=0;j<n;j++)
			sum=sum+num[j];
		
		System.out.print(sum);
		
		input.close();
	}

}
