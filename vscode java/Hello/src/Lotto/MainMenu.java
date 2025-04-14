package Lotto;

import java.lang.reflect.Member;


class MainMenu extends AbstractMenu implements Menu{


    private static final MainMenu instance = new MainMenu();
    public static MainMenu getInstance() {
        return instance;
    } // 메인메뉴에 대한 싱글톤패턴 -
    private static final String MAIN_MENU_TEXT =
    " \n\n ##        ####    ######   ######   ######   #####    ##  ##  \r\n"
				+ " ##       ##  ##     ##       ##     ##       ##  ##   ##  ##  \r\n"
				+ " ##       ##  ##     ##       ##     #####    #####    ###### \r\n"
				+ " ##       ##  ##     ##       ##     ##       ## ##      ##    \r\n"
				+ " ######    ####      ##       ##     ######   ##  ##     ##" +
    "\n =================================== 복권시스템 =================================== \n" +
    "1. 회원 로그인 \n" +
    "2. 관리자 로그인 \n" +
    "3. 회원가입 \n" +   // Membership이라 이어지게
    "4. 종료 \n\n" +
    "메뉴를 선택하세요 : ";

    private MainMenu(){
        super(MAIN_MENU_TEXT, null); // 부모의 생성자를 호출
    }
    @Override
    public void print() {
        System.out.println(MAIN_MENU_TEXT);
    }

    @Override
    public Menu next(){
        switch (sc.nextLine()) {
            case "1":
            Membership member = Membership.getInstance().memberLogin();
            if (member != null) {
                ShowMemberMenu.showMemberMenu(member);  // 로그인 성공 시 회원 메뉴 이동
            }
            return this;
            case "2":
                
                return this;
            case "3":
                Membership.getInstance().membershipGuide();
                return this;
            case "4":
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                return this;
        }
        // return this;
    }

    






}
