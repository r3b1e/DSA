import java.util.*;
public class inheritance {
    public static void main(String[]args){
        Fish f1=new Fish();
        f1.seteat();
    }
    
}
class Animal{
    void seteat(){
        System.out.println("eat");
    }
}
class Fish extends Animal{
    int fins;
}