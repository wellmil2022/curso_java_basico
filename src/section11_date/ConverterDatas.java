package section11_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterDatas {

	public static void main(String[] args) {
		// converter data global para local - TimeZone
		LocalDate data04 = LocalDate.parse("2023-07-20");
		LocalDateTime data05 = LocalDateTime.parse("2023-07-20T01:36:09");
		Instant data06 = Instant.parse("2023-07-20T01:36:09Z");
		
//		for (String s: ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		};

		
		LocalDate r1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));
		
		System.out.println("2023-07-20T01:36:09Z convertida para local: "+r1);
		System.out.println("2023-07-20T01:36:09Z convertida para Portugal: "+r2);
		
		// extraindo dados da data
		System.out.println("2023-07-20 extraindo dia "+data04.getDayOfMonth());
		System.out.println("2023-07-20 extraindo mês "+data04.getMonthValue());
		System.out.println("2023-07-20 extraindo mês "+data04.getMonth());
		System.out.println("2023-07-20 extraindo hora "+data05.getHour());
		
	}

}
