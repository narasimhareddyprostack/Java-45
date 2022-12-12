package LambdaEx;

interface InterfaceOne {
	public abstract void display();
}

public class TestOne {
	
	public static void main(String[] args) {
		InterfaceOne i = ()->{System.out.println("Hello;");};
		i.display();
	}

}
