package streamApi2;


import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
	Stream s = 	Stream.of(11,12,13,14,15);
	Object[] numbers = s.toArray();
	
	for(Object num:numbers) {
		System.out.println(num);
	}

	}

}
