#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX 10
int arr[MAX];
int size=0;
int front = -1;
int rare = -1;
int isEmpty(){
   return front == MAX-1; 
}
int isFull(){
    return rare == MAX-1;
}
void Enque(int val){
   if(!isFull){
    if(rare == front){
        front = 0;
    }
   }
}
int main(){

}