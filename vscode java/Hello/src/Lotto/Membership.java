package Lotto;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Membership {
    Scanner sc = new Scanner(System.in);
    // 싱글톤 객체 생성
    private static Membership m;

    public static Membership getInstance() {
        if (m == null) {
            m = new Membership();
        }
        return m;
    }

    public static void freeInstance() {
        m = null;
    }

    private Membership() {
    }

    String name; // 이름
    String personalYear; // 태어난 년도
    String personalM; // 태어난 월
    String personalD; // 태어난 일
    String email; // 이메일
    String pw; // 카드 비밀번호

    Membership(String name, String email, String pw) {
        this.name = name;
        this.email = email;
        this.pw = pw;
    }

    private static ArrayList<Membership> memberList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getPersonalYear() {
        return personalYear;
    }

    public String getPersonalM() {
        return personalM;
    }

    public String getPersonalD() {
        return personalD;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public void membershipGuide() {

        System.out.println("안녕하세요 다자바복권입니다. \n"
                + "로또를 구입하려면 회원가입이 필요합니다. \n"
                + "회원가입을 진행하시겠습니까? \n"
                + "[1] 예 \t\t [2] 아니오");

        String answer = " ";

        for (;;) {
            System.out.println("입력 : ");
            answer = sc.next();

            if (answer.equals("1") || answer.equals("예") || answer.equals("y")) {
                personalData();
                break;
            } else if (answer.equals("2") || answer.equals("아니오") || answer.equals("n")) {
                System.out.println("회원이 아니면 로또를 구매할 수 없습니다.");
                return;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    // 미성년자는 회원가입 불가
    private void personalData() {
        System.out.println("============================================================");
        System.out.println("회원가입에 온걸 환영합니다. 아래 양식에 맞춰 작성부탁드립니다.");
        System.out.println("이름 : ");
        this.name = sc.next().trim();

        int personalYearNum = 0;
        int personalMNum = 0;
        int personalDNum = 0;

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        for (;;) {
            System.out.println("태어난 년도를 입력해주세요 : ");
            this.personalYear = sc.next().trim();

            personalYearNum = Integer.parseInt(personalYear);

            if (personalYearNum == year || personalYearNum > year - 20 && personalYearNum < year) {
                System.out.println("[Warning] 미성년자는 회원가입을 할 수 없습니다."
                        + "\n회원가입을 종료합니다.");
                System.exit(0);
            } else if (personalYearNum < 1900 || personalYearNum > year) {
                System.out.println("[Warning] 잘못입력하셨습니다."
                        + "\n 태어난 년도를 다시 입력해주세요.");
            } else {
                break;
            }
        }

        for (;;) {
            System.out.println("태어난 월을 입력해주세요 : ");
            this.personalM = sc.next().trim();

            personalMNum = Integer.parseInt(personalM);

            if (personalMNum == 0 || personalMNum > 12) {
                System.out.println("[Warning] 잘못입력하셨습니다."
                        + "태어난 월을 다시 입력해주세요");
            } else {
                break;
            }
        }

        // 입력한 월에 따른 일의 변화
        DatePrinter.printDateTime(cal);
        cal.set(Calendar.DAY_OF_MONTH, personalMNum - 1);
        int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (;;) {
            System.out.println("태어난 일 : ");
            this.personalD = sc.next().trim();

            personalDNum = Integer.parseInt(personalD);

            if (personalDNum < 1 || personalDNum > day_count) {
                System.out.println("[Warning] 잘못입력하였습니다."
                        + "\n 태어난 일을 다시 입력해주세요. \n");
            } else {
                break;
            }
        }

        System.out.println("이메일 입력 : ");
        this.email = sc.next().trim();

        System.out.println("결제 비밀번호 입력 : ");
        sc.nextLine();
        this.pw = sc.next().trim();

        System.out.println("[Congratulation] 회원가입이 완료되었습니다.");
        System.out.println("============================================================");

        memberList.add(new Membership(name, email, pw));

    }

    public void memberLogin() {
        System.out.println("======================================= 로그인 ======================================= ");
        System.out.println("이메일을 입력하세요 : ");
        String inputEmail = sc.next().trim();

        System.out.println("비밀번호를 입력하세요 : ");
        String inputPw = sc.next().trim();

        boolean loginSuccess = false;

        for (ShowMemberMenu.Member member : ShowMemberMenu.FileManager.loadMembers()) {
            if (member.getId().equals(inputEmail) && member.getPassword().equals(inputPw)) {
                System.out.println("[" + member.getName() + "]님이 로그인하셨습니다.");
                return member;
            }
        }

        System.out.println("[Warning] 회원가입이 안되있거나 로그인 정보가 일치하지 않습니다.");
        return null;
    }

}
