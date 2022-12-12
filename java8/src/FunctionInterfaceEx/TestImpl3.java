package FunctionInterfaceEx;

interface TestInterOne{
		public abstract void methodOne();
		//public abstract void methodTwo();
}
public class TestImpl3  {
	
	public static void main(String[] args) {
	TestInterOne ti = ()->{System.out.println("TestImpl method One");};
	ti.methodOne();
	}

	

}
