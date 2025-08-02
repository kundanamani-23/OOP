package mypackage;

import java.time.LocalTime;

public class Time {

	public static void main(String[] args) {
		LocalTime now=LocalTime.now();
		System.out.println("Time: "+now);
		
		LocalTime custom=LocalTime.of(11, 11);
		System.out.println("Custom Time: "+custom);
		
		System.out.println("Hour: "+now.getHour());
		System.out.println("Minute: "+now.getMinute());

	}

}
