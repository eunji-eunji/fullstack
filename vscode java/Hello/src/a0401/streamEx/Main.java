package a0401.streamEx;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.smartcardio.CommandAPDU;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        // 1. 2011년에 일어난 모든 트랙잭션을 찾아 오름차순으로 정렬하시오.
        practice1(transactions);

        // 2. 도시를 중복없이 나열
        practice2(transactions);

        // 3. cambridge에 사는 모든 거래자를 찾아 이름순으로 정렬
        practice3(transactions);

        // 4. 밀라노에 거래자가 있는가?
        practice4(transactions);

        // 5. cambridge에 사는 거주자의 트랜잭션 값 출력
        practice5(transactions);

        // 6. 모든 거래자의 이름을 알파벳 순으로 정렬
        practice6(transactions);

        // 7. value 최대값인 Transaction 구하기
        practice7(transactions);

        // 8. value 최소값인 Transaction 구하기
        practice8(transactions);

    }

    private static void practice8(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(result);
        // optional로 감싸서 null이어도 반환
        // null에 대한 코딩을 따로 안 해도 됨
        System.out.println(result.get().getValue());
    }

    private static void practice7(List<Transaction> transactions) {
        // 예전방법 - Otional 안 쓸 경우 orElse로 null 값 주면 됨
        Transaction result = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .orElse(null);
        System.out.println(result);

        // 요즘 방법(Otional) - practice8

    }

    private static void practice6(List<Transaction> transactions) {
        List<String> result = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void practice4(List<Transaction> transactions) {
        boolean result = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println(result ? "있다" : "없다");
    }

    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
                .map(Transaction::getTrader) // Transaction 객체에서 Trader 정보만 가져옴
                .filter(t -> t.getCity().equalsIgnoreCase("cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList()); // stream으로 바꿨던 걸 다시 리스트로 바꿈
        System.out.println(result);
    }

    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
                .map((tran) -> tran.getTrader().getCity()) // 모든 시티 추출
                .distinct() // 중복X
                .collect(Collectors.toList()); // 리스트로 반환
        // tran(transactions) 객체를 입력받아서
        // .map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
        // .map(Trader::getCity) //각 거래자에서 도시정보추출

        System.out.println(result);
    }

    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue).reversed()) // 내림차순
                // .sorted(Comparator.comparing(t ->t.getTrader().getName()))
                // .sorted((tran1, tran2) -> Integer.compare(tran1.getValue(),
                // tran2.getValue())) //오름차순
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
