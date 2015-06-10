package com.imc.driver.wait.service.utils;

import java.util.Calendar;
import java.util.Date;

public class DatesUtil {
	public static Calendar getDatePlusMinutesCalendar(Date originalDate,
			int numberOfMinutes) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(originalDate);
		cal.add(Calendar.MINUTE, numberOfMinutes);
		return cal;
	}

	public static int getSecondsAfterMidnight(Calendar cal) {
		long timeInMillis = cal.getTimeInMillis();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long millisPassed = timeInMillis - cal.getTimeInMillis();
		long secondsPassed = millisPassed / 1000;
		return (int) secondsPassed;
	}

	public static int getSecondsAfterMidnight(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		long timeInMillis = cal.getTimeInMillis();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long millisPassed = timeInMillis - cal.getTimeInMillis();
		long secondsPassed = millisPassed / 1000;
		return (int) secondsPassed;
	}

	public static Date combineDateAndTime(Date date, Date time) {
		Calendar calDate = Calendar.getInstance();
		calDate.setTime(date);

		Calendar calTime = Calendar.getInstance();
		calTime.setTime(time);

		Calendar calCombined = Calendar.getInstance();
		calCombined.set(calDate.get(Calendar.YEAR),
				calDate.get(Calendar.MONTH),
				calDate.get(Calendar.DAY_OF_MONTH),
				calTime.get(Calendar.HOUR_OF_DAY),
				calTime.get(Calendar.MINUTE), calTime.get(Calendar.SECOND));

		return calCombined.getTime();
	}

	public static Date combineDateAndSecondsAfterMidnight(Date date, int seconds) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.SECOND, seconds);
		return cal.getTime();
	}

	// public static int differenceInSOMETHING(Date date1, Date date2) {
	// Calendar cal1 = Calendar.getInstance();
	// cal1.setTime(date1);
	//
	// Calendar cal2 = Calendar.getInstance();
	// cal2.setTime(date2);
	// date1.
	// int s = cal1.cal2;
	//
	// }
}
