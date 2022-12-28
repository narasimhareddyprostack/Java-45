package datetimeapiex;

import java.time.LocalDate;
import java.time.Period;

public class CalAgeEx {

	public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	LocalDate dob = LocalDate.of(2000, 5, 30);
	Period p = Period.between(dob, today);
	int no_Years = p.getYears();
	int no_Months =p.getMonths();
	int no_Days = p.getDays();
	
	System.out.println("Chia Age - No of Years"+no_Years + "No Months"+no_Months );
	}

}
