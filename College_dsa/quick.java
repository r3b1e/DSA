import java.util.*;
public class quick {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(str);
    int x=0;
    int y=0;
    for(int i=0;i<str.length();i++){
     switch(str.charAt(i)){
        case 'E':x++;
        break;
        case 'W':x--;
        break;
        case 'N':y++;
        break;
        case 'S':y--;
        break;
        default:System.out.println("no thing");
     }
    }
    int sum=x*x+y*y;
    float dis=Math.sqrt(sum);
    System.out.println(dis);
}
}
