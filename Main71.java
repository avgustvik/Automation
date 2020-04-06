package com.gmail.vik.avgust;

import java.util.Calendar;
import java.util.Date;

public class Main71 {

	public static void main(String[] args) {

		Calendar cl1 = Calendar.getInstance();
		
		Calendar cl2 = Calendar.getInstance();
		cl2.add(Calendar.MONTH, -1);

		Date date1 = cl1.getTime();
		Date date2 = cl2.getTime();

		System.out.println(date1);
		System.out.println(date2);

		long t1 = date1.getTime();
		long t2 = date2.getTime();

		long result = t1 - t2;

		System.out.println("Difference is new data " + result);
	}
}
