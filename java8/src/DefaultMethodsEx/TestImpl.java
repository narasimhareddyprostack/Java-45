package DefaultMethodsEx;

interface Test{
	public abstract void m1();
	//public abstract void m2();
	default void m2() {}
}
class TestImpl1 implements Test{
	public void m1() {
		System.out.println("TestImpl1 - m1 method");
	}
}
class TestImpl2 implements Test{
	public void m1() {
		System.out.println("TestImpl2 - m1 method");
	}
}
public class TestImpl implements  Test{
	public void m1() {
		System.out.println("TestImpl - m1 method");
	}
}
