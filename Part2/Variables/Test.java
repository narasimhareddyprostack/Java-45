class Test{
	int a;
	static String ename; 
	public static void main(String[] args){
		int b=10000;
		System.out.println(b);
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1.a);
		System.out.println(t1.ename);
	}
}