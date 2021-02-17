package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		//Impresao Padrao Java
		System.out.println(y1);
		System.out.println(y2);
		
		//Impresao Formato dado SimpleDataFormat
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		//Data Atual
		System.out.println("--------------");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L); //Pasando milisegundos - corre desde 1970
		Date x4 = new Date(1000L*60L*60L*5L); //Pasando milisegundos - corre desde 1970 as 5 da manha
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x3: " + sdf2.format(x4));
		
		//Data formato ISO para formato UTC de mi PC
		System.out.println("--------------");
		Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("x5: " + sdf2.format(x5));
		//Data formato ISO para formato UTC Real
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("x5 Bom format: " + sdf3.format(x5));
		
	}

}
