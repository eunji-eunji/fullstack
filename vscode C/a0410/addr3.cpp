#include <stdio.h>

int main() {
    int myage = 43;
    int *ptr = &myage;  // 역참조
    printf("%d\n", myage);  // 43
    printf("%p\n", &myage); // 주소
    printf("%p\n", &ptr);   // 포인터 변수 ptr의 주소
    printf("%p\n", ptr);   // 포인터 변수 ptr의 주소

    return 0;
}