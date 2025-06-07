import java.util.*;
class Exp_1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Salary : ");
    int val = sc.nextInt();
    System.out.println("Enter Name of the Employee");
    String neme = sc.next();
    double HRA = (val*10)/100;
    double DA = (val*73)/100;
    double GS = val+DA+HRA;
    double incometax = (GS*30)/100;
    double net = GS - incometax;
    System.out.println("Name of the Emp:"+neme+"\nHRA:"+HRA+"\nDA:"+DA+"\nGS:"+GS+"\nincometax"+incometax+"NET Salary:"+net);
    }
}