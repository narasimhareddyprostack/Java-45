class Test{
    public static void customMethod(){
        try{   
            System.out.println(10/0);
        }
        catch(Exception e){
         e.printStackTrace();
         //System.out.println(e);
        }
    }
    public static void main(String[] args){
       customMethod();
    }
}