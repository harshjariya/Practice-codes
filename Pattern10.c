#include<stdio.h>
void main(){
    int i,j;
    int n;
    printf("Enter n:");
    scanf("%d",&n);

    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0||i==n-1){
                printf("* ");
            }else if(j==i || j==n-i-1){
                printf("* ");

            }else{
                printf("  ");
            }
        }
        printf("\n");
    }
}