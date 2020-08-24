

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Period {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(1994, 9, 9);
		LocalDate today = LocalDate.now(); // use for age-calculation: LocalDate.now()
		long years = ChronoUnit.YEARS.between(start, today);
		System.out.println(years); // 17
	}

}

