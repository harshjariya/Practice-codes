// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4


#include<stdio.h>
void main(){
    int i,j,k;
    int n;
    printf("Enter n:");
    scanf("%d",&n);
    int arr[(n*2)-1][(n*2)-1];
int start=0,end=(n*2)-2;
int count=n;
int p=0,q=0;
    for(i=1;i<=n;i++){
        for(j=p;j<((n*2)-1)-q;j++){
            for(k=p;k<((n*2)-1)-q;k++){
                if(k==start || k==end || j==start || j==end){
                    arr[j][k]=count;
                }
            }
            
        }
        p++;
        q++;
        start++;
        end--;
        count--;
        
    }
     for(i=0;i<(n*2)-1;i++){
        for(j=0;j<(n*2)-1;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}