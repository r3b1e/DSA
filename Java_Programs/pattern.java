import javax.swing.JApplet;

public class pattern {
    public static void main(String[]args){
        int a=1;
       for(int i=1;i<=7;i++){
        a=i;
          for(int j=1;j<=i;j++){
            System.out.print(a);
            a--;
            
          }
          System.out.println();
       }
    }
}
