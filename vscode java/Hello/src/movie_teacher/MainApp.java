package movie_teacher;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다."); // 초기메시지
        
        // 메인메뉴 객체생성
        Menu menu = MainMenu.getInstance();
        // getInstance()로 "메인메뉴를 가져옴".
        // MainMenu는 싱글톤 패턴으로 하나만 선언할 수 있기 때문에 getInstance() 함수를 이용함.
        
        while (menu != null) {// 메뉴가 있으면 계속 반복
            menu.print(); // 현재메뉴 출력
            menu = menu.next(); // 사용자 입력후 , 다음메뉴로 갱신
        }
        System.out.println("프로그램이 종료됩니다."); // 프로그램 종료 문구
    }
}

interface Menu {
    // 인터페이스는 함수 이름만 정의해 놓을 수 있다.
    // 추상클래스는 함수 이름만 정의할 수도 있고, 일부 구현해 놓을 수도 있다.
    void print(); // 메뉴 출력

    Menu next(); // 다음 메뉴로 이동
    // next 이름에 메서드 , 메뉴타입의 객체 반환

}