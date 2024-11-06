package com.ohgiraffers.section03.annotationconfig.subsetion01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        /*index 3. java-annotation 방식 */
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        /*comment
         * @ComponentScan
         * basePackage 로 설정 된 하위 경로에 특정 어노테션을
         * 가지고 있는 클래스를 Bean 으로 등록해주는 기능
         * 특정 어노테이션은 @Component 이며
         * 특수한 목적에 따라서
         * @Controller,@Service,@Repository, @Configuration 등을 사용한다.*/

        // getBeanDefinitionNames : 컨테이너에 생성 된 bean 이름 반환

        String [] nameList = context.getBeanDefinitionNames();

        for (String str : nameList){
            System.out.println("str = " + str);
        }

        MemberDAO memberDAO = context.getBean("memberDAO",MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03","pass03","하츄핑")));
        System.out.println(memberDAO.selectMember(3));

    }
}
