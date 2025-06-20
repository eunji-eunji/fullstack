package spring.boardTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boardTest.domain.Board;

import java.util.List;
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAll();
}
