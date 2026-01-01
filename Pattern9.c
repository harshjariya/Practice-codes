// 1
// 2 5
// 3 6 8
// 4 7 9 10

#include<stdio.h>
void main(){
    int i,j;
    int n;
    printf("Enter n: ");
    scanf("%d",&n);

    
    for(i=1;i<=n;i++){
      
        int max=i;
        int sum=1;
            for(j=1;j<=max;j++){
            if(j!=1 || j!=max){
                printf("* ");
                sum=sum+1;
            }else{
                printf("%d ",j);
                sum=sum+1;
            }
        
        for(j=2;j<=max;j++){
            if(j!=max){
                printf("* ");
                sum=sum+1;
            }else{
                sum=sum+1;
                printf("%d ",sum);
            }
        }
        printf("\n");
    }
}
}