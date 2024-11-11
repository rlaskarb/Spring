package com.ohgiraffers.annotation.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Primary // 2개이상 설정하게 되면 에러 발생
@Order(1)
public class Raccoon implements Animal{


    @Override
    public void eat() {
        System.out.println("라쿤이 농심 너구리을 먹고 있어요");
    }
}
