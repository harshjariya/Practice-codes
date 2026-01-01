// 1
// 1 2 1
// 1 * 3 * 1
// 1 * * 4 * * 1
// 1 * * * 5 * * * 1
// 1 * * * * 6 * * * *


#include<stdio.h>
void main(){
    int i,j;
    int n;
    printf("Enter n:");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        int count=1;
        for(j=1;j<=(2*i)-1;j++){

            if(j<i){
                if(j==1){
                    
                    printf("%d",count);
                    
                }
                else{
                    printf("*");
                }
                count++;
            }
            else{
                if(j==(2*i)-1 || j==i){
                    
                    printf("%d",count);
                       
                }
                else{
                    printf("*");
                }
                count--;
            }
        }
        
        
        printf("\n");
    }
}