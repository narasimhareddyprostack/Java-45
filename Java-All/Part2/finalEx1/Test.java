class A{
	public final void m1(){
		System.out.println("Class A - m1() method");
	}
}
class B extends A{
	public  void m1(){
		System.out.println("Class B - m1() method");
	}
	public void m2(){
		System.out.println("Class B- m2() method");
	}
	public static void main(String[] args){
	B b=new B();
	b.m1();
	b.m2();
	}
}