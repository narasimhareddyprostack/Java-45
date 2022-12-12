package LambdaExTwo;

interface Sum{
	public void add(int a, int b);
}
public class TestImpl3  {
	public static void main(String[] args) {
	Sum s = (a,b)->{   System.out.println(a+b); };
	s.add(10, 20);
	}
}
