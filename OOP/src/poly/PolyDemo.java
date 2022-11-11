package poly;

public class PolyDemo {

	public static void main(String[] args) {
		Savings_Account a1 = new Savings_Account();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul");
		a1.setAcc_Bal(5000);
		a1.setMin_Bal(500.00);
		
		//a1.cal_Bal();

		Current_Account a2 = new Current_Account();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka");
		a2.setAcc_Bal(600000);
		a2.setMin_Bal(24000);
		//a2.cal_Bal();
		AccountService.showDetails(a1);
		AccountService.showDetails(a2);
	}

}
