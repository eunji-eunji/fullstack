package a0331.coffee;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class Coffee {
    private static Coffee instance; // 싱글톤 : 객체를 하나만 생성

    private Coffee() {
    };

    public static Coffee getInstance() {
        if (instance == null) {
            instance = new Coffee();
        }
        return instance;
    }

    ArrayList<String> coffeeList;
    ArrayList<Integer> coffeePrice;
    Map<String, Integer> menu;

    public void getMenu() {
        menu = new LinkedHashMap<String, Integer>();
        coffeeList = new ArrayList<>();
        coffeePrice = new ArrayList<>();

        coffeeList.add("아메리카노");
        coffeeList.add("카푸치노");
        coffeeList.add("아이스 아메리카노");
        coffeeList.add("카라멜 마끼아또");
        coffeeList.add("카페라떼");
        coffeeList.add("카페모카");

        coffeePrice.add(2000);
        coffeePrice.add(4500);
        coffeePrice.add(2500);
        coffeePrice.add(4000);
        coffeePrice.add(3000);
        coffeePrice.add(3500);

        for (int i = 0; i < coffeeList.size(); i++) {
            menu.put(coffeeList.get(i), coffeePrice.get(i));
        }

        // 아래 포맷에 맞추어 출력
        DecimalFormat f = new DecimalFormat("0,000원");
        StringBuffer st = new StringBuffer();
        // 문자 누적해서 사용할 때

        st.append("\n\n")
                .append("+---------------------------------------------------+\n")
                .append("+------------------------메뉴판----------------------+\n")
                .append("|            Menu                   price           |\n");
        System.out.println(st.toString());

        int s = 1;
        for (Entry<String, Integer> entry : menu.entrySet()) {
            System.out.printf("|  [%d]  %-20s  %7s          |\n", s, entry.getKey(), f.format(entry.getValue()));
            // f.format(entry.getValue()) -> 3,000원 출력
            s++;
        }
        System.out.println("+---------------------------------------------------+\n");
    }

}
