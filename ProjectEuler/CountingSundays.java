// Problem 19 in ProjectEuler

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CountingSundays {
	public static void main(String args[]) {
		int count = 0;
		for (int i=1901;i<=2000;i++) {
			for (int month=1;month <=12;month++) {
				if (new Date(i,month,1).getDay() == Calendar.SUNDAY) {
					count++;
				}
			}
		}
		System.out.println(count + 1);
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week spelled out completely
        System.out.println(new Date(2017,2,11));
	}
}