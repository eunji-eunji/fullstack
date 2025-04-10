#include <stdio.h>

void cal();

// 절차지향적 (차례대로 읽어서 컴파일)
// main이 위에 있을 경우 못 읽음
// 맨 위에 이런 함수가 있다고 선언을 먼저 해주면 가능
int main() {
    cal();
    return 0;
}

void cal() {
    int x = 22;
    printf("%d\n", x);
}
