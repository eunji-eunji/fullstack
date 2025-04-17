#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> numbers;
    int num;
    while(true) {
        cout << "정수를 입력하세요. ";
        cin >> num;
        if(num == -1){
            break;
        }
        numbers.push_back(num);
    }
    for(int i = 0; i < numbers.size(); i++){
        cout << numbers.at(i) << " ";
    }
    return 0;
}