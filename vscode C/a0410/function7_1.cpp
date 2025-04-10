#include <stdio.h>

int x = 5;
void cal() {
    printf("%d\n", x);
}

int main() {
    cal();
    printf("%d\n", x);
    return 0;
}