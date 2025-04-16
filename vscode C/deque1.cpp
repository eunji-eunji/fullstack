#include <iostream>
#include <deque>
using namespace std;

int main() {
    deque<int> dq;
    dq.push_back(10);    
    dq.push_back(20);    
    dq.push_back(30);    
    dq.push_front(1);
    cout << "현재 디큐의 맨 앞 값 : " << dq.front() << endl;   // 1
    cout << "현재 디큐의 맨 뒤 값 : " << dq.back() << endl;    // 30
    // -------------------
    //  1 | 10 | 20 | 30 | 
    // -------------------
    dq.pop_front(); // 1 삭제
    dq.pop_back();  // 30 삭제
    cout << "현재 디큐의 맨 앞 값 : " << dq.front() << endl;   // 10
    cout << "현재 디큐의 맨 뒤 값 : " << dq.back() << endl;    // 20
    
    if(! dq.empty()) {
        cout << "디큐는 비어 있지 않습니다." << endl;
    }
    cout << "현재 디큐의 크기 : " << dq.size() << endl;

    // for문 돌면서 출력
    for(int num: dq){
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
    // push_front(10) : 맨 앞에 값 넣기
    // push_back(10) : 맨 뒤에 값 넣기

    // pop_front() : 맨 앞 값 꺼내기
    // pop_back() : 맨 뒤 값 꺼내기

    // front() : 맨 앞 값 확인
    // back() : 맨 뒤 값 확인
    
    // empty() : 비어 있으면 true
    // size() : 스택 크기
