#include <iostream>
#include <string>
using namespace std;

class MyClass{
    public:
    int num;
    string str;
};

int main(){
    MyClass obj;
    obj.num = 15;
    obj.str = "some text";
    cout<<obj.num<<"\n";
    cout<<obj.str<<"\n";
    return 0;
}