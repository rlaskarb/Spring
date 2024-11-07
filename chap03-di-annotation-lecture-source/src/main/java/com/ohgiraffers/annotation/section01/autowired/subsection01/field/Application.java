package com.ohgiraffers.annotation.section01.autowired.subsection01.field;

import com.ohgiraffers.annotation.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        /*index 1. 의존성 주입(1) - 필드*/

        /*comment
        *   @Autowired 어노테이션
        *   객체와 객체간의 의존선을 생성할 때 대표적인
        *   어노테이션이다.
        *   1. 필드 주입 - SI 업체에서 사용 20% - 장점: 간결하다.
        *   2. 생성자 주입 - 79%
        *   3. setter 주입*/

        //클래스를 전달해도 되지만, 문자열을 전달하게 되면 문자열이 곧 Bean 을 스캔 할 컴포넌트 스캔의 범위가 된다.
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.annotation.section01");
        
        BookService service = context.getBean("fieldService" ,BookService.class);

        List<BookDTO> bookList = service.SelectBookList();
        for(BookDTO book : bookList ){
            System.out.println("book = " + book);
        }
    }   
}
