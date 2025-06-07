#include<stdio.h>
int main(){
    int n=153;
    int sum=0;
    do{
        int rem=n%10;
        sum=sum+rem*rem*rem;
        n=n/10;
    }while(n!=0);
    printf("%d",sum);
    return 0;
}