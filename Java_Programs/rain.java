public class rain {
    public static void main(String args[]){
        {
            int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
            int n=height.length;
            int totalrainwater=0;
            int rainwater;
            int leftmax[]=new int[n];
            int rightmax[]=new int[n];
            leftmax[0]=height[0];
            for(int i=1;i<n;i++){
                leftmax[i]=(height[i]>=leftmax[i-1]?height[i]:leftmax[i-1]);
                System.out.print(" "+leftmax[i]);
            }
            rightmax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
              rightmax[i]=(rightmax[i+1]>=height[i]?height[i]:leftmax[i+1]);
              System.out.print("> "+rightmax[i]);
            }
            for(int i=0;i<n;i++){
                int min=(leftmax[i]<=rightmax[i]?leftmax[i]:rightmax[i]);
                rainwater=min-height[i];
                
                totalrainwater+=(rainwater>0?rainwater:0);
            }
           System.out.println("*"+totalrainwater);
        }
    }
}
