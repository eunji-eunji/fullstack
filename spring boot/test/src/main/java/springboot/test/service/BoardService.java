package springboot.test.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.test.domain.Board;
import springboot.test.domain.BoardFormDto;
import springboot.test.repository.BoardRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardFormDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }

    @Transactional
    public List<BoardFormDto> getBoardList(){
        List<Board> boardList = boardRepository.findAll();
        List<BoardFormDto> boardDtoList = new ArrayList<>();
        for(Board board : boardList){
            BoardFormDto boardDto = BoardFormDto.builder().id(board.getId()).writerid(board.getWriterid())
                    .writer(board.getWriter()).title(board.getTitle()).content(board.getContent())
                    .imagePath(board.getImagePath()).createdDate(board.getCreatedDate()).build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }

    // 아이디로 찾기
    public Board getBoardById(Long id){
        Board board = boardRepository.findById(id).get();
        return board;
    }

    // 삭제하기
    public void deleteBoardById(Long id){
        boardRepository.deleteById(id);
    }

//    public Page<Board> listAll(int pageNum, String sortField, String sortDir){
//        int pageSize = 5;
//        Pageable pageable = PageRequest.of(pageNum-1, pageSize, sortDir.equals("asc")?
//                Sort.by(sortField).ascending() : Sort.by(sortField).descending());
//        return boardRepository.findAll(pageable);
//        // pageNum : 요청하는 페이지 번호(1부터 시작)
//        // sortField : 정렬한 컬럼명
//        // sortDir : 정렬 방향. asc, desc
//        // pageRequest.of : 페이지 요청정보를 만들는 메서드
//        // pageNum-1 : data jpa는 0부터 페이지번호를 계산하기 때문에 pageNum에서 1을 뺌
//        // pageNum -1  : data jpa 0부터 페이지번호 셈해서 pageNum 에서 1을 뺌
//        // pageSize : 한 페이지에 몇 개의 항목을 가져올지
//        // Sort.by(sortField) :   sortField 기준정렬
//        // sortDir.equals("asc") 체크 후 오름차순인지 내림차순인지 설정
//    }

    public List<Board> list() {
        return boardRepository.findAll();
    }
}
