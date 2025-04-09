#include <stdio.h>

int main()
{
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    float avg, sum = 0;
    int length = sizeof(ages) / sizeof(ages[0]);
    int i;
    for (i = 0; i < length; i++)
    {
        sum += ages[i];
    }
    avg = sum / length;

    printf("sum: %.0f\navg: %.2f\n", sum, avg);

    return 0;
}
//  int = 4byte 사용
// lu : unsigned Long