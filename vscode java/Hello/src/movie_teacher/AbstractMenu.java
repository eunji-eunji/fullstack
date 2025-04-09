package movie_teacher;

import java.util.Scanner;
// AbstractMenu 추상클래스는 menu 인터페이스를 implements 했지만 Menu next() 함수가 구현되지 않아도 오류가 없다.
// 이는 AbstractMenu가 추상클래스이기 때문에 반드시 모든 메서드를 구현할 필요는 없고, 
// 나머지는 자식 클래스에서 구현하도록 위임이 가능하다.
abstract class AbstractMenu implements Menu{
//추상클래스는 객체를 직접 만들 수는 없지만, 자식클래스들이 공통으로 가져야 할 속성이나 기능을 정의해 주는 클래스이다.
// 공통된 부분은 미리 구현해 놓고, 미완성된 부분은 자식클래스에서 완성함.
//  abstract 클래스는 Menu 인터페이스를 구현하며, 추후 메인메뉴(Mainmenu)
//와 관리자메뉴(AdminMenu)의 부모클래스가된다.
    protected String menuText; //기본문구 - 인스턴수 변수
    protected Menu prevMenu; //이전메뉴 - 인스턴스변수
    
  

    protected static final Scanner scanner =new Scanner(System.in);

    public AbstractMenu(String menuText, Menu prevMenu) {
        this.menuText = menuText;
        this.prevMenu = prevMenu;
    }

    public void print(){
        System.out.println("\n" + menuText); //메뉴출력
    }

    public void setPrevMenu(Menu prevMenu) {
        this.prevMenu = prevMenu;
    } //세터 메소드, 메뉴를 종료한 후 돌아갈 이전 메뉴를 설정

    
}
