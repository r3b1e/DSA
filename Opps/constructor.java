import java.util.*;
public class constructor {
    public static void main(String[]args){
    Student s1=new Student();
    s1.rollno = 21;
    s1.name = "sunny";
    s1.marks[0]=100;
    s1.marks[1]=98;
    s1.marks[2]=100;
    Student s2=new Student(s1);
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }

}
}
class Student{
    int rollno;
    String name;
    int marks[];
    Student(){

    }
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
    }
    // Student(String name){
    //     this.name=name;
    // }
    // Student(int rollno){
    //     this.rollno=rollno;
    // }

}
