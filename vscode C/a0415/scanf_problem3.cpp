#include <stdio.h>


void factorial(int a){  
    int fac = 1;
    for(int i = a; i > 0; i--){
        fac = fac * i;  
    }
    printf("%d", fac);
}

int main() {
    int a;
    scanf("%d", &a);
    factorial(a);

    return 0;
}
