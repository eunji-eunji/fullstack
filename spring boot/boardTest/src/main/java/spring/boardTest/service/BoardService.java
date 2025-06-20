package spring.boardTest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import spring.boardTest.domain.Board;
import spring.boardTest.domain.BoardDto;
import spring.boardTest.domain.Member;
import spring.boardTest.repository.BoardRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    @Value("${upload.dir}")
    private String uploadDir;

    public Board create(BoardDto dto, Member writer) throws IOException {
        Board board = new Board();
        board.setTitle(dto.getTitle());
        board.setContent(dto.getContent());
        board.setWriter(writer);

        if (!dto.getImage().isEmpty()) {
            // 1. 파일 이름 생성(UUID를 이용하여 랜덤한 파일명 생성)
            String filename = UUID.randomUUID() + "_" + dto.getImage().getOriginalFilename();
            // 2. 저장한 경로 생성(uploadDir : application.properties에서 설정한 경로)
            Path path = Paths.get(uploadDir, filename);
            // 3. 디렉토리가 없으면 생성
            Files.createDirectories(path.getParent());
            // 4. 실제 이미지 저장
            Files.copy(dto.getImage().getInputStream(), path);
            // 5. DB에 저장할 이미지 경로 설정
            board.setImagePath("/uploads/" + filename);
        }
        return boardRepository.save(board);
    }

    public List<Board> list() {
        return boardRepository.findAll();
    }

    public Board findById(Long id) {
        return boardRepository.findById(id).orElseThrow();
    }

    public void update(Long id, BoardDto dto) throws IOException {
        Board board = findById(id);
        board.setTitle(dto.getTitle());
        board.setContent(dto.getContent());

        if (!dto.getImage().isEmpty()) {
            String filename = UUID.randomUUID() + "_" + dto.getImage().getOriginalFilename();
            Path path = Paths.get(uploadDir, filename);
            Files.createDirectories(path.getParent());
            Files.copy(dto.getImage().getInputStream(), path);
            board.setImagePath("/uploads/" + filename);
        }
        boardRepository.save(board);
    }

    public void delete(Long id) {
        boardRepository.deleteById(id);
    }
}
