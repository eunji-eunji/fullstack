package springboot.test.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import springboot.test.domain.Board;
import springboot.test.domain.BoardFormDto;
import springboot.test.domain.Member;
import springboot.test.repository.BoardRepository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    @Value("${upload.dir}")
    private String uploadDir;


    public List<Board> list() {
        return boardRepository.findAll();
    }

    public void create(BoardFormDto dto, Member writer) throws IOException {
        Board board = new Board();
        board.setTitle(dto.getTitle());
        board.setContent(dto.getContent());
        board.setWriter(writer);

        if (!dto.getImagePath().isEmpty()) {
            // 1. 파일 이름 생성(UUID를 이용하여 랜덤한 파일명 생성)
            String filename = UUID.randomUUID() + "_" + dto.getImagePath().getOriginalFilename();
            // 2. 저장한 경로 생성(uploadDir : application.properties에서 설정한 경로)
            Path path = Paths.get(uploadDir, filename);
            // 3. 디렉토리가 없으면 생성
            Files.createDirectories(path.getParent());
            // 4. 실제 이미지 저장
            Files.copy(dto.getImagePath().getInputStream(), path);
            // 5. DB에 저장할 이미지 경로 설정
            board.setImagePath("/uploads/" + filename);
        }
        boardRepository.save(board);
    }
    public Board findById(Long id) {
        return boardRepository.findById(id).orElseThrow();
    }

    public void update(Long id, BoardFormDto dto, MultipartFile imageFile) throws IOException {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));
        board.setTitle(dto.getTitle());
        board.setContent(dto.getContent());
        // 이미지가 새로 업로드된 경우
        if (imageFile != null && !imageFile.isEmpty()) {
            // 기존 이미지 삭제 (선택 사항)
            if (board.getImagePath() != null) {
                File oldFile = new File(uploadDir, board.getImagePath());
                if (oldFile.exists()) oldFile.delete();
            }

            // 새 파일 저장
            String originalFilename = imageFile.getOriginalFilename();
            String newFilename = UUID.randomUUID() + "_" + originalFilename;
            File dest = new File(uploadDir + File.separator + newFilename);
            imageFile.transferTo(dest);

            board.setImagePath(newFilename);
        }
        boardRepository.save(board);
    }

    // 삭제하기
    public void deleteBoardById(Long id){
        boardRepository.deleteById(id);
    }
}
