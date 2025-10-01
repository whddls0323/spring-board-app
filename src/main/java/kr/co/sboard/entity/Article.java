package kr.co.sboard.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SB_ARTICLE")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ano;

    private String cate;
    private String title;
    private String content;
    private int comment_cnt;
    private int file_cnt;
    private int hit_cnt;
    private String reg_ip;
    private String writer;

    @CreationTimestamp
    private LocalDateTime wdate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ano")
    private List<File> fileList;

    // 추가필드
    @Transient // 엔티티 컬럼 제외
    private String nick;

    public void setNick(String nick) {
        this.nick = nick;
    }
}