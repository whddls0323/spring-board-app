package kr.co.sboard.dto;

import jakarta.persistence.Table;
import kr.co.sboard.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String usid;
    private String pass;
    private String us_name;
    private String nick;
    private String email;
    private String hp;

    @Builder.Default //기본 값
    private String us_role = "MEMBER";
    private String zip;
    private String addr1;
    private String addr2;
    private String reg_ip;
    private String reg_date;
    private String leave_date;
}