#include <iostream>
#include <string>
using namespace std;

class Phone {
    public:
    string call;
    string back;
    string number;
    Phone(string c, string b, string n); 
};

Phone::Phone(string c, string b, string n) {
    call = c;
    back = b;
    number = n;
} 

class Animal {
    public:
    string fly;
    int age;
    Animal(string f, int a){
        fly = f;
        age = a;
    }
};

int main() {
    Phone p("받다","걸다","01012345678");
    cout << p.call << p.back << p.number;

    Animal bird("새", 23);
    cout << bird.fly << bird.age;
}