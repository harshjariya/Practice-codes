#include<stdio.h>

void main(){
    int arr[] = {2,34,4,6,67,9};
    int temp=arr[0];
    for(int i=1;i<6;i++){
        
            if(arr[i]>temp){
              temp = arr[i];
            
        }
    }
    printf("%d",temp);
}