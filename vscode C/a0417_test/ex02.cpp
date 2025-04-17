#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);

    if(a % 2 == 0){
        printf("%d은(는) 짝수입니다.\n", a);
    } else {
        printf("%d은(는) 홀수입니다.\n", a);
    }

    return 0;
}