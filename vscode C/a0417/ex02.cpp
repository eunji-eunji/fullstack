#include <stdio.h>
#include <limits.h>

int main () {
    // 2.
    int arr[10] = {5, 12, 8, 3, 15, 7, 9, 20, 1, 18};
    int sum2 = 0;
    double avg;
    // int max = arr[0];
    int max = INT_MIN;  // INT_MIN(상수) : -2148483648. 정수로 표현할 수 있는 최솟값
    // int min = arr[0];   
    int min = INT_MAX;   // INT_MAX(상수) : 2148483648. 정수로 표현할 수 있는 최댓값

    for(int i = 0; i < 10; i++){
        sum2 += arr[i];
        if(arr[i] > max) {
            max = arr[i];
        }
        if(arr[i] < min) {
            min = arr[i];
        }
    }
    avg = (double)sum2 / 10;
    printf("%.2f, %d, %d\n", avg, max, min );
    return 0;
}