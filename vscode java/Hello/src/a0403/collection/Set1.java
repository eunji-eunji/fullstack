package a0403.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 컬렉션
// 1. 데이터를 효율적으로 저장
// 2. 배열보다 유연하게 크기 변경 가능
// 3. 자료구조: List, Map, Set
// 4. ArrayList<String> - 제네릭 지원으로 타입의 안정성 제공
// 5. 다양한 구현체 제공 : 성능과 특징에 맞게 선택 가능

// 리스트: 순서O, 중복O
// ArrayList: 배열 기반. 검색 빠름, 삽입/삭제는 느림
// LinkedList: 연결리스트 기반. 검색 느림, 삽입/삭제 빠름
// Vector: ArrayList와 유사. 스레드 안전
// Stack: LIFO(Last-In-First-Out) 구조. push()/pop()-삽입/삭제

// Set: 순서X, 중복X
// HashSet: 해쉬 기반. 순서X, 중복X
// LinkedHashSet: 입력순서 유지. 중복X
// TreeSet: 정렬된 상태 유지(오름차순)

// Queue: FIFO(First-In-First-Out) 구조.
// Map<Key, Value>: Key-중복X
// HashMap: 키 순서X. 검색 빠름.
// LinkedHashMap: 입력순서 유지. 
// TreeMap: 정렬된 상태 유지(키 기준)

public class Set1 {
    public static void main(String[] args) {
        // 객체선언
        Set<String> set = new HashSet<>();

        // 데이터 삽입
        set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");
        System.out.println();
        for (String e : set) {
            System.out.println(e);
        }
        System.out.println();

        // 데이터 삭제
        set.remove("apple");
        set.add("orange");
        set.add("orange"); // 중복 저장 안됨
        for (String e : set)
            System.out.println(e);
        System.out.println();

        Iterator<String> iterSet = set.iterator();
        while (iterSet.hasNext()) {
            System.out.println(iterSet.next() + " ");
        }
        System.out.println();

        System.out.println(set);
        System.out.println(set.contains("orange")); // true
        set.clear();    //전부 삭제
        System.out.println(set);
        System.out.println(set.isEmpty()); // set이 비어있는지. -> true

    }
}
