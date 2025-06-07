#include<stdio.h>
int main(){
    int m,n,x,y;
    printf("First Matrix");
    printf("\nEnter value of rows:");
    scanf("%d",&m);
    printf("Enter vaue of an column:");
    scanf("%d",&n);
    printf("Second Matrix");
    printf("\nEnter value of rows:");
    scanf("%d",&x);
    printf("Enter vaue of an column:");
    scanf("%d",&y);
    int a[m][n];
    int b[x][y];
    int c[m][y];
    printf("Enter Element of First Matrix:");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("Matrix of First:\n");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }   
     printf("Enter Element of Second Matrix:");
     for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            scanf("%d",&b[i][j]);
        }
    }
    printf("Matrix of second:\n");
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    } 
    for(int i=0;i<m;i++){
        for(int j=0;j<y;j++){
            c[i][j]=0;
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<y;j++){
            for(int k=0;k<n;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
    printf("Multiplication of tow matrix\n");
    for(int i=0;i<m;i++){
        for(int j=0;j<y;j++){
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
    return 0;
}