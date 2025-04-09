#include <stdio.h>

int main(){
    int mynumbers[] ={25,50,75,100};
    mynumbers[0]=2;
    printf("%d\n", mynumbers[0]);

    for(int i=0;i<4;i++){
        printf("%d ",mynumbers[i]);
    }
    return 0;
}