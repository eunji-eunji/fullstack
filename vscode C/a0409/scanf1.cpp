#include <stdio.h>

int main() {
    int mynum;
    printf("Type a number and press enter: ");
    scanf("%d", &mynum);    
    printf("Your number is: %d", mynum);
    return 0;       
}
// & : 주소를 통해 값을 저장
// %lf : 실수입력. double