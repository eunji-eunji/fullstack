package a0327.연습;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> voteCount = new HashMap<>();
        Map<String, List<String>> regionCandidates = new HashMap<>();

        // 지역별 후보 리스트
        regionCandidates.put("서울", Arrays.asList("김영이", "박민지"));
        regionCandidates.put("부산", Arrays.asList("최정우", "김영이"));
        regionCandidates.put("대구", Arrays.asList("박민지", "이재훈"));

        // 후보 초기화
        for (List<String> candidates : regionCandidates.values()) {
            for (String name : candidates) {
                voteCount.put(name, 0); // 초기 득표수: 0
            }
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n[지역목록] " + regionCandidates.keySet());
            System.out.print("투표할 지역을 입력하세요.(종료:exit): ");
            String region = sc.nextLine();

            if(region.equalsIgnoreCase("exit")) break;

            if(!regionCandidates.containsKey(region)){
                System.out.println("없는 지역입니다.");
                continue;
            }
            List<String> candidates = regionCandidates.get(region);
            System.out.println("후보 목록: "+candidates);
            System.out.print("투표할 후보 이름 입력: ");
            String name=sc.nextLine();
            if(candidates.contains(name)){
                voteCount.put(name, voteCount.get(name)+1);
                System.out.println(name+"후보에게 투표되었습니다!");
            }else{
                System.out.println("해당 지역에 없는 후보입니다.");
            }
        }

        // 최종 결과 출력
        System.out.println("\n===== 최종 득표 결과 =====");
        for(Map.Entry<String, Integer> entry:voteCount.entrySet()){
            System.out.printf("%s : %d표\n",entry.getKey(), entry.getValue());
        }

        System.out.println("\n=====지역별 후보자 목록=====");
        for(String r:regionCandidates.keySet()){
            System.out.printf("%s지역 %s", r, regionCandidates.get(r));
        }

        sc.close();
    }
}
