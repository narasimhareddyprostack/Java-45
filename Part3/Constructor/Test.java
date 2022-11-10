class Test{
	Test(int a){
		System.out.println("const - special method");
	}
	public void m1(){
		System.out.println("Instance Method m1()");
	}
	public static void main(String[] args){
			Test obj1=new Test(100);
			Test obj2=new Test(100);
			Test obj3=new Test(100);
			
		
	}
}