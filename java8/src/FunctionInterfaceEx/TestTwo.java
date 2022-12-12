package FunctionInterfaceEx;

interface InterfaceOne{
	public abstract String displayData();
}

class TestTwo implements InterfaceOne{
	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return "GM";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTwo tw= new TestTwo();
        System.out.println(tw.displayData());
	}

	
}
