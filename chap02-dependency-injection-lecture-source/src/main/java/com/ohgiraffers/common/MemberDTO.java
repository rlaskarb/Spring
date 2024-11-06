package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class MemberDTO {

    private int no;
    private String name;
    private String email;
    private Account personalAccount; //

}
