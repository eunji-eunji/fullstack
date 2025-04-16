#include <iostream>
#include <list>
using namespace std;

int main() {
    list<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    // cars[0] = "aaa"; -> list는 안됨. vector는 됨
    // cars.at(0) = "aaa";  -> list는 안됨. vector는 됨
    cars.front() = "Opel";
    cars.back() = "Toyota";
    cout << cars.front() << "\n";   
    cout << cars.back() << "\n";
    
    return 0;
}