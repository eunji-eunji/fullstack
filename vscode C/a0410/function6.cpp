#include <stdio.h>

int cal(int a, int b) {
    return a + b;
}

int main() {
    int result1 = cal(3, 6);
    printf("결과 값은: %d\n", result1);
    return 0;
}