#include <iostream>
#include <string>
using namespace std;

class Employee{
    private:
        int salary;

    public:
        void setSalary(int s){
            salary = s;
        }
        int getSalary(){
            return salary;
        }
};

int main(){
    Employee obj;
    obj.setSalary(50000);
    cout << obj.getSalary();


    return 0;
}