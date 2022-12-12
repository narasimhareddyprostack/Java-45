package PredefinedFI;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test3 {
			
		static Predicate<Integer> p = i -> i%2 ==0; 	
		public static void main(String[] args) {
		
		System.out.println(p.test(101));
		
		}

}
