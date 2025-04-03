package a0402;

import java.util.Optional;

// Optional : null값으로 인한 문제 방지, 안전하게 값을 처리
// Optional : null이 될 수 있는 객체를 감싸는 wrapper 클래스
public class Optional1 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");
        System.out.println("name: " + name.get());

        Optional<String> emptyname = Optional.empty(); // 빈 옵셔널 생성
        System.out.println("is empty: " + emptyname.isPresent()); // false

        // Optional.ofNullable() - null을 허용하는 Optional
        Optional<String> nullableName = Optional.ofNullable(null); 
        System.out.println("is empty: " + nullableName.isPresent()); // false

    }
}
