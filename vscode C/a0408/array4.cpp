#include <stdio.h>

int main(){
    int mynumbers[] ={0,25,50,75,100};
    printf("%lu\n", sizeof(mynumbers));

    printf("배열 개수: %d\n", sizeof(mynumbers)/sizeof(mynumbers[0]));



    return 0;
}
//  int = 4byte 사용
// lu : unsigned Long