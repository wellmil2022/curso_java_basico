package section14_exceptions.reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import section14_exceptions.model.entities.Reservation;

public class AppSolutionVeryBad {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		//List<Reservation> reservas = new ArrayList<Reservation>();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Reservation res = null;
		
	
		System.out.println("Enter the reservation:");
		System.out.println("Room number:");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();
		//check-in
		System.out.println("Check-in date (dd/MM/yyyy");
		Date checkin = fmt.parse(sc.nextLine());

		
		System.out.println("Check-out date (dd/MM/yyyy");
		Date checkout = fmt.parse(sc.nextLine());

		//teste com after
		
		
		
		if (!checkout.after(checkin)) {
			System.out.println("Error: date checkout cannot be before checkin ");
		} else {
			res = new Reservation(roomNumber, checkin, checkout);
		}
		
		// update
		
		System.out.println("Enter data to update:");
		System.out.println("Check-in date (dd/MM/yyyy");
		checkin = fmt.parse(sc.nextLine());

		System.out.println("Check-out date (dd/MM/yyyy");
		checkout = fmt.parse(sc.nextLine());

		
		//lógica para datas futuras
		Date now = new Date();
		
		if (checkin.after(now) && checkout.after(checkin)) {
			res.updateDates(checkin, checkout);
		} else {
			System.out.println("Only futures dates must can be update");
		}
		
		
		System.out.println(res);
		
		sc.close();

	}

}
