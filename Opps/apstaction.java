
public class apstaction {
    public static void main(String[] args) {
        Pig p=new Pig();
       p.eat();
       p.walks();
        Hen h=new Hen();
        h.eat();
        h.walks();

    }
    
}
abstract class Animals{
    void eat (){
        System.out.println("eats foods");

    }
    abstract void walks();
}
class Pig extends Animals{
    void walks(){
        System.out.println("walks in four legs");
    }
}
class Hen extends Animals{
    void walks(){
        System.out.println("walks in two legs");
    }
}