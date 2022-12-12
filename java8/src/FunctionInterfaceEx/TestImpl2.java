package FunctionInterfaceEx;

@FunctionalInterface
interface TestInter{
	
		public abstract void methodOne();
		//public abstract void methodTwo();
}
public class TestImpl2  {
	
	public static void main(String[] args) {
	TestInter ti = ()->{System.out.println("TestImpl method One");};
	ti.methodOne();
	}

	

}
