#include<stdio.h>
int main(){
    int n;
    printf("Enter no:");
    scanf("%d",&n);
    int x='A';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%c",(char)x);
           
        }
        x++;
        printf("\n");
        int y='B';
        printf("%c",(char)x);
    }
    return 0;
}