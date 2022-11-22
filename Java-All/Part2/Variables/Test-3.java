class Employee{
	int eid=101;
	String ename="Rahul";
	static String org_Name="TCS";
	public static void main(String[] args){
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e2.ename ="Rahul Gandhi";
		
		System.out.println(e1.org_Name);
		e2.org_Name ="TATA";
		
		System.out.println(e1.ename);
		System.out.println(e2.ename);
		System.out.println(e1.org_Name);
		System.out.println(e2.org_Name);
	}
}