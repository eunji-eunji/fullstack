#include <iostream>
#include <string>
using namespace std;

class MyClass{
    public:
        void method(){
            cout<<"Hello Wrodl";
        }
};

int main(){
    MyClass obj;
    obj.method();
    return 0;
}