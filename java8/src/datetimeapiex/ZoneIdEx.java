package datetimeapiex;

import java.time.ZoneId;

public class ZoneIdEx {
	
	public static void main(String[] args) {
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		 ZoneId id1 =ZoneId.of("Europe/Paris");
		 System.out.println(id1);
	}
}
