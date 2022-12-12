package LambdaExTwo;

interface Test{
	public void m1();
}

public class TestImpl implements Test {
	public void m1() {
		System.out.println("TestImpl Class - m1()");
	}
	public static void main(String[] args) {
	//new TestImpl().m1();
		Test t = new TestImpl();
		t.m1();
	}

}
