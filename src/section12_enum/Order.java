package section12_enum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import section12_enum.enums.OrderStatus;

public class Order {
	private Integer id;
	private LocalDateTime moment;
	private OrderStatus status;

	public Order() {
	}

	public Order(Integer id, LocalDateTime moment, OrderStatus status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Order [id=%s, moment=%s, status=%s]", id, moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), status);
	}

	
	
	
}
