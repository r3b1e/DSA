//  class A{
//          int i,j;
//         A(int a,int b){
//             void display(){
//                 System.out.println("i="+i "j="+j);
//             }

//          }
//  }
//  class B extends A{
//             int k;
//             B(int a,int b,int c){
//                 super(a,b);
//                 k=c;
//             }
//             void display(){
//                 System.out.println("k=:"+k);
//             }
        
//  }
//  public class  override{
//     public static void main(String[] args) {
//         B b=new B(10,20,30);
//         b.display();
//     }
//  }
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void display() {
        System.out.println("i=" + i + " j=" + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    
    void display() {
        super.display();
        System.out.println("k=" + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B b = new B(4, 10, 9);
        b.display();
    }
}
