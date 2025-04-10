#include <stdio.h>

int main() {
    FILE *fptr; // 기본적인 데이터 유형. 사용하려면 포인터 변수 fptr 사용
    fptr = fopen("d:\\student\\open.txt", "r"); // 파일 읽기
    char myString[100];
    fgets(myString, 100, fptr);
    // myString 배열에 저장. myString 크기(100)와 일치해야 함.
    // fptr : 파일을 읽는데 사용되는 파일 포인터
    printf("%s", myString);
    fclose(fptr);
    return 0;
}