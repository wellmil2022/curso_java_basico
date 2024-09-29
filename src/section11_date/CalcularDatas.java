package section11_date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcularDatas {

	public static void main(String[] args) {
		LocalDate data04 = LocalDate.parse("2023-07-20");
		LocalDateTime data05 = LocalDateTime.parse("2023-07-20T01:36:09");
		Instant data06 = Instant.parse("2023-07-20T01:36:09Z");
		
		
		LocalDate pastWeekLocalDate = data04.minusDays(7);
		LocalDate nextWeekLocalDate = data04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
		// LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);
		
		System.out.println("2023-07-20 (7 dias antes) "+ pastWeekLocalDate);
		System.out.println("2023-07-20 (7 dias depois) "+ nextWeekLocalDate);
		
		Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = data06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("2023-07-20T01:36:09Z (7 dias antes) "+ pastWeekInstant);
		System.out.println("2023-07-20T01:36:09Z (7 dias depois) "+ nextWeekInstant);
		
		// Duração tem que ser LocalDateTime
		Duration t1 = Duration.between(pastWeekLocalDateTime, data05);
		// erro:: Duration t2 = Duration.between(pastWeekLocalDate, data04);
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), data04.atTime(0,0));
		// ou
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay());
		//Instant
		Duration t4 = Duration.between(pastWeekInstant, nextWeekInstant);
		
		System.out.println("duração de dias :"+ t1.toDays());
		//atTime
		System.out.println("duração de dias :"+ t2.toDays());
		System.out.println("duração de dias :"+ t3.toDays());
		System.out.println("duração de dias (instant :"+ t4.toDays());
		
		
	}

}
