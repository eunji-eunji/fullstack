#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    // FIFO (First In First Out)
    // 스택에 값을 넣는 방법 : push
    q.push(10);    
    q.push(20);    
    q.push(30);    
    cout << "현재 큐의 맨 앞 값 : " << q.front() << endl;   // 10
    cout << "현재 큐의 맨 뒤 값 : " << q.back() << endl;    // 30
    // ---------------
    //  10 | 20 | 30 | 
    // ---------------
    q.pop();
    cout << "현재 큐의 맨 앞 값 : " << q.front() << endl;   // 20
    cout << "현재 큐의 맨 뒤 값 : " << q.back() << endl;    // 30
    
    if(! q.empty()) {
        cout << "큐는 비어 있지 않습니다." << endl;
    }
    cout << "현재 큐의 크기 : " << q.size() << endl;
    return 0;
}
    // push(10) : 맨 뒤에 값 넣기
    // pop() : 맨 앞 값 꺼내기
    // front() : 맨 위 값 확인
    // back() : 맨 뒤 값 확인
    // empty() : 비어 있으면 true
    // size() : 스택 크기
