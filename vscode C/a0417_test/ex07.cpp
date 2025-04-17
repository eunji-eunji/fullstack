#include <iostream>
using namespace std;

class Car {
    public:
    int speed;
    string color;
};

int main() {
    Car morning;
    morning.speed = 80;
    morning.color = "white";

    cout << "모닝의 속도는 " << morning.speed << "이고, 색상은 " << morning.color << "입니다.\n";

    return 0;
}