package com.ohgiraffers.annotation.section02.annotation.subsection02.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.annotation.section02");
        
        
        
        String[] beanName = context.getBeanDefinitionNames();
        for(String bean : beanName){
            System.out.println("bean = " + bean);
        }

        AnimalService animalService
                = context.getBean("qualifierService", AnimalService.class);

        animalService.animalEat();
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
