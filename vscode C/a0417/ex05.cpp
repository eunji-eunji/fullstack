#include <iostream>
using namespace std;

class Calculator {
    public:
    int plus(int a, int b){
       return a + b; 
    }
    int minus(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    double divide(int a, int b) {
        if(b == 0){
            cerr << "Error: division by zero!" << endl;
            return 0;
        }
        return (double)a / b;
    }
};

int main() {
    int a, b;
    int menu;
    Calculator c;
    while(true) {
        cout << "1.덧셈\n2.뺄셈\n3.곱셈\n4.나눗셈\n0.종료\n";
        cout << "메뉴 입력: ";
        cin >> menu;
        if(menu == 0) {
            cout << "프로그램 종료" << endl;
            return 0;
        }
        cout << "두 수 입력: ";
        cin >> a >> b;

        switch (menu) {
            case 1:
                cout << c.plus(a, b) << endl;
                break;
            case 2:
                cout << c.minus(a, b) << endl;
                break;
            case 3:
                cout << c.multiply(a, b) << endl;
                break;
            case 4:
                cout << c.divide(a, b) << endl;
                break;
            default:
                cerr << "Error: Invalid Operation!" << endl;
                break;
        }
    }
    return 0;
}