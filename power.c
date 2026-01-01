#include<stdio.h>

void main(){
    int n1=3,n2=3,result=1;
    for(int i=1;i<=n2;i++){
        int sum=0;
        for(int j=1;j<=n1;j++){
            
            sum = sum+result;
            
        }
        result=sum;
    }
    printf("%d",result);
}