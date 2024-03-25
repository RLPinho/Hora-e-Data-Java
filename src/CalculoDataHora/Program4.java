package CalculoDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {
		
		LocalDate     d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant       d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		
//-----------Vou fazer com que o d04 fosse uma semana antes-----------------------------
		
		LocalDate     pastWeekLocalDate = d04.minusDays(7);//Ou seja é o d04 menos 7 dias !!
		LocalDate     nextWeekLocalDate = d04.plusDays(7);//Ou seja é o d04 mais 7 dias !!
		
		System.out.println("Past week local date : " + pastWeekLocalDate);
		System.out.println("Past week local date : " + nextWeekLocalDate);
//--------------------------------------------------------------------------------------------------------
				
		LocalDateTime     pastWeekLocalDateTime = d05.minusDays(7);//Ou seja é o d04 menos 7 dias !!
		LocalDateTime     nextWeekLocalDateTime = d05.plusDays(7);//Ou seja é o d04 mais 7 dias !!
		
		System.out.println("Past week local date time: " + pastWeekLocalDateTime);
		System.out.println("Past week local date time: " + nextWeekLocalDateTime);
		
//--------------------------------------------------------------------------------------------------------
		
		Instant     pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);//Ou seja é o d04 menos 7 dias !!
		Instant     nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);//Ou seja é o d04 mais 7 dias !!
				
		System.out.println("Past week Instant : " + pastWeekInstant);
		System.out.println("Past week Instant : " + nextWeekInstant);		
		
		
//---------------------------DURACAO----------------------------------------------------		
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));	//Tenho que atribuir porque aqui so tenho data !!			
// Ou entao :
		Duration t01 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("Duration t1 dias : " + t1.toDays());
		System.out.println("Duration t01 dias : " + t01.toDays());
		System.out.println("Duration t2 dias : " + t2.toDays());
		System.out.println("Duration t3 dias : " + t3.toDays());
		System.out.println("Duration t4 dias : " + t4.toDays());
		
		
		
	}

}
