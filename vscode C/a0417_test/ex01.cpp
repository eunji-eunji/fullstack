#include <stdio.h>

class Calculator {
    public:
    int plus(int a, int b) {
        return a + b;
    }
    int minus(int a, int b) {
        return a - b;
    }
    int multifly(int a, int b) {
        return a * b;
    }
    int divide(int a,  int b) {
        if(b == 0) {
            printf("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / b;
    }
    int margin(int a, int b) {
        return a % b;
    }
};

int main() {
    Calculator cal;
    int a, b;
    printf("두 개의 정수를 입력하세요.\n");
    scanf("%d %d", &a, &b);
    char c;
    printf("연산자를 입력하세요 : ");
    scanf(" %c", &c);
    int result;

    switch (c) {
    case '+':
        result = cal.plus(a, b);
        break;
    case '-':
        result = cal.minus(a, b);
        break;
    case '*':
        result = cal.multifly(a, b);
        break;
    case '/':   // 몫
        result = cal.divide(a, b);
        break;
    case '%':   // 나머지
        result = cal.margin(a, b);
        break;
    default:
        printf("올바른 연산자를 입력하세요.\n");
        return 1;
    }
    printf("%d %c %d = %d", a, c, b, result);
    return 0;
}