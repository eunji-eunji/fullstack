#include <iostream>
#include <map>
using namespace std;

int main() {
    // map 선언
    map<string, int> score;

    // 값 추가(중복 불가)
    score["Alice"] = 95;
    score["Bob"] = 82;
    score["Charlie"] = 88;

    cout << "학생 점수 목록" << endl;
    for(map<string, int>::iterator it = score.begin(); it != score.end(); ++it) {
        cout << it -> first << " : " << it -> second << endl;
        // it -> first : 맵의 키 / it -> second : 맵의 값
    }
    cout << endl;

    // 위의 for문 단축
    for(auto it = score.begin(); it != score.end(); ++it) {
        cout << it -> first << " : " << it -> second << endl;
    }

    // 특정 값 찾기
    string name = "Bob";
    if(score.find(name) != score.end()) {
        cout << name << "의 점수는 " << score[name] << "입니다." << endl;
    } else {
        cout << name << "이 없습니다." << endl;
    }

    // 삭제
    score.erase("Charlie");
    cout << "삭제 후 남은 학생 목록" << endl;
    for(auto it = score.begin(); it != score.end(); ++it) {
        cout << it -> first << " : " << it -> second << endl;
    }
    cout << endl;

    // for문 출력
    for(const auto& pair : score) {
        // const auto& pair : score - score map의 각 key-value 쌍을 pair라는 이름으로 하나씩 가져옴
        // :score - score 대상으로 순회
        cout << pair.first << " : " << pair.second << endl;
        // pair.first - 순회 중인 key / pair.second - 값
    }

    if(! score.empty()) {
        cout << "셋은 비어 있지 않습니다." << endl;
    }
    cout << "현재 셋의 크기 : " << score.size() << endl;
    return 0;
}
// 이름[키] = 값;
// find(20) : set을 돌면서 값 찾음 (find(20) == end() 이면 값 없음)
//            (end() : set의 마지막 다음 위치)
// erase(20) : 원소 삭제
// size : 크기
// empty() : 비어 있으면 true
// clear() : 모두 삭제