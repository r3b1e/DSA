
public class print {
    public static int number(int arr[],int target, int i){
        if(i==(arr.length)){
           return -1;
        }
        int isprime=number(arr ,target ,i+1);
        if(isprime==-1 && arr[i]==target){
            return i;
        }
        return isprime;
    }
    public static int xraisey(int x,int y){
        if(y==0){
            return 1;
        }
        
          int value=xraisey(x,y/2)*xraisey(x,y/2);
          if(y%2 != 0){
            value=x*value;
          }
        

        return value;
    }
    public static void main(String[] args) {
        // int arr[]={4,5,4,8,9,7,5,8};
        // int a=number(arr,5,0);
        System.out.println(xraisey(2,10));
    }
}
