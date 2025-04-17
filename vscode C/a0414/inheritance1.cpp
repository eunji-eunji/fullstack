#include <iostream>
#include <string>
using namespace std;

class MyClass {
    public:
        void function() {
            cout << "some content in parent class" << endl;
        }
};

// 다중 상속
class Child: public MyClass{ 
};

class Grandchild: public Child{
};

int main(){
    Child child;
    Grandchild obj;
    obj.function();
    child.function();
    return 0;
}