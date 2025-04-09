#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "Hello";
    char str2[] = "Hello";
    char str3[] = "Hi";

    printf("%d\n", strcmp(str1,str2)); // 0 -> 일치
    printf("%d\n", strcmp(str1,str3)); // -1 -> 불일치

    return 0;
}