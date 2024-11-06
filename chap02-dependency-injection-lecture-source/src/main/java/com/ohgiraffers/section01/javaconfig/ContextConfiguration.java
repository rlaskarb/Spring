package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account account(){
        return new PersonalAccount(20,"115-114983-01-010");

    }

    @Bean
    public MemberDTO member(){
        return new MemberDTO(1,"김남규","rlaskarb20@naver.com",account());
    }

}
