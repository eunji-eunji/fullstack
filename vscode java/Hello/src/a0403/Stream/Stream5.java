package a0403.Stream;

import java.util.stream.Stream;

public class Stream5 {
    public static void main(String[] args) {
        Stream<Double> stream=Stream.of(4.2, 2.5, 3.1, 1.5);
        stream.forEach(System.out::println);
        // of() 메서드를 사용하면 가변 매개변수에서 스트림 생성
    }
}
