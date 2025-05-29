package loginBoard.board2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // 회원이 작성한 글
    @OneToMany(mappedBy = "writer")
    private List<Board> boards = new ArrayList<>();
    // user는 한 명이고, 여러 보드를 가질 수 있음.
    // 보드는 하나의 유저(writer)만 가리킴.
    // 보드가 연관 관계의 주인이고, 유저는 mappedBy로 관계만 나타냄.
}
