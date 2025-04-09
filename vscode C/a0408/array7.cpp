#include <stdio.h>

int main()
{
    int matrix[2][3]={
        {1,4,2},
        {3,6,8}
    };
    matrix[0][0]=9; //수정 가능
    printf("%d", matrix[0][0]);

    return 0;
}