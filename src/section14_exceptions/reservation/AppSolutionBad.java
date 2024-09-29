package section14_exceptions.reservation;

/**
 * Solution bad, because the erros return
 * strings that inform only
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import section14_exceptions.reservation.model.entities.Reservation;

public class AppSolutionBad {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		// List<Reservation> reservas = new ArrayList<Reservation>();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		Reservation reservation = null;

		System.out.println("Enter the reservation:");
		System.out.println("Room number:");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();
		// check-in
		System.out.println("Check-in date (dd/MM/yyyy");
		Date checkin = formatDate.parse(sc.nextLine());

		System.out.println("Check-out date (dd/MM/yyyy");
		Date checkout = formatDate.parse(sc.nextLine());
		
		// test with after method of class Date
		if (!checkout.after(checkin)) {
			System.out.println("Error: date checkout cannot be before checkin ");
		} else {
			reservation = new Reservation(roomNumber, checkin, checkout);
		}
		
		// update dates
		System.out.println("Enter data to update:");
		System.out.println("Check-in date (dd/MM/yyyy");
		checkin = formatDate.parse(sc.nextLine());

		System.out.println("Check-out date (dd/MM/yyyy");
		checkout = formatDate.parse(sc.nextLine());
		
		String error = reservation.updateDates(checkin, checkout);
		if (error == null) {
			reservation = new Reservation(roomNumber, checkin, checkout);
		} else {
			System.out.println(error);
		}

		System.out.println(reservation);

		sc.close();

	}

}
