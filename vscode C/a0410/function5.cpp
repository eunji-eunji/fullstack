#include <stdio.h>

int myFunction(int a, int b) {
    return a + b;
}

int main() {
    printf("결과 값은: %d\n", myFunction(3, 7));
    return 0;
}