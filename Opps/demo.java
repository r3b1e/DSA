abstract class Science{
    abstract void preaparing();
}
class Doctor extends Science{
    void preaparing(){
        System.out.println("Doctor is preparing");
    }
}
class Engineers extends Science{
    void preaparing(){
        System.out.println("Engineers are prepareing");
    }
}
class Diploma extends Science{
   void preaparing(){
    System.out.println("Diploma is preaparing");
   }
}
class A{
   void demo2(Science poly){
        poly.preaparing();
    }
}
public class demo {
    public static void main(String[] args) {
        Engineers s1=new Engineers();
        s1.preaparing();
        Diploma s2=new Diploma();
        s2.preaparing();
        A a=new A();
        a.demo2(s2);
    }
}
