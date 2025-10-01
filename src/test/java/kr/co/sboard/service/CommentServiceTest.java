package kr.co.sboard.service;

import kr.co.sboard.dto.CommentDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentServiceTest {
    @Autowired
    CommentService commentService;

    @Test
    void getCommentAll() {
        List<CommentDTO> dtoList = commentService.getCommentAll(5);
        System.out.println(dtoList);

    }

    @Test
    void getComment() {
    }

    @Test
    void save() {
        CommentDTO commentDTO = CommentDTO.builder()
                .ano(50)
                .content("1번 댓글1")
                .writer("whddls0323")
                .reg_ip("127.0.0.1")
                .build();

        commentService.save(commentDTO);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}