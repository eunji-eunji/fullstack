package a0402.Optional1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        // 더미 데이터 추가
        users.add(new User(1L, "Alice"));
        users.add(new User(2L, "Bob"));
        users.add(new User(3L, "Charlie"));
    }

    public Optional<User> findById(long l) {
        for (User user : users) {
            if (user.getId().equals(l)) { // 조건에 맞는 유저를 찾으면
                return Optional.of(user);
            }
        }
        // return Optional.empty(); // 없으면 빈 optioanl 반환
        return users.stream()
        .filter(user->user.getId().equals(l))
        .findFirst();
        // 첫 번째로 조건에 만족하는 객체를 Optional로 감싸서 반환
        // 없으면 알아서 empty로 반환함

    }

}
