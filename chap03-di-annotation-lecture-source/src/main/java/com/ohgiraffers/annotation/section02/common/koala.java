package com.ohgiraffers.annotation.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
/*comment
* @Primary 어노테이션을 설정하면
* @AutoWired 로 동일한 타입(Animal)의
* 여러 Bean 을 찾게 되는 경우
* 자동으로 연결을 우선 시 할 타입으로 설정되게 된다.
* 동일한 타입의 클래스 중 한 개만 @primary 어노테이션을 사용할 수 있다.
* */

//@Primary
@Order(3)
public class koala implements Animal{
    @Override
    public void eat() {
        System.out.println("코알라가 등운동 하기전에 단백질 쉐이크를 타서 먹고 있어요!");
    }
}
