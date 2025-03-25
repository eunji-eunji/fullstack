package a0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        // ArrayList는 컬렉션이라고 이야기함. Integer는 generic이라고 함
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        // 객체도 arrayList 만들 수 있음

        // add 메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        // for문과 get() 메소드를 이용해 요소 출력
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        for (int num : arrList)
            System.out.print(num + " ");
        System.out.println();

        // Collections.sort() 메소를 이용한 요소의 정렬
        Collections.sort(arrList);
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);
        for (int num : arrList)
            System.out.print(num + " ");
        System.out.println();

        // remove() 요소 삭제
        arrList.remove(1);
        for (int num : arrList)
            System.out.print(num + " ");
        System.out.println();

        // 특정 위치에 요소 추가
        arrList.add(0, 10);
        for (int num : arrList)
            System.out.print(num + " ");
        System.out.println();

        // size() 요소의 총 개수
        System.out.println("리스트의 크기: " + arrList.size());

    }
}
