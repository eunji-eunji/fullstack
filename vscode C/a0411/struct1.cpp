#include <iostream>
#include <string>
using namespace std;

int main()
{
    struct
    { // 구조체 (변수 묶음)
        int num;
        string st;
    } structure;

    structure.num = 1;
    structure.st = "Hello World";

    cout << structure.num << "\n";
    cout << structure.st << "\n";

    return 0;
}