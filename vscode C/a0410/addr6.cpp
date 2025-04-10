#include <stdio.h>

int main() {
    int myNumbers[4] = {25, 50, 75, 100};
    int i;
    
    for (i = 0; i < 4; i++) {
      printf("%p\n", &myNumbers[i]);
    }

    // int가 4byte이므로, 각 메모리의 주소의 마지막 숫자는 4씩 더해진다.

    return 0;
}