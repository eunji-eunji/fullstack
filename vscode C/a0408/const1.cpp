#include <stdio.h>

int main()
{
    const int myNum = 15; // const : 상수
    // myNum = 10;  //재할당 불가능

    // const int minutesPerHour;
    // minutesPerHour = 60;  안 됨

    const int minutesPerHour = 60;
    // const로 지정한 상수는 선언과 초기화 같이 해야 함
    printf("%d", myNum);
    return 0;
}