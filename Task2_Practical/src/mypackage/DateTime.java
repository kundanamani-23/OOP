package mypackage;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime alarm=LocalTime.of(20, 00);

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current DateTime: " + dateTime);
        System.out.println("Alarm: " + alarm);

	}

}
