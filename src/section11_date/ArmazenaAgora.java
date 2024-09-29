package section11_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArmazenaAgora {

	public static void main(String[] args) {
		
		//DateTimeFormatter - para texto customizado 03/12/2023 dd/MM/yyyy
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		/**
		* Java dock
		* @author wellington
		* 
		*/
		
		LocalDate data01 = LocalDate.now();
		LocalDateTime data02 = LocalDateTime.now();
		Instant data03 = Instant.now();
		
		LocalDate data04 = LocalDate.parse("2023-07-20");
		LocalDateTime data05 = LocalDateTime.parse("2023-07-20T01:36:09");
		Instant data06 = Instant.parse("2023-07-20T01:36:09Z");
		// horário do brasil salvo em UTC
		Instant data07 = Instant.parse("2023-07-20T01:36:09-03:00");
		
		// texto customizado com formatter
		LocalDate data08 = LocalDate.parse("03/12/2023", fmt01);
		LocalDateTime data09 = LocalDateTime.parse("03/12/2023 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		// recebendo dia mês ano
		LocalDate data10 = LocalDate.of(2022, 11, 04);
		LocalDateTime data11 = LocalDateTime.of(2022, 10, 5, 1, 45);
		
		System.out.println("LocalDate.now: "+data01);
		System.out.println("LocalDateTime.now: "+data02);
		System.out.println("Instant.now: "+data03);
		System.out.println("LocalDate.parse: "+data04);
		System.out.println("LocalDateTime.parse: "+data05);
		System.out.println("Instant.parse: "+data06);
		System.out.println("Instant.parse (fuso do brasil -> UTC): "+data07);
		System.out.println("--- Data formatada --- ");
		System.out.println("LocalDate.parse+formatter ISO: "+data08);
		System.out.println("LocalDateTime.parse+formatter ISO: "+data09);
		System.out.println("LocalDate.of: "+data10);
		System.out.println("LocalDateTime.of: "+data11);
		
		

	}

}
