#include <iostream>
#include <map>
using namespace std;

int main() {
    map<string, int> employee;
    employee["Kim"] = 4500;
    employee["Lee"] = 5200;
    employee["Park"] = 4800;
    employee["Choi"] = 5500;
    employee["Jung"] = 6100;

    for(const auto& m : employee) {
        if(m.second >= 5000) {
            cout << m.first << " : " << m.second << endl;
        }
    }
}