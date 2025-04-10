#include <stdio.h>

int main() {
    FILE *fptr; // 기본적인 데이터 유형. 사용하려면 포인터 변수 fptr 사용
    fptr = fopen("d:\\student\\open.txt", "w"); // 파일 생성
    fprintf(fptr, "some text");
    fclose(fptr);
    return 0;
}