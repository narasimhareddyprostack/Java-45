class Test{
	int a = 10;
	int b = 20;
	static int c = 30;
	public static void main(String[] args){
		Test t1 = new Test();
		Test t2 = new Test();
		t2.a  = 11;
		System.out.println(t1.a);//10
		System.out.println(t2.a);//11
		t1.c = 33;
		System.out.println(t1.c);//33
		System.out.println(t2.c);//33
		System.out.println(c);   //33
	}
}