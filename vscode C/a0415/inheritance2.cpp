#include <iostream>
#include <string>
using namespace std;

class Animal {
    public:
        void animalSound() {
            cout << "the animal makes a sound\n";
        }
};

// 다중 상속
class Pig: public Animal{ 
    public:
        void animalSound() {
            cout << "the pig says : wee wee\n";
        }
};

class Dog: public Animal{ 
    public:
        void animalSound() {
            cout << "the dog says : bow wow\n";
        }
};

int main(){
    Pig pig;
    Dog dog;
    Animal animal;
    animal.animalSound();
    pig.animalSound();
    dog.animalSound();
    return 0;
}