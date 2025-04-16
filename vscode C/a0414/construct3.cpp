#include <iostream>
#include <string>
using namespace std;

class Car {
public:
    string model;
    string brand;
    int year;
    Car(string x, string y, int z);
};

// 함수와 마찬가지로 생성자도 클래스 외부에 정의할 수 있다.
// 먼저 클래스 내부에 생성자를 선언해야 한다.
// 범위 결정, 클래스 이름, :: 연산자, 생성자 이름(클래스 이름과 동일)을 차례로 지정
Car::Car(string x, string y, int z) {
    brand = x;
    model = y;
    year = z;
}

int main() {
    Car car1("BMW", "X5", 1999);
    Car car2("Ford", "Mustang", 1986);
    cout << car1.brand << " " << car1.model << " " << car1.year << "년\n";
    cout << car2.brand << " " << car2.model << " " << car2.year << "년\n";

    return 0;
}