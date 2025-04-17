#include <iostream>
using namespace std;

class Animal {
    public:
    void sound() {
        cout << "동물소리\n";
    }
};

class Dog : public Animal {
    public:
    void sound() {
        cout << "멍멍!\n";
    }
};

int main() {
    Dog dog;
    dog.sound();

    return 0;
}