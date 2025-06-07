#include<stdio.h>
int swap(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
    printf("a=%d,b=%d",*a,*b);
    return 0;
}
int main(){
    int a=4,b=5;
     printf("a=%d,b=%d",a,b);
  swap(&a,&b);
  printf("a=%d,b=%d",a,b);
    return 0;
}