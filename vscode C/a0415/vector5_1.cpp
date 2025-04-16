#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    cars.pop_back();   // 맨 뒤에 지움
    
    for(string car : cars){
        cout << car << "\n"; 
    }
    cout << cars.size() << "\n";    // size() : 벡터의 크기
    cout << cars.empty() << "\n";    // 비어 있으면 1(true)

    return 0;
}