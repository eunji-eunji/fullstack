#include <stdio.h>
#include <string.h>

int main() {
    char s[100];
    int length;
    char temp;
    printf("문자열 입력: ");
    scanf("%s", s);
    length = strlen(s);
    printf("문자 개수: %d\n", length);
    // 양쪽 끝에서 가운데로 이동하며 문자 교환
    for(int i = 0; i < length/2; i++){
        temp = s[i];
        s[i] = s[length-i-1];
        s[length-i-1] = temp;
    }
    printf("바뀐 문자열: %s", s);
    return 0;
}