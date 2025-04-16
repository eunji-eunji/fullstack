#include <iostream>
#include <string>
using namespace std;

class MyClass {
    public:
        void function() {
            cout << "some content in parent class";
        }
};

// 다중 상속
class Child: public MyClass{ 
};

class Grandchild: public Child{
};

int main(){
    Grandchild obj;
    obj.function();
    cout << obj.function();
    return 0;
}