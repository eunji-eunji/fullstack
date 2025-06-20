package spring.boardTest.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String imagePath;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member writer;

    public Board() {
    }
}
