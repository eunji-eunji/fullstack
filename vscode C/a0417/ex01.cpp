#include <stdio.h>

int main () {
    // 1.
    int num;
    int sum = 0;
    printf("정수를 입력하세요 :");
    scanf("%d", &num);
    
    if(num < 0){
        printf("양의 정수를 입력하세요.\n");
        return 1;   // 0이외의 숫자 : 실패
    }
    while(num > 0) {    // 12345 -> 1234 -> 123 -> 12 -> 1
        sum = sum + (num % 10); // 5 -> 4 -> 3 -> 2 -> 1
        num = num / 10; // 1234 -> 123 -> 12 -> 1 -> 0
    }
    printf("sum : %d", sum);
    return 0;
}