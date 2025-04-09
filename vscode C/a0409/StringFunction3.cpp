#include <stdio.h>
#include <string.h>

int main() {
    char str1[20] = "Hello World!";
    char str2[20];
    strcpy(str2, str1); // str2에 str1을 복사
    printf("%s\n", str2); // Hello World!

    return 0;
}