package spring.boardTest.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BoardDto {
    private String writer;
    private String title;
    private String content;
    private MultipartFile image;
}
