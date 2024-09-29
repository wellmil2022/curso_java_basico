package section11_date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2018-04-25T15:42:04Z"));
		
		System.out.println(data);
		System.out.println(sdf1.format(data));
		
		// calculo de datas com Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		//System.out.println(cal);
		// acrescenta 4 horas
		cal.add(Calendar.HOUR_OF_DAY, 4);
		data = cal.getTime();
		System.out.println(sdf1.format(data));
		
		// capturar parte da data-hora
		// hora
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hora:"+ hora);
		int mes = cal.get(Calendar.MONTH);
		System.out.println("Hora:"+ mes );

	}

}
