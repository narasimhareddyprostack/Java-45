package staticMethods;

interface Test{
	void m1();  //abstract method
	default void m2() {
		System.out.println("default method m2:");
	}
	static void m3() {
		System.out.println("Static method m3:");
	}
}

public class TestImpl implements Test{
	public void m1() {
		System.out.println("TestImpl Class method m1:");
	}
	public static void main(String[] args) {
	/*
	TestImpl t = new TestImpl();
	t.m1();
	t.m2();
	*/
	Test.m3();
	}

}
