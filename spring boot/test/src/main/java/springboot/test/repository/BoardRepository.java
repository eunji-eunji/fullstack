package springboot.test.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springboot.test.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
