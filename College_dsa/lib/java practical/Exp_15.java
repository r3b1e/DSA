
public class Exp_15 {
   public static void main(String[] args){
    //------------first by try and catch---------------------
    // try{
    //     int num = 0;
    //     int num2 = 783/8;
    //     System.out.println(num2);
    // }
    // catch(ArithmeticException e){
    //     System.out.println("0 is not a better divisor");
    // }
    //---------------second try catch and throw--------------------
    // try{
    // cheackexception(-47, 15);
    // }
    // catch(ArithmeticException e){
    // System.out.println(e.getMessage());
    // }
    try{
        System.out.println(4/0);
    }
    catch(ArithmeticException e){
        System.out.println("0 is nothing don't take fear of 0");
    }
    finally{
        System.out.println("i am a finallly block");
    }
    System.out.println("the prigrame terminate here");
   } 
   public static void cheackexception(int age, int weight){
       if(age<12 && weight<40){
        throw new ArithmeticException("wrong");
       }
       else{
        System.out.println("Eligible");
       }
       System.out.println("HAVE A NICE DAY");
   }
}
