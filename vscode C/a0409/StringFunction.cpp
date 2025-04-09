#include <stdio.h>
#include <string.h>

int main() {
    char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    printf("%d\n", strlen(alphabet)); //26
    printf("%d", sizeof(alphabet)); //27    -> null 문자 포함

    return 0;
}