package staticMethods;

interface Test1{
	void m1();  //abstract method
	default void m2() {
	}
	static void m3() {}
}

public class TestImpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
