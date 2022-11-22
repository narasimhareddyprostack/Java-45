package pack2;
import pack1.P;

class C2 extends P{
	
	public static void main(String[] args){
		P obj1=new P();
		//C2 Obj2=new P();
		C2 obj3=new C2();
		P obj4=new C2();
		obj3.m1();
	}

}