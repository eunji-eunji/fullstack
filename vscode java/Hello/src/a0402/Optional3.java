package a0402;

import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {
        Optional<String> name=Optional.of("charlie");
        name.ifPresent(n->System.out.println("hello, "+n));
        // 값이 존재하면 작업 수행 - ifPresent

        Optional<String> emptyName = Optional.ofNullable(null);
        emptyName.ifPresent(n -> System.out.println("Hello, " + n));  
        // 출력: 아무 것도 출력되지 않음
    }
}
