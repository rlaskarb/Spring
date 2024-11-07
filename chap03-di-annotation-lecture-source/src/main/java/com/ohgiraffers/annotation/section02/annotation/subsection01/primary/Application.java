package com.ohgiraffers.annotation.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.srction02");
        
        
        
        String[] beanName = context.getBeanDefinitionNames();
        for(String bean : beanName){
            System.out.println("bean = " + bean);
        }

        AnimalService animalService
                = context.getBean("primaryService",AnimalService.class);

        animalService.animalEat();
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
