#include<stdio.h>
void bubble(int arr[], int n);
void selection(int arr[], int n);
void insertion(int arr[], int n);
void combine(int arr[], int st, int mid, int ed);
void merge(int arr[], int s, int e);
int main(){
    int arr[] = {3,4,5,0,6,1,2,8};
    
    int n = 7;
    // combine(arr, 3, 0, 6);
    merge(arr, 0, 6);
//    insertion(arr, n);
    for(int i=0;i<7;i++){
        printf("%d ", arr[i]);
    }
    return 0;
}
void bubble(int arr[], int n){
    int i, j;
    for(i = 0; i < n-1; i++){
        for(j = 0; j < n-i-1; j++){
            if(arr[j] > arr[j+1]){
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
void selection(int arr[], int n){
    int i, j;
    for(i=0;i<n-1;i++){
        int max = i;
        for(j=i+1;j<n;j++){
            max = ((arr[max]<arr[j])?max:j);
        }
        int temp = arr[max];
        arr[max] = arr[i];
        arr[i] = temp;
    }
}
void insertion(int arr[], int n){
    int i, j;
    for(i=1;i<n;i++){
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
void merge(int arr[], int s, int e) {
    if (s >= e) {
        return;  // Base case: single element or invalid range
    }
    int mid = s + (e - s) / 2;  // Calculate the mid point
    merge(arr, s, mid);  // Recursive call for the first half
    merge(arr, mid + 1, e);  // Recursive call for the second half
    combine(arr, mid, s, e);  // Merge the two halves
}

void combine(int arr[], int mid, int st, int ed){
    int i = st;
    int j = mid+1;
    int k = 0;
    int sz = ed-st+1;
    int mergearr[sz];
    while(i<=mid && j<=ed){
        if(arr[i]<arr[j]){
           mergearr[k++] = arr[i++];
        }
        else{
            mergearr[k++] = arr[j++];
        }
    }
    while(i<=mid){
        mergearr[k++] = arr[i++];
    }
    while(j<=ed){
        mergearr[k++] = arr[j++];
    }
    k = 0;
    for(int p = st;p<=ed;p++){
       arr[p] = mergearr[k++];
    }
}