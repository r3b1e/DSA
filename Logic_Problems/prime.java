public class prime {
    public static void main(String[] args) {
        int n =10000;
//        for(int i= 0;i<=n;i++){
//            System.out.println(i+" -"+primeNo(i));
//        }
//        printno(n, new boolean[n+1]);
        double pre = 1;
        double result = 0;
        for(int i=1;i<5;i++){
            while(result*result <= n){
                result+=pre;
            }
            result-=pre;
            pre/=10;
        }
        System.out.printf("%.3f", result);
    }
    public static boolean primeNo(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
    public static void printno(int n, boolean[] isntit){
        int num = (int)Math.sqrt(n);
        for(int i=2;i<=num;i++){
            for(int j = i*2;j<=n;j+=i){
                isntit[j] = true;
            }
        }
        for(int i =2;i<isntit.length;i++){
            if(!isntit[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static int squre(int n, int st, int ed){
        int mid = st+((ed-st)/2);
        if(st>=ed){
            return mid;
        }
        if(mid*mid == n){
            return mid;
        }
        if(mid*mid > n){
           return squre(n, st, mid-1);
        }
        else{
            return squre(n,mid+1, ed);
        }
    }
}
