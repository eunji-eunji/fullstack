package a0401.ramda;

import java.util.Arrays;
import java.util.List;

public class Ramda1 {
    public static void main(String[] args) {
        // List<String> name = new ArrayList<>();

        // name.add("apple");
        // name.add("banana");
        // name.add("cigar");

        // for(int i=0;i<name.size();i++){
        // System.out.println(name.get(i));
        // }

        List<String> names = Arrays.asList("apple", "banana", "orange");
        System.out.println();
        for (String s : names) {
            System.out.println(s);
        }

        // 람다 foreach
        names.forEach(s -> System.out.println(s));

        // 스트림
        // 길이가 6이상인 요소만 필터링
        names.stream()  // 스트림 생성(스트림으로 변경)
                .filter(s -> s.length() >= 6)   // 이름의 길이가 6이상인 이름만 필터링
                .forEach(System.out::println);  // 필터링된 이름을 하나씩 출력

    }
}
