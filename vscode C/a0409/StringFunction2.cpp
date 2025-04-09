#include <stdio.h>
#include <string.h>

int main() {
    char str1[20] = "Hello ";
    char str2[] = "World!";
    strcat(str1, str2); // str1에 str2를 더함
    printf("%s\n", str1); // Hello World!

    return 0;
}