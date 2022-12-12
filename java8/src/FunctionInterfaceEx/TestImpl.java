package FunctionInterfaceEx;

interface Test{
		public abstract void methodOne();
}
public class TestImpl  implements TestTwo{
	@Override
	public void methodOne() {
		System.out.println("TestImpl method One");
		
	}
	public static void main(String[] args) {
		TestImpl test = new TestImpl();
		test.methodOne();
	}

	

}
