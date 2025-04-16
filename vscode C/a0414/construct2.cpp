#include <iostream>
#include <string>
using namespace std;

class Car
{
public:
    
        string model;
        string brand;
        int year;
    Car(string x, string y, int z){
        brand=x;
        model=y;
        year=z;
    }
};

int main()
{
    Car car1("BMW","X5",1999);
    Car car2("Ford","Mustang",1986);
    cout << car1.brand << " " << car1.model << " " << car1.year << "년\n";
    cout << car2.brand << " " << car2.model << " " << car2.year << "년\n";

    return 0;
}