interface Employee{
					void m1();
	public abstract void m2();
			 public void m3();
}
class Emp1 implements Employee{	
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
	}
	/*
	public void m3(){
		System.out.println("m3 method");
	}
	*/
	public static void main(String[] args){
	Emp1 obj1=new Emp1();
	obj1.m1();
	obj1.m2();
	obj1.m3();
	
	System.out.println("Test Case123");
	}
}
//class Emp2 implements Employee{}