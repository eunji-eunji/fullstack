#include <iostream>
#include <string>
using namespace std;

class MyClass{
    public:
        void method();
};

// 클래스 외부에서 함수를 정의하려면 클래스 내부에 함수를 선언해야 한다.
// 범위 결정, 클래스 이름, :: 연산자, 함수 이름을 차례로 지정
void MyClass::method(){ //외부클래스
    cout<<"Hello World";    
}

int main(){
    MyClass obj;
    obj.method();
    return 0;
}