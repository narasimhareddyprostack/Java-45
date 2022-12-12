package DefaultMethodsEx;

interface Demo{
	public abstract void m1();
	default void m2() {
		System.out.println("default Method");
	};
}
public class DemoImpl implements Demo {
	public void m2() {
		System.out.println("DemoImpl class - default Method");
	};
	public void m1() {
		System.out.println("Implimentation class DemoImpl m1()-method ");
	}

	public static void main(String[] args) {
		DemoImpl d = new  DemoImpl();
		d.m1();
		d.m2();

	}

}
