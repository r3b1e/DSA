#include<stdio.h>
 int main(){

 int n=3,m=3;
 int a[10][10],b[10][10],c[10][10];
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        scanf("%d",a[i][j]);
    }
 }
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        scanf("%d",b[i][j]);
    }
 }
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        printf("%d",a[i][j]);
    }
    printf("\n");
    
 }
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        printf("%d",b[i][j]);
        c[i][j]=0;
    }
    printf("\n");
    
 }
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        for(int k=0;k<n;k++){
            c[i][j]+=a[i][k]*b[k][j];
        }
    }
 }
 for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        printf("%d",c[i][j]);
    }
    printf("\n");
    
 }
     return 0;
}