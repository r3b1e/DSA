import java.util.ArrayList;
import java.util.Arrays;
public class reverse {
    public static int number(int n ,int sum){
        if(n==0){
            return sum;
        }
        int num;
        num=n%10;
        sum=sum+num;
        return number(n/10,sum);
        
    }
    public static int sum(int n){
        if(n/10==0){
            return n;
        }
        return n%10*sum(n/10);
    }
    public static int divby2(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return divby2(n/2, ++count);
        }
        return divby2((n-1), ++count);
    }
    public static boolean sort(int arr[],int s){
        if(s==arr.length-1){
            return true;
        }
       if(arr[s]>arr[s+1]){
        return false;
       }
       return sort(arr,s+1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void bubble(int arr[] ,int target, int s){
        if(arr[s]==target){
            list.add(s);
        }
        if(s==arr.length-1){
             return;
        }
        bubble(arr,target,++s);
    }
    public static ArrayList<Integer> arraytolist(int arr[], int target, int s ){
        ArrayList<Integer> list=new ArrayList<>();
        if(arr[s]==target){
            list.add(s);
        }
        if(s==arr.length-1){
            return list;
        }
        ArrayList<Integer> temp=arraytolist(arr,target,s+1);
        list.addAll(temp);
        return list;
        
    }
    public static void pattern1(int r, int c){
        if(r==0){                
            return ;                    
        }
        if(r>c){
            pattern1(r, c+1);
            System.out.print("*");
        }
           else
            {
            pattern1(r-1, 0);
            System.out.println();}
        
        }
        public static void pattern2(int r, int c){
            if(r==0){                
                return ;                    
            }
            if(r>c){
                System.out.print("*");
                pattern2(r, c+1);
            }
               else
                {
                    System.out.println();
                pattern2(r-1, 0);
                }
            
            }
            public static void selection(int arr[], int r, int c, int max){
                if(r==0){
                    return;
                }
                if(r>c){
                    if(arr[max]<arr[c]){
                        selection(arr, r, c+1, c);
                    }
                    else{
                        selection(arr, r, c+1, max);
                    }
                }
                else {
                int temp=arr[max];
                arr[max]=arr[r-1];
                arr[r-1]=temp;
                selection(arr, r-1, 0, 0);}
            }
            public static void MergeSort(int[] arr, int s, int e){
                    if(e-s==1){
                        return;
                    }
                   int mid=(s + e)/2; 
                    MergeSort(arr, s, mid);
                    MergeSort(arr, mid, e);
                    Soring(arr, s, mid, e);

            }
            static void Soring(int[] arr, int s, int mid, int e){
                int arrt[]=new int[e-s];
                int i=s;
                int j=mid;
                int k=0;
                while(i<mid && j<e){
                    if(arr[i]<arr[j]){
                        arrt[k]=arr[i];
                        i++;
                    }
                    else{
                        arrt[k]=arr[j];
                        j++;
                    }
                    k++;
                }
                    while(i<mid){
                        arrt[k]=arr[i];
                        i++;
                        k++;
                    }
                    while(j<e){
                        arrt[k]=arr[j];
                        j++;
                        k++;
                    }
                    for(int l=0;l<(e-s);l++){
                        arr[s+l]=arrt[l];
                    }

                }
    
        public static void main(String[] args) {
        int arr1[]={1,2,8,4,6,5,4};
        int arr2[][]={{1,3,45,6},
                    {3,5,6,},
                    {3,45,6,3,4,0}};
                    MergeSort(arr1, 0, arr1.length);
          System.out.println(Arrays.toString(arr1));
           
    }
}
