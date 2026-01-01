//       1 
//     2 1 2
//   3 2 1 2 3
// 4 3 2 1 2 3 4
//   3 2 1 2 3
//     2 1 2
//       1

#include<stdio.h>
void main(){
    int i,j;
    int n;
    printf("Enter n:");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        for(j=n-i;j>0;j--){
            printf("  ");
        }
        for(j=i;j>0;j--){
            printf("%d ",j);
        }
        if(i>=2){
            for(j=2;j<=i;j++){
                printf("%d ",j);
            }
        }
        
        printf("\n");
    }
    for(i=1;i<n;i++){
        for(j=i;j>0;j--){
            printf("  ");
        }
        for(j=n-i;j>0;j--){
            printf("%d ",j);
        }
        for(j=2;j<=n-i;j++){
            printf("%d ",j);
        }
        printf("\n");
    }
}