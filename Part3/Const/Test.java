class A{
        String ename;
        A(String name){
            this.ename  = name;
            System.out.println("Class A - const");
        }
}
class B extends A{
    int eid;
    
    B(int id, String name){ 
        super(name) ;
        this.eid=id;
        System.out.println("Class B - const"); 
    }
}

class Test{
    public static void main(String[] args){
        new B(10,"Rahul");
    }
}