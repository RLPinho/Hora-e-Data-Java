package Formatar3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programa3 {

	public static void main(String[] args) {

//---Converter hora Global (do computador ou nao )para Local---------------------------------		
		
		LocalDate     d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant       d06 = Instant.parse("2022-07-20T01:30:26Z"); //criar datas em modo : fuso Horario GMT 

//		for (String x : ZoneId.getAvailableZoneIds()) {//Todos os UTC do Mundo !!!!
//			System.out.println(x);
//		}

//---Estou a converter o fuso horario do meu PC onde eu estou , para uma data local	
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("America/Sao_Paulo"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("America/Sao_Paulo"));
				
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

//-----------------------------------------------------------------------------------		
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 Mês = " + d04.getMonthValue());
		System.out.println("d04 dia = " + d04.getYear());
						
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 hora = " + d05.getMinute());
		
	
	}

}
