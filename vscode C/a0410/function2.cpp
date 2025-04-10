#include <stdio.h>

void myFunction(char name[], int age){
    printf("Hello %s, I'm %d\n", name, age);
}

int main() {
    myFunction("Liam", 3);
    myFunction("John", 14);
    myFunction("Harry", 23);
    return 0;
}