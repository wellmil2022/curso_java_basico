package section12_enum;

import java.time.LocalDateTime;

import section12_enum.enums.OrderStatus;

public class ExempleEnum {

	public static void main(String[] args) {
		Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
