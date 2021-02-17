package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf1.format(d));
		
		//Aumentar Dia
		System.out.println("Sumar Hora");
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf1.format(d));
		
		//Pegar Minutos
		System.out.println("Pegar Minutos");
		int minutes = cal.get(Calendar.MINUTE);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int mes = 1+ cal.get(Calendar.MONTH);
		System.out.println("Minutos: " + minutes);
		System.out.println("Dia: " + dia);
		System.out.println("Mes: " + mes);
		
		
	}

}
