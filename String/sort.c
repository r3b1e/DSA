#include<stdio.h>
#include<conio.h>
int main(){
    int arr[]={1,2,7,4,5};
    for(int i=0;i<4;i++){
        for(int j=i+1;j<5;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int k=0;k<5;k++){
        printf("%d",arr[k]);
    }

}