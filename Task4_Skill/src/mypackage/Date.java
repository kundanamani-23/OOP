package mypackage;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("Today's date: "+today);
		
		LocalDate dob=LocalDate.of(2006,7,23);
		System.out.println("Birthday: "+dob);
		
		System.out.println("Day: "+today.getDayOfWeek());
		System.out.println("Leap year? : "+today.isLeapYear());
	}

}
