#include<stdio.h>
int main(){
    int n;
    int fact;
    float series=0.0;
    printf("Enter value of n:");
    scanf("%d",&n);
    fact=1;
    for(int i=1;i<=n;i++){
       
           fact*=i;
        
      series+=1.0/(fact);
    }
    printf("Value of an series:%2f",series);
    return 0;
}