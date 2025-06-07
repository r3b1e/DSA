public class functionoverloding {
    void area(int i){
        int a=i*i;
        System.out.println("area of square is :"+ a);
    }
    void area(int i,int j){
        int a1=i*j;
        System.out.println("area of rectangle:"+ a1);
    }
    void area(float r){
        double a2=3.14*r*r;
        System.out.println("area of circle:"+ a2);
    }
    
}
class over{
    public static void main(String[] args){
        area a=new area();
        a.area(10);
        a.area((float)7.2);
        a.area(7,10);
    }
    
}
