package spring.boardTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boardTest.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
