package com.zensar.training.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main3 {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate tomorrow=LocalDate.of(2022, 2, 1);
		System.out.println(tomorrow);
		
		String str="2022-06-25";
		
		LocalDate other=LocalDate.parse(str);
		System.out.println(other);
		
		String str1="15 08 2022";
		LocalDate independenceDay=LocalDate.parse(str1, DateTimeFormatter.ofPattern("dd MM yyyy"));
		
		System.out.println(independenceDay);
		
		LocalDate localDate=independenceDay.plusDays(10);
		

	}

}
