#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> numbers;
    for(int i = 0; i < 5; i++){
        int a;
        cin >> a;
        numbers.push_back(a);   
    }
    for(int number : numbers){
        cout << number << "\n";
    }
    return 0;
}