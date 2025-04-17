#include <iostream>
using namespace std;

class Student {
    public:
    string name;
    string studentID;

    Student(string n, string s){
        name = n;
        studentID = s;
    }

    ~Student(){
        cout << "객체가 삭제되었습니다.";
    }
};

int main() {
    Student s("홍길동", "20159900");
    cout << "이름: " << s.name << "\n학번: " << s.studentID << endl;
    return 0;
}