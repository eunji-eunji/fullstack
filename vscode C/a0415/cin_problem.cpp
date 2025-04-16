#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    cout << (a>b && a>c ? a : (b>c && b>a ? b : c));
    // 전체 괄호
}

// 배열로 숫자 5개 입력 받고 가장 큰 수 출력