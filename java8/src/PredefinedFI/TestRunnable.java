package PredefinedFI;

public class TestRunnable {

	public static void main(String[] args) {
		String s = "Kishore";
		Runnable r = ()->{ System.out.println(s); };
		r.run();
	}

}
