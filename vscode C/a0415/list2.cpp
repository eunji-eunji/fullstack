#include <iostream>
#include <list>
using namespace std;

int main() {
    list<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars.push_front("Tesla");   // 맨 앞에 추가
    cars.push_back("Genesis");  // 맨 뒤에 추가
    for(string car : cars){
        cout << car << "\n";
    }
    return 0;
}