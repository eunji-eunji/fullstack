#include <stdio.h>

int main() {
    int arr[5];
    for(int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    int max = 0;
    for(int i = 0; i < 5; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }

    printf("%d", max);
    return 0;
}