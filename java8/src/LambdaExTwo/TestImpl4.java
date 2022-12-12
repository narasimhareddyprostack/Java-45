package LambdaExTwo;

interface Add{
	public void add(int a, int b);
}
public class TestImpl4  implements Add {
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Add a = new TestImpl4();
		a.add(10, 20);
	}
}
