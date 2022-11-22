class A{
	public int eid= 101;
	
	public void m1(){
		System.out.println("A - Class m1()");
	}
}
class B extends A{
	public void m1(){
		super.m1();
		System.out.println("B - Class - m1()");
	}
}

class Test{
	public static void main(String[] args){
		B obj=new B();
		obj.m1(); 
		
	}
}