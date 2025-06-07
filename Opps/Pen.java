import java.util.*;
public class Pen {
    public static void main(String[]args){
        Pencil p1=new Pencil();
        p1.setcolor("Blue");
        p1.settip(5);
        System.out.println(p1.getcolour());
        System.out.println(p1.gettip()); 
        Employee e1=new Employee();
        e1.setname("Raghav");
        e1.setsalary(11000);
        // el.setid(5);
        System.out.println(e1.salary +"\n"+  e1.name);
        e1.name="pranav";//e1.satname("pranav");
        System.out.println(e1.salary +"\n"+  e1.name);
        Myacc m1=new Myacc();
        m1.name="sunny";
        m1.setpass("jai");
        System.out.println(m1.name);
        }
}
class Pencil{
   private int tip;
   private String colour;
    String getcolour(){
        return this.colour;
    }
   int gettip(){
        return this.tip;
    }
    void setcolor(String newcolour){
        colour=newcolour;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
class Employee{
    String name;
    int salary;
    int id;
    void setname(String newname){
        name=newname;
    }
    void setid(int newid){
      id=newid;
    }
    void setsalary(int newsalary){
        salary=newsalary;
    }
}
class Myacc{
    public String name;
    private String pass;
    void setpass(String ps){
        pass=ps;
    }

}
