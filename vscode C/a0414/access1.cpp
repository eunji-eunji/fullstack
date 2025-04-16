#include <iostream>
#include <string>
using namespace std;

class MyClass{
    public:
        int x;
    private:
        int y;
};

int main(){
    MyClass obj;
    obj.x = 4;    // public
    // obj.y = 2; // 직접 접근 불가능(private)


    return 0;
}