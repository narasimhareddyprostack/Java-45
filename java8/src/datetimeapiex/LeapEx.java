package datetimeapiex;

import java.time.Year;

public class LeapEx {
	public static void main(String[] args) {
		int year = 2024;
		Year y = Year.of(year);
		if(y.isLeap()) {
			System.out.println("yes! Leap Year");	
		}
		else {
			System.out.println("No ----");
		}
		
	}
}	
