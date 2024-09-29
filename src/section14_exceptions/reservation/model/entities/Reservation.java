package section14_exceptions.reservation.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		super();
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

		
	public Integer duration() {
		// diferença em milisegundos
		Long diff = this.checkout.getTime() - this.checkin.getTime();
		Long durationLong = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		
		return durationLong.intValue();
	}
	
	public String updateDatesString(Date checkin, Date checkout) {
		//tests - future dates and checkout after 
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			return "Error in Reservation: Only futures dates must can be update";
		} 
		if (!checkout.after(checkin)) {
			return "Error in Reservation: Checkout date must been after checkin date";
		}
		// if pass in test then update
		this.checkin = checkin;
		this.checkout = checkout;
		// return null if OK
		return null;
		
	}

	public void updateDates(Date checkin, Date checkout) {
		//tests - future dates and checkout after 
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new IllegalArgumentException("Reservation dates for update must been future dates ");
		} 
		if (!checkout.after(checkin)) {
			throw new IllegalArgumentException("Checkout date must been after checkin date");
		}
		// if pass in test then update
		this.checkin = checkin;
		this.checkout = checkout;
		
	}
	
	
	
	
	@Override
	public String toString() {
		
		
		return String.format("Reservation: "
				+ "Room %s, Check-in: %s, Check-out:%s, %d nights",
				roomNumber,
				fmt.format(checkin),
				fmt.format(checkout),
				duration());
	}

}
