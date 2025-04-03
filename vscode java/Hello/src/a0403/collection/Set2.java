package a0403.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        List<String> items=new ArrayList<>();

        items.add("apple");
        items.add("banana");
        items.add("orange");
        items.add("apple");
        items.add("grape");
        items.add("strawberry");

        // HashSet을 사용하여 중복 제거
        Set<String> uniqueItems=new HashSet<>(items);
        System.out.println(uniqueItems );
    }
}
