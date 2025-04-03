package a0402;

import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {
        Optional<String> name=Optional.ofNullable("alice");
        String result=name.orElse("Guest");
        // 값이 있으면 값을 출력하고, 값이 없으면 Guest 출력함
        System.out.println("name: "+result);

        Optional<String> name1=Optional.ofNullable(null);
        String result1=name1.orElse("Guest");
        System.out.println("name1: "+result1);

    }
}
