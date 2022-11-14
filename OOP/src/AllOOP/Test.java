package AllOOP;

public class Test {

	public static void main(String[] args) {
		Savings_Account a1=new Savings_Account();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul Gandhi");
		a1.setAcc_Bal(5000.00);
		a1.setMin_Bal(500.00);
		
		Current_Account a2=new Current_Account();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka Gandhi");
		a2.setAcc_Bal(45000.00);
		a2.setMin_Bal(200.00);
		
		//a1.cal_Bal();
		//a2.cal_Bal();
		Account_Service.show_Details(a1);
		Account_Service.show_Details(a2);
	}

}
