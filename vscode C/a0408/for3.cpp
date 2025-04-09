#include <stdio.h>

int main()
{
    // 2의 거듭제곱에서 512까지 거듭제곱을 출력해보세요.
    for (int i = 2; i <= 512; i=2*i)
    {
         printf("%d\n", i);

    }
    return 0;
}