#include <stdio.h>

int main(){
    int mynumbers[4];
    
    for(int i=0;i<4;i++){
        mynumbers[i]=i;
        printf("%d ",mynumbers[i]);
    }
    return 0;
}