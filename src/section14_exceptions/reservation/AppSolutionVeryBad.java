package section14_exceptions.reservation;

/**
 * this Solution for App Reservations
 * Is very bad because the all logic
 * is not in class reservation and
 * don't set try catch for excetions
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import section14_exceptions.reservation.model.entities.Reservation;

public class AppSolutionVeryBad {

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

		// update reservation

		System.out.println("Enter data to update:");
		System.out.println("Check-in date (dd/MM/yyyy");
		checkin = formatDate.parse(sc.nextLine());

		System.out.println("Check-out date (dd/MM/yyyy");
		checkout = formatDate.parse(sc.nextLine());

		// only allow future dates 
		Date now = new Date();

		if (checkin.after(now) && checkout.after(checkin)) {
			reservation.updateDates(checkin, checkout);
		} else {
			System.out.println("Error in Reservation: Only futures dates must can be update");
		}

		if (reservation != null) System.out.println(reservation);

		sc.close();

	}

}
