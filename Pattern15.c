// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25

#include<stdio.h>
void main(){
    int i,j;
    int n;
    printf("Enter n:");
    scanf("%d",&n);
int count=0;
    for(i=1;i<=n;i++){
        
        if(i%2==0){
            for(j=1;j<=n;j++){
                
                printf("%d ",count);
                count--;
            }
            count=count+5;
        }else{
            for(j=1;j<=n;j++){
                count++;
                printf("%d ",count);
                
            }
                count=count+5;
        }
        
        
        
        printf("\n");
    }
}