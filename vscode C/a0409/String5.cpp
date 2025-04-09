#include <stdio.h>

int main()
{
    char greetings[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\0'};
    char greetings2[] = "Hello World!";
    printf("%lu\n", sizeof(greetings)); //char : 1byte
    printf("%lu\n", sizeof(greetings2));    // \0 : null 문자. null 문자 포함해서 저장됨
    return 0;
}