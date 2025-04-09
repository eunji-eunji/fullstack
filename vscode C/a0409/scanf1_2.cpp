#include <stdio.h>

int main()
{
    // Create a string
    char firstName[30];

    // Ask the user to input some text (name)
    printf("Enter your first name and press enter: \n");

    // Get and save the text
    scanf("%s", firstName); // 배열은 배열 자체가 주소이므로 & 쓰지 않아도 된다.

    // Output the text
    printf("Hello %s", firstName);

    return 0;
}
