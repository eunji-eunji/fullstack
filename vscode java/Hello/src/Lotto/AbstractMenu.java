package Lotto;

import java.util.Scanner;

abstract class AbstractMenu implements Menu {
    // 추상클래스
    protected String menuText; // 기본문구 - 인스턴수 변수
    protected Menu prevMenu; // 이전메뉴 - 인스턴수 변수

    protected static final Scanner sc = new Scanner(System.in);

    // 생성자
    public AbstractMenu(String menuText, Menu prevMenu) {
        this.menuText = menuText;
        this.prevMenu = prevMenu;
    }

}
