import java.util.ArrayList;
import java.util.Arrays;

public class mergeofanarray {
    public static void main(String[] args) {
        int a[]={1,3,5,8};
        int b[]={4,6,9,10};
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<a.length && j<b.length){
               if(a[i] < b[j]){
                list.add(a[i]);
                i++;
               }
               else{
                list.add(b[j]);
                j++;
               }
        }
        while(i<a.length){
            list.add(a[i]);
            i++;
        }
        while(j<b.length){
            list.add(b[j]);
            j++;
        }
        System.out.println(list);
    }
}
