#include<stdio.h>
int main(){
    int n;
    int rem;
    int amst=0;
    printf("enter value three digit no:");
    scanf("%d",&n);
    int x=n;
    while(n!=0){
      rem=n%10;
      amst+=rem*rem*rem;
      n/=10;
    }
    printf("%d",amst);
    if(x==amst){
        printf("\nit is an amstrong no");
    }
    else{
        printf("\nit is not a amstrong no");
    }
    return 0;
}