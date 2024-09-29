package section14_exceptions.reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import section14_exceptions.reservation.model.entities.Reservation;

public class AppReturnStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<Reservation> reservas = new ArrayList<Reservation>();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
	
		System.out.println("Enter the reservation:");
		System.out.println("Room number:");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();
		//check-in
		System.out.println("Check-in date (dd/MM/yyyy");
		Date checkin = null;
		try {
			checkin = fmt.parse(sc.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Check-out date (dd/MM/yyyy");
		Date checkout = null;
		try {
			checkout = fmt.parse(sc.nextLine());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Reservation res = new Reservation(roomNumber, checkin, checkout);
		System.out.println(res);
		// update
		System.out.println("Enter data to update:");
		System.out.println("Check-in date (dd/MM/yyyy");
		try {
			res.setCheckin(fmt.parse(sc.nextLine()));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//sc.nextLine();
		System.out.println("Check-out date (dd/MM/yyyy");
		try {
			res.setCheckout(fmt.parse(sc.nextLine()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(res);
		
		sc.close();

	}

}
