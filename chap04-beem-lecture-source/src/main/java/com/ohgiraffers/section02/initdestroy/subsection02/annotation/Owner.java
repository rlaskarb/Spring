package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @PostConstruct // init methode  빈생성 전 동작하는 메소드
    public void openShop(){
        System.out.println("사장님이 가게 문을 열었습니다. 쓸어 담으세요");
    }



    @PreDestroy // destroy- method 컨테이너 종료시 동작하는
    public void closeShop(){
        System.out.println("사장님이 가게 문을 닫았습니다. 괴도 좀도둑이 되어보세요");
    }




}
