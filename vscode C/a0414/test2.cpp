#include <iostream>
#include <string>
using namespace std;

// ✅ 문제 2⃣
// Car 클래스를 만들고

// modelName과 speed 속성,

// speedUp() / speedDown() 함수를 만들어 속도를 조절하세요.

class Car{
    public:
        string modelName;
        int speed;
        
    Car(string t, int p);

    void speedUp(int i){
        speed += i;
    }
    void speedDown(int i) {
        speed -= i;
    }
};

Car::Car(string t, int p){
    modelName = t;
    speed = p;
}

int main() {
    Car car("sonata", 80);
    cout << "name: " << car.modelName << " speed: "<< car.speed << "\n";
    car.speedUp(20);
    cout << "name: " << car.modelName << " speed: "<< car.speed << "\n";
    car.speedDown(50);
    cout << "name: " << car.modelName << " speed: "<< car.speed << "\n";
    return 0;
}
