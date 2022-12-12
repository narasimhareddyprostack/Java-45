package LambdaExTwo;

interface Test1{
	public void m1();
}

public class TestImpl2  {
	
	public static void main(String[] args) {
	Test1 t = ()->{ System.out.println("TestImpl2 Metthod m1"); };
	t.m1();
	}

}
