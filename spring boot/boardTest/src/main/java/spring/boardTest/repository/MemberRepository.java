package spring.boardTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boardTest.domain.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByMemberId(String memberId);
}
