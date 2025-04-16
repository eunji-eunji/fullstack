#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    // LIFO(List In First Out)
    // 스택에 값을 넣는 방법 : push
    s.push(10);
    s.push(20);
    s.push(30);
    cout << "현재 스택의 맨 위 값 : " << s.top() << endl;
// |    |
// | 30 |
// | 20 |
// | 10 |
// ------

    s.pop();
    cout << "현재 스택의 맨 위 값 : " << s.top() << endl;

    if(! s.empty()) {
        cout << "스택은 비어 있지 않습니다." << endl;
    }
    cout << "현재 스택의 크기 : " << s.size() << endl;

    // 전체 스택 비우기
    while(!s.empty()) {
        cout << "스택에서 꺼낸 값: " << s.top() <<endl;
        s.pop();
    }
    
    if(! s.empty()) {
        cout << "스택은 비어 있지 않습니다." << endl;
    } else {
        cout << "스택은 비어 있습니다." << endl;
    }
    return 0;
}
    // push(10) : 맨 뒤에 값 넣기
    // pop() : 맨 뒤 값 꺼내기
    // top() : 맨 위 값 확인
    // empty() : 비어 있으면 true
    // size() : 스택 크기
