package springboot.test.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardFormDto {
    private Long id;
    private String writerid;
    private String writer;
    private String title;
    private String content;
    private String imagePath;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Board toEntity(){
        Board build = Board.builder().id(id).writerid(writerid).writer(writer)
                .title(title).content(content).imagePath(imagePath).build();
        return build;
    }

    @Builder

    public BoardFormDto(Long id, String writerid, String writer, String title, String content,
                        String imagePath, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.writerid = writerid;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.imagePath = imagePath;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
