#include<stdio.h>
int febo(int n){
    if(n==0)return 0;
    if(n==1)return 1;
    int result=febo(n-1)+febo(n-2);
    return result;
}
int main(){
    printf("series is:%d",febo(5));
    return 0;
}