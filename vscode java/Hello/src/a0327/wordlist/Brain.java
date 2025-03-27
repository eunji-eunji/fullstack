package a0327.wordlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Brain implements Interface {
    static HashMap<String, String> word = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public Brain() {
        word.put("peach", "복숭아");
        word.put("plum", "자두");
        word.put("pomegranate", "석류");
        word.put("persimmon", "감");
    }

    @Override
    public void menu() {
        System.out.println("등록된 단어 수: " + word.size());
        System.out.println("---- 선택 해주세요. ----");
        System.out.println(" 1. 단어 등록 ");
        System.out.println(" 2. 단어 조회 ");
        System.out.println(" 3. 단어 삭제 ");
        System.out.println(" 4. 테스트 ");
        System.out.println(" 5. 단어 목록보기");
        System.out.println(" 6. 종료 ");
        System.out.println("-----------------------");
    }

    @Override
    public void addWord() {
        String eng = null;
        String kor = null;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("영단어 입력(목록으로 돌아가기: menu 입력): ");
            eng = scan.nextLine();
            if (eng.equalsIgnoreCase("menu")) {
                break;
            } else {
                if (word.containsKey(eng) == true) {
                    System.out.println("이미 입력된 단어. 수정하려면 삭제 후 다시 입력");
                } else {
                    System.out.print("뜻 입력: ");
                    kor = scan.nextLine();

                    try {
                        word.put(eng, kor);
                    } catch (Exception e) {
                        System.out.println("다시 입력하세요.");
                        e.printStackTrace(); // 정확한 에러 표시
                    } finally { // 반드시 실행해야 할
                        System.out.println("입력되었습니다.");
                    }
                }
            }
        }
    }

    @Override
    public void deleteWord() {
        while (true) {
            System.out.println("----단어목록----");
            if (word.isEmpty()) {
                System.out.println("비어 있음");
            } else {
                for (Map.Entry<String, String> entry : word.entrySet()) {
                    System.out.println("※  " + entry.getKey() + ": " + entry.getValue());
                }
                // for(String s:word.keySet()){

                // }
            }

            System.out.println("=================");

            System.out.print("삭제 단어 입력(목록으로 돌아가기: menu): ");
            String del = scan.nextLine().trim(); // 입력값 앞뒤 공백제거
            if (del.equalsIgnoreCase("menu")) {
                System.out.println("메뉴로 돌아갑니다.");
                break;
            }
            if (word.containsKey(del)) {
                System.out.printf("입력한 단어 %s : %s이(가) 삭제됨\n", del, word.remove(del));
            }
        }
    }

    @Override
    public void exit() {
        System.out.println("프로그램 종료");
        System.exit(0);
    }

    @Override
    public void test() {
        while (true) {
            System.out.println("1.시작하기");
            System.out.println("2.종료하기");
            System.out.print("번호 입력: ");

            if (!scan.hasNextInt()) { // 숫자 입력이 아닌 경우 예외 처리
                System.out.println("숫자를 입력하세요.");
                scan.next(); // 잘못된 입력 제거
                continue;
            }

            int a = scan.nextInt();
            scan.nextLine(); // 입력 버퍼 문제 방지

            if (a == 1) {
                int corectCount = 0;
                int totalCount = 0;
                System.out.println("===뜻에 맞는 영단어를 입력하세요.===");
                for (Map.Entry<String, String> entry : word.entrySet()) {
                    System.out.print(entry.getValue() + ": ");
                    String answer = scan.nextLine().trim();

                    if (answer.equalsIgnoreCase(entry.getKey())) {
                        System.out.println("정답입니다.");
                        corectCount++; // 정답 개수
                    } else {
                        System.out.printf("틀렸습니다. 정답은 %s입니다.\n", entry.getKey());
                    }
                    totalCount++; // 전체 문제 개수
                }
                System.out.printf("결과: %d/%d\n", corectCount, totalCount);
            } else if (a == 2) {
                System.out.println("테스르 종료");
                break;
            } else {
                System.out.println("1 또는 2를 입력하세요.");
            }
        }
    }

    @Override
    public void wordList() {
        System.out.println("----단어목록----");
        if (word.isEmpty()) {
            System.out.println("비어 있음");
        } else {
            for (Map.Entry<String, String> entry : word.entrySet()) {
                System.out.println("※  " + entry.getKey() + ": " + entry.getValue());
            }
            // for(String s:word.keySet()){

            // }
        }
    }

    @Override
    public void wordSearch() {
        while (true) {
            System.out.print("조회할 영단어 입력(목록으로 돌아가기: menu): ");
            String ent = scan.nextLine();
            if (ent.equalsIgnoreCase("menu")) {
                break;
            } else {
                if (word.containsKey(ent) == true) {
                    System.out.println(word.get(ent));
                } else {
                    System.out.println("동록되지 않은 단어임");
                }
            }
        }
    }
}
