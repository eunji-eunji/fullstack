#include <iostream>
#include <string>
using namespace std;

// 문제 1⃣
// Book 클래스를 만들어서

// 제목(title), 저자(author), 가격(price)를 저장하고,

// printInfo() 함수로 책 정보를 출력하세요.
class Book{
    public:
    string title;
    string author;
    int price;
    Book(string t, string a, int p);
    void printInfo(){
        cout<<"title: "<<title << " author: "<< author << " price: "<<price<<"원\n";
    }
};

Book::Book(string t, string a, int p){
    title=t;
    author=a;
    price=p;
};

int main() {
    Book book("오만과 편견", "STD", 23000);
    book.printInfo();
    return 0;
}

