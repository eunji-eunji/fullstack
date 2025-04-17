#include <stdio.h>

int main () {
    int arr[5];
    for(int i = 0; i < 5; i++){
        printf("arr[%d] 숫자를 입력하세요. ", i);
        scanf("%d", &arr[i]);
    }

    int max = arr[0];
    for(int i = 0; i < 5; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    printf("가장 큰 수는 %d입니다.", max);
    return 0;
}