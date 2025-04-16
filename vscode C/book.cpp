#include <iostream>
#include <vector>
using namespace std;

class book {
    public:
    string title;
    bool available;
    
    book(string t){
        title = t;
        available = true;   // true: 대출가능, false: 대출 중
    }

    book() {}
};

// 목록 함수
void list(vector<book>& library) {
    cout << "\n[도서 목록]\n";
    int i = 1;
    for(book b : library){
        string ava;
        if(b.available == true) ava = "대출가능";
        else ava = "대출 중";
        cout << i << ". " << b.title << " : " << ava << endl;
        i++;
    }
}

// 대출 함수
void borrow(vector<book>& library) {
    cout << "\n[도서 대출]\n";
    cout << "대출할 도서 번호 입력: ";
    int bookNum;
    cin >> bookNum;
    if(library.at(bookNum-1).available == false){
        cout << "이미 대출 중입니다.\n";
    } else {
        library.at(bookNum-1).available = false;
        cout << "'" << library.at(bookNum-1).title << "' 책을 대출하였습니다.\n";
    }
}

// 반납 함수
// C++은 기본적으로 값 복사를 하기 때문에 메인 함수 바깥에서 값을 변경하고 싶으면 
// 명시적으로 &를 붙여야 참조가 됨
void returnBook(vector<book>& library){
    cout << "\n[도서 반납]\n";
    cout << "반납할 도서 번호 입력: ";
    int bookNum;
    cin >> bookNum;
    if(library.at(bookNum-1).available == true){
        cout << "반납할 도서가 없습니다.\n";
    } else {
        library.at(bookNum-1).available = true;
        cout << "'" << library.at(bookNum-1).title << "' 책을 반납하였습니다.\n";
    }
}

int main() {
    vector<book> library;
    library.push_back(book("C++ 입문서"));
    library.push_back(book("자료구조론"));
    library.push_back(book("알고리즘 기초"));

    while(true) {
        int choice;
        cout << "\n=== 도서 대출 프로그램 ===\n";
        cout << "1. 도서 목록 확인\n";
        cout << "2. 도서 대출\n";
        cout << "3. 도서 반납\n";
        cout << "4. 프로그램 종료\n";
        cout << "메뉴 선택: ";
        cin >> choice;

        // 메뉴
        if(choice == 1){    // 1. 도서 목록 확인
            list(library);
        } else if(choice == 2) {    // 2. 도서 대출
            borrow(library);
        } else if(choice == 3) {    // 3. 도서 반납
            returnBook(library);
        } else if(choice == 4) {    // 4. 프로그램 종료
            cout << "프로그램을 종료합니다!";
            break;
        } else {
            cout << "잘못 입력하셨습니다.";
        }

    }
}