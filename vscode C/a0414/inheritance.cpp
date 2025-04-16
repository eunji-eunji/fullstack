#include <iostream>
#include <string>
using namespace std;

class Vehicle{
    public:
        string brand="Ford";
        void honk() {
            cout << "Tuut, tuut! \n";
        }
};

// Car가 Vehicle을 상속 받음
class Car: public Vehicle{ 
    public:
        string model = "Mustang";
};

int main(){
    Car car;
    car.honk();
    cout << car.brand + " " + car.model;
    return 0;
}