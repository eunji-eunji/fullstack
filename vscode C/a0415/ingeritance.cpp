#include <iostream>
#include <string>
using namespace std;

class Animal {
    public:
    void sort() {
        cout << "동물" << "\n";
    }
};

class Dog : public Animal{
    public:
    void sound() {
        cout << "왈왈" << "\n";
    }
};

class Cat : public Animal {
    public:
    void sound() {
        cout << "야옹" << "\n";
    }
};

int main() {
    Dog dog;
    Cat cat;
    dog.sort();
    dog.sound();
    cat.sort();
    cat.sound();

    return 0;
}