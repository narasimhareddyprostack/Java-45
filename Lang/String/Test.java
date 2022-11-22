class  Test{
    public static void main(String[] args){
      String s1 = "Rahul";
      s1.concat("Gandhi");

      StringBuffer s2  = new StringBuffer("Rahul");
      s2.append("Gandhi");

      System.out.println(s1);  //Rahul
      System.out.println(s2);  //RahulGandhi
      System.out.println(s2.length());  //RahulGandhi

    }
}