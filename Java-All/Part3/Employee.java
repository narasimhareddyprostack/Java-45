package com.psa;
public class Employee{
	private int eid;//data hiding or abstract
	//  +
	public void setEid(int e){
		this.eid = e;
	}
	public int getEid(){
		return this.eid;
	}
	public static void main(String[] args){
		Employee e1=new Employee();
		e1.setEid(101);
		System.out.println(e1.getEid());
	}
}