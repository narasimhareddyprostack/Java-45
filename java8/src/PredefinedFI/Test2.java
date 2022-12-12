package PredefinedFI;

import java.util.function.Function;

public class Test2 {
		static Function<Integer, Integer> f = i -> i*i;	
			
		public static void main(String[] args) {
		System.out.println("The Square root of :"+ f.apply(111));
	}

}
