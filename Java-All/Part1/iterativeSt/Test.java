//WAP print first 10 even numbers
//0 2 4 6 8 10 12 14 16 18
/*
initilization st: int i = 0;
condition st    : i<=18; i<19 ; // i<20
incr/decr st    : i=i+2;  
*/
class Test{
public static void main(String[] args){
		int i=0;
		while(i<20){
			System.out.println(i);
			i=i+2;
		}
}
}