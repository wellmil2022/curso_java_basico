package section14_exceptions.reservation;
/**
 * Solution good, because we makes exception treatment
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import section14_exceptions.reservation.model.entities.Reservation;
import section14_exceptions.reservation.model.exceptions.DomainException;

public class AppSolutionGood {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.println("Enter the reservation:");
		System.out.println("Room number:");
		Integer roomNumber = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy");
		Date checkin = formatDate.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy");
		Date checkout = formatDate.parse(sc.next());
		Reservation reservation = new Reservation(roomNumber, checkin, checkout);
		System.out.println(reservation);
		
		// update
		sc.nextLine();
		System.out.println("Enter data to update:");
		System.out.println("Check-in date (dd/MM/yyyy");
		checkin = formatDate.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy");
		checkout = formatDate.parse(sc.next());
		reservation.updateDates(checkin, checkout);
		System.out.println(reservation);
		
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println("Error in reservation:" + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();

	}

}
