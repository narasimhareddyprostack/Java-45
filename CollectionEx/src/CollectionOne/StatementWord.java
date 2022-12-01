package CollectionOne;

import java.util.ArrayList;
import java.util.Arrays;

public class StatementWord {
public static void main(String[] args) {
	String st = "Hello, Welcome to Pro Stack";
	
	String[] words = st.split(" ");
	
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(words));
	
	for(String word:words) {
		System.out.println(word);
	}
	//System.out.println(st.split(" "));
	System.out.println(st.split(" ").length);
}
}
