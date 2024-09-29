package section11_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatarData {

	public static void main(String[] args) {
		LocalDate data04 = LocalDate.parse("2023-07-20");
		LocalDateTime data05 = LocalDateTime.parse("2023-07-20T01:36:09");
		Instant data06 = Instant.parse("2023-07-20T01:36:09Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		// Uso do fuso horário com instant
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// formater com nomes padrão
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("data não formatada: "+data04);
		System.out.println("data formatada: "+data04.format(fmt1));
		System.out.println("data formatada: "+
		data04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("data formatada: "+data05.format(fmt2));
		
		System.out.println("data com fuso não formatada: "+data06);
		System.out.println("data formatada: "+fmt3.format(data06));
		
		System.out.println("data formatada: "+data05.format(fmt4));
		
		System.out.println("data formatada: "+fmt5.format(data06));
	}
	
	

}
