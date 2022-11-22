//ClassCastEx
class Test{
    public static void main(String[] args){
     
      /*   String ename = "Rahul";
        Object obj1 = (Object)ename;
        System.out.println(obj1); */

        Object obj="Hello";

        String msg=(String)obj;
        Integer i=(Integer)obj; 
              
        System.out.println(msg);
        System.out.println(i);

    }
}