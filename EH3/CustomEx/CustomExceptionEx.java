class InsuffientFundsExcetion extends Exception{
    InsuffientFundsExcetion(String message){
        super(message);
    }
}
class CustomExceptionEx{

    public void checkActivity() throws InsuffientFundsExcetion {
        int bal = 55000;
        if(bal <40000){
            throw new InsuffientFundsExcetion("No Money !");
        }else{
            System.out.println("Enjoy");
        }
    }
    public static void main(String[] args) throws InsuffientFundsExcetion {
        CustomExceptionEx c1=new CustomExceptionEx();
        c1.checkActivity();
    }
}   