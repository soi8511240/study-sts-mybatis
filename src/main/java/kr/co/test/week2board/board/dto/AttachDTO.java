package kr.co.test.week2board.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AttachDTO {
    private Long id;
    private Long boardId;
    private String originalFileName;
    private String storedFileName;
}
