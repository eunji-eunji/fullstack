#include <stdio.h>

int main() {
    int myNumbers[4] = {25, 50, 75, 100};
    int i;
    
    printf("%d\n", myNumbers);  // 주소
    printf("%d\n", *myNumbers); // 값
    printf("%d\n", *(myNumbers+1)); // 값
    printf("%d\n", *(myNumbers+2)); // 값

    // int가 4byte이므로, 각 메모리의 주소의 마지막 숫자는 4씩 더해진다.

    return 0;
}