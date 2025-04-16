#include <iostream>
#include <list>
using namespace std;

int main() {
    list<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars.pop_front();   // 맨 앞에 삭제
    cars.pop_back();  // 맨 뒤에 삭제
    for(string car : cars){
        cout << car << "\n";
    }
    return 0;
}