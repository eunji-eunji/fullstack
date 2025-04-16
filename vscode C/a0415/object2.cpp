#include <iostream>
#include <string>
using namespace std;

class Car
{
public:
    string model;
    string brand;
    int year;
};

int main()
{
    Car carobj1;
    carobj1.model = "BMW";
    carobj1.brand = "X5";
    carobj1.year = 1999;
    Car carobj2;
    carobj2.model = "Mustang";
    carobj2.brand = "Ford";
    carobj2.year = 1969;
    cout << carobj1.brand << " " << carobj1.model << " " << carobj1.year << "년\n";
    cout << carobj2.brand << " " << carobj2.model << " " << carobj2.year << "년\n";

    return 0;
}