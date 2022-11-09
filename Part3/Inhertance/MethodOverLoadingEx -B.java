class A{
	public void m1(int a){
		System.out.println("m1 method - int arg");
	}
	public void m1(float b){
	System.out.println("m1 method - float arg");
	}
	public void m1(double c){
		System.out.println("m1 method -double arg");
	}
	
	public static void main(String[] args){
		A a = new A();
		a.m1(10);
		a.m1(10.5f);
		a.m1(10.5);
	}
}