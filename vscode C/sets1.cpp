#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> s;
    // 값 추가(중복 불가)
    // 무작위 저장
    s.insert(50);
    s.insert(20);
    s.insert(30);
    s.insert(20);   // 중복된 값 -> 무시됨

    // for문 돌면서 출력
    for(int num: s){    
        cout << num << " ";
    }
    cout << endl;

    if(s.find(30) != s.end()) { // 끝까지 돌아서 30을 찾음
        cout << "30을 찾았습니다." << endl;   
    } else {
        cout << "30이 없습니다." << endl;   
    }

    // 삭제
    s.erase(20);
    for(int num: s){    
        cout << num << " ";
    }
    cout << endl;

    if(! s.empty()) {
        cout << "셋은 비어 있지 않습니다." << endl;
    }
    cout << "현재 셋의 크기 : " << s.size() << endl;

    
    return 0;
}
// insert(20) : 원소 삽입(중복X)
// find(20) : set을 돌면서 값 찾음 (find(20) == end() 이면 값 없음)
//            (end() : set의 마지막 다음 위치)
// erase(20) : 원소 삭제
// size : 크기
// empty() : 비어 있으면 true
// clear() : 모두 삭제