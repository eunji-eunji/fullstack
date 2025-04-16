#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars.push_back("렉서스");   // 맨 뒤에 추가
    cars.push_back("VW");   // 맨 뒤에 추가
    cars.push_back("Mini");   // 맨 뒤에 추가
    for(string car : cars){
        cout << car << "\n"; 
    }
    return 0;
}