class Test{
public static void main(String[] args){
	int[]  marks  = {35,36,37,38,39,40};
	System.out.println(marks[0]);
	try{
		System.out.println(marks[10]);
	}
	catch(Exception e){
	//e.printStackTrace();
	//System.out.println(e);
	//System.out.println(e.toString());
	System.out.println(e.getMessage());
	}	
	System.out.println(marks[2]);
	System.out.println(marks[3]);
	System.out.println(marks[4]);
	System.out.println(marks[5]);
	
}
}