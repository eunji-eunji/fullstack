#include <stdio.h>

class Factorial {
    public:
        int fac(int a) {
            int result = 1;
            for(int i = a; i > 0; i--) {
                result = result * i;
            }
            return result;
        }
};

int main() {
    int a;
    printf("정수를 입력하세요. ");
    scanf("%d", &a);
    Factorial factorial;
    printf("%d 팩토리얼은 %d입니다.", a, factorial.fac(a));

    return 0;
}