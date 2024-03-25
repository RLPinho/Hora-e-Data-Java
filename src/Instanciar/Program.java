package Instanciar;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
//-1-------Instanciar hora e Data mnormal----------------------------------------------		

		LocalDate     d01 = LocalDate.now();//Data atual
		LocalDateTime d02 = LocalDateTime.now();//Data e hora atual
		Instant       d03 = Instant.now();//Data e hora atual GMT
		
		System.out.println("d01 =" + d01.toString());
		System.out.println("d02 =" + d02.toString());
		System.out.println("d03 =" + d03.toString());

		
		
		
		
//-2--------De Texto ISO8601 Padrao ---para Data e Hora------------------------------		
		
		LocalDate     d04 = LocalDate.parse("2022-07-20");//Gerei uma data !!
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//Gerei uma data e hora!!!
		Instant       d06 = Instant.parse("2022-07-20T01:30:26Z");//Gerei uma data e hora no padrao UTC GMT !!
	
		System.out.println("d04 =" + d04.toString());
		System.out.println("d05 =" + d05.toString());
		System.out.println("d06 =" + d06.toString());
				
//-3----Se eu quiser , especificar um determinado horario para ele converter -para o GMT-------------------		
		
		Instant       d07 = Instant.parse("2022-07-20T01:30:26-03:00");// vai ter 3 horas a mais !!
		
		
		System.out.println("d07 =" + d07.toString());
	
		
		
//-4---------Se eu quiser passar um texto customizado -------para Hora local		
//--- Mas Tenho que especificar a formataçao da data hora		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");	
		
		LocalDate     d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		System.out.println("d08 =" + d08.toString());
		System.out.println("d09 =" + d09.toString());

		
		
//-5-----Instanciar apartir de datas isoladas---dia----mes ------ano------------------------		
		
		LocalDate     d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1 , 30);
		
		System.out.println("d10 =" + d10.toString());
		System.out.println("d11 =" + d11.toString());
				
	}

}
