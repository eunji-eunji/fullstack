#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    auto it = cars.begin() + 2; // it : 주소. 인덱스 2를 가리킴. Ford
    cars.insert(it, "Hyundai"); // Ford 자리에 삽입. Ford는 뒤로 밀려남

    for(string car : cars){
        cout << car << " "; 
    }
    cout << endl;
    cars.erase(cars.begin() + 2);   // 인덱스2 요소 삭제
    
    for(string car : cars){
        cout << car << " "; 
    }
    return 0;
}