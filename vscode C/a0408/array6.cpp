#include <stdio.h>

int main()
{
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
    float avg, sum = 0;
    int min=ages[0];
    int length = sizeof(ages) / sizeof(ages[0]);
    int i;
    for (i = 0; i < length; i++)
    {
        if(ages[i]<min){
            min=ages[i];
        }
    }
    // avg = sum / length;
    // printf("sum: %.0f\navg: %.2f\n", sum, avg);
    printf("min: %d", min);

    return 0;
}