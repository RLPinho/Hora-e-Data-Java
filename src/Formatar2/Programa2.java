package Formatar2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa2 {

	public static void main(String[] args) {
		
		
		LocalDate     d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant       d06 = Instant.parse("2022-07-20T01:30:26Z"); //criar datas em modo : fuso Horario GMT 

		
		
//-------------------------------------------------------------------------------------		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		System.out.println("d04 =" + d04.format(fmt1));// pode ser das duas formas
		System.out.println("d04 =" + fmt1.format(d04));


//---------------------------------------------------------------------------------------------		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("d05 =" + d05.format(fmt1));// Só a Data 
		System.out.println("d05 =" + d05.format(fmt2));// Data e Hora		


//--------------------------Fazer uma conversao a hora equivalente na zona GMT deste computador--------------------------------------------
		System.out.println("d06 =" + d06);//Formato ISO - Global
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d06 =" + fmt3.format(d06));
		
//------------------------------------------------------------------------------------------------------		
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;//Data sem fuso horario
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d05 =" + d05.format(fmt4));
		
		System.out.println("d06 =" + fmt3.format(d06));
		System.out.println("d06 =" + fmt5.format(d06));//Igual
		System.out.println("d06 =" + d06.toString());//Igual
		
		
	}

}
