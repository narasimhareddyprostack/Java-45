class A{
	public void m1(){
		System.out.println("A - Class m1()");
	}
	public void m2(){
		System.out.println("A - class m2()");
	}
}
class B extends A{
	public void m1(){
		System.out.println("B - Class - m1()");
	}
	public void m1(int a){
		System.out.println("B - class m1( int arg)");
	}
}

class Test{
	public static void main(String[] args){
		B obj=new B();
		obj.m1(); // B - m1()
		obj.m2(); // A - m2()
		obj.m1(10);// B - m1 with int arg
		System.out.println("Hello,GE");
	}
}