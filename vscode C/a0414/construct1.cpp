#include <iostream>
#include <string>
using namespace std;

class MyClass{
    public:
    MyClass(){  // 생성자
        cout << "생성자";
    }
};

int main(){
    MyClass obj;
    return 0;
}