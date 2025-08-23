package mypackage;

import java.util.Scanner;

class Ticket {
	String Movie;
	int TicketCount, price;
	String SeatType;
	
	Ticket(String Movie, int TicketCount) {
		this(Movie,TicketCount,"Normal");
	}
	
	Ticket(String Movie, int TicketCount, String SeatType) {
		
		this.Movie=Movie;
		this.TicketCount=TicketCount;
		this.SeatType=SeatType;
		
		if (SeatType.equalsIgnoreCase("VIP")) {
			price=500;
			System.out.println("Price: "+TicketCount*price);
		}
		
		else {
			price=300;
			System.out.println("Price: "+TicketCount*price);
		}
	}
	
	void display() {
		System.out.println("Movie: "+Movie);
		System.out.println("Ticket Count: "+TicketCount);
		System.out.println("Seat Type: "+SeatType);
	}
}

public class MovieTicket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Movie, SeatType;
		int TicketCount;
		
		System.out.println("Enter Movie, Ticket Count and Seat Type (VIP/Normal): ");
		Movie=input.nextLine();
		TicketCount=input.nextInt();
		input.nextLine();
		SeatType=input.nextLine();
		
		Ticket t1 = new Ticket(Movie, TicketCount, SeatType);
		t1.display();
		
		input.close();
	}

}
