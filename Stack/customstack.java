public class customstack{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4, 5},
                        {5,6,7,8,5},
                        {9,10,11,12,41},
                    {13,14,15,16,6},
                     {4,5,2,6,8,}};
       for(int i = 0;i<arr.length-1;i++){
        for(int j = i+1;j<arr[0].length;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
       }
       for(int row[] : arr){
        for(int col : row){
            System.out.print(" "+col);
        }
        System.out.println();
       }
       sortstring("sunny");
    }
    public static void sortstring(String str){
        for(int i=1;i<str.length();i++){
            // char ch = str.charAt(i);
            int j=i;
           while(j>0 && str.charAt(j)>str.charAt(j-1)){
                char temp = str.charAt(j);
                str.charAt(j) = str.charAt(j-1);
                str.charAt(j-1) = temp;
                j--;
           }
        }
        System.out.println(str);
    }
}