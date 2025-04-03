package a0401.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda2 {
    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("apple", "banana", "orange");
        names1.sort((s1, s2)->s2.compareTo(s1));
        System.out.println("내림차순 정렬: "+names1);

        names1.sort((s1, s2)->s1.compareTo(s2));
        System.out.println("오름차순 정렬: "+names1);

        // 람다
        names1.sort(String::compareTo);
        System.out.println("오름차순 정렬: "+names1);
        // s2.compareTo(s1) 대신 메소드 참조(::연산자)를 사용하여 더 간결하게 표시
    }
}
