package a0402;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Optional6 {
    private static final Map<Integer, String> userDatabase = new HashMap<>();
    // 새로운 객체 할당 불가능하게 할 때 final 사용

    static {
        userDatabase.put(1, "Alice");
        userDatabase.put(2, "Bob");
        userDatabase.put(3, "Charlie");
    }
    // static 블럭 : 클래스가 최초로 로드될 때 한 번만 실행됨
    // 정적변수(static변수) 초기화 사용, 객체 생성하지 않아도 실행됨

    public static void main(String[] args) {
        // userDatabase=new HashMap<>(); -> 사용 불가능

        // 존재하는 ID 조회
        Optional<String> user1 = findById(2);
        System.out.println("user width id 2: " + user1.orElse("user not found"));

        Optional<String> user2 = findById(4);
        System.out.println("user width id 4: " + user2.orElse("user not found"));

        // orElse
        System.out.println("user with id3(orElse): " + findById(3).orElse(getDefaultUser()));
        // 값이 있든 없든 항상 getDefaultUser() 호출.

        // orElseGet
        System.out.println("user with id3(orElseGet): " + findById(3).orElseGet(() -> getDefaultUser()));
        // 비어있을 때(null)만 호출

    }

    private static String getDefaultUser() {
        System.out.println("GetDefaultUser 호출");
        return "Default User";
    }

    private static Optional<String> findById(int i) {
        return Optional.ofNullable(userDatabase.get(i));
    }
}
