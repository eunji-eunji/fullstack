#include <iostream>
using namespace std;

void factorial(int a){  
    int fac = 1;
    for(int i = a; i > 0; i--){
        fac = fac * i;  
    }
    cout << fac;
}

int main() {
    int a;
    cin >> a;
    factorial(a);

    return 0;
}
