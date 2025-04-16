#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};

    cout << cars.at(1) << "\n";   // 첫 번째 요소
    cout << cars.at(2) << "\n";    // 두 번째 요소
    cout << cars.at(6) << "\n";    // 오류 있을 때 이름 알려줌. 얘를 더 선호
    return 0;
}