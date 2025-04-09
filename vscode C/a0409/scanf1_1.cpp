#include <stdio.h>

int main() {
    int mynum;
    char myChar;
    printf("Type a number and press enter: ");
    scanf("%d %c", &mynum, &myChar);    
    printf("Your number is: %d\n", mynum);
    printf("Your character is: %c", myChar);

    return 0;       
}
// & : 주소를 통해 값을 저장
// %lf : 실수입력. double