public class tic {
    public static void main(String[]args){
         Student s1=new Student();
         System.out.println(s1.name);
         System.out.println(s1.rno);
         s1.count=3;
         s1.coun();
         System.out.println(Student.count);
         s1.coun();
         System.out.println(s1.count);
         Student s2=new Student();
         System.out.println(s2.count);
         

    }
}
class Student{
    int rno;
    String name;
    static int count;
    static{
      count =5;
    }
    Student(){
      this (43,"sunny");
      this.name="rohan";
      this.rno=21;
    }
    Student(int rno,String name){
      this.rno=rno;
      this.name=name;
    }
    void coun(){
        count++;
        System.out.println("count is"+count);
    }
}

