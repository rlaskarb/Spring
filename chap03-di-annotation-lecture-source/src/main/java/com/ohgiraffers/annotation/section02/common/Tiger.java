package com.ohgiraffers.annotation.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Primary
public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("타이거가 인간이 되기 위해 쑥과 마늘을 먹고 있어요");
    }
}
