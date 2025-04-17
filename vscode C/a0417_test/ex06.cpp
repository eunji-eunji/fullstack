#include <iostream>
#include <string>
using namespace std;

int main() {
    string name;
    int age;
    cout << "사용자 이름을 입력하세요. ";
    cin >> name;    // 한글 입출력 안 됨
    cout << "사용자 나이를 입력하세요. ";
    cin >> age;
    cout << name << "님은 " << age << "세입니다.\n";
    return 0;
}