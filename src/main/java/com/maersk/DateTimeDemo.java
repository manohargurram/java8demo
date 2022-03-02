package com.maersk;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
		System.out.println(dateTime.format(dateTimeFormatter));

		System.out.println(LocalDateTime.parse("2021-03-02T12:01:01.111", dateTimeFormatter));

		ZonedDateTime dateTime2 = ZonedDateTime.now();
		System.out.println(dateTime2);

		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		System.out.println(dateTime2.format(dateTimeFormatter2));

		ZonedDateTime dateTime3 =	ZonedDateTime.parse("2021-01-01T12:12:12.100+0530", dateTimeFormatter2);
		System.out.println(dateTime3);
		System.out.println(dateTime3.withZoneSameInstant(ZoneId.of("+0430")));

	}
}
