package a0402.Optional1;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        // 존재하는 ID로 검색
        Optional<User> userOptional1 = userRepository.findById(2L);
        userOptional1.ifPresentOrElse(user->System.out.println(user), 
        // user가 있을 경우 user를 출력하고, user만 써도 toString 자동으로 불러옴
        ()->System.out.println("없음"));
        // 없으므로 빈 객체 '()'를 보냄

        Optional<User> userOptional2 = userRepository.findById(9L);
        userOptional2.ifPresentOrElse(user->System.out.println(user), 
        // user가 있을 경우 user를 출력하고, user만 써도 toString 자동으로 불러옴
        ()->System.out.println("없음"));

        Optional<User> userOptional3 = userRepository.findById(50L);
        userOptional3.ifPresentOrElse(user->System.out.println(user), 
        // user가 있을 경우 user를 출력하고, user만 써도 toString 자동으로 불러옴
        ()->System.out.println("없음"));

        // 기본값 제공
        User defaultUser = userOptional3.orElse(new User(0l,"default user"));
        System.out.println(defaultUser);
    }
}

// findById 메서드 : 아이디로 사용자 리스트를 검색하고 결과를 Optional<User>로 반환
// Optional.empty() - 사용자가 없을 때 반환
// Optional 처리방식 
//  - ifPresentOrElse : 값이 있으면 처리, 없으면 대체 동작 수행
//  - orElse : 값이 없으면 기본값을 반환
//  - orElseThrow : 값이 없으면 예외를 던짐