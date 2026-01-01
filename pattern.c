#include<stdio.h>

void main(){
    int gap=3,n=5,num=1;
    
    for(int i=1;i<=n;i++){
        gap=n-1;
        for(int j=1;j<=i;j++){
            if(j==1){
                printf("%d",i);

            }
            else{
                printf("%d",gap+num);
                
            }
        }
    }
    
}