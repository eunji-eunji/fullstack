#include <stdio.h>

int main(){
    char carName[] = "Volvo";
    int length=sizeof(carName)/sizeof(carName[0]);
    for(int i = 0; i < length; i++) {
    printf("%c", carName[i]);
    }
    return 0;
}