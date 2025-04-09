#include <stdio.h>

int main()
{
    float mynum = 19.99;
    printf("%.2f\n", mynum);    //소수점 아래 2자리
    printf("%.1f\n", mynum);    //소수점 아래 1자리(반올림)
    printf("%10.2f\n", mynum);  //전체 너비 10칸, 소수점 두자리
}