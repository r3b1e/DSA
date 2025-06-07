#include<stdio.h>
int main(){
    int n,m;
    printf("Enter rows of the matrix:");
    scanf("%d",&m);
    printf("\nEnter column of the matrix");
    scanf("%d",&n);
    int a[m][n];
    int b[m][n];
    printf("\nElement of an matrix:");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        scanf("%d",&a[i][j]);
      }
    }
    printf("\nyour matrix is:\n");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        printf("%d ",a[i][j]);
      }
      printf("\n");
    }
    printf("Transpose of an matrix:\n");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        b[i][j]=a[j][i];
        printf("%d ",b[i][j]);
      }
      printf("\n");
    }

    
    return 0;
}