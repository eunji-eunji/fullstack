package spring.boardTest.domain;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Table(name = "member")
@Data
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "memberId")
    private String memberId;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static Member createMember(@Valid MemberDto dto, PasswordEncoder passwordEncoder) {
        return Member.builder().memberId(dto.getMemberId()).password(passwordEncoder.encode(dto.getPassword()))
                .name(dto.getName()).phone(dto.getPhone()).email(dto.getEmail()).address(dto.getAddress())
                .role(Role.USER).build();
    }
}
