package com.ohgiraffers.section02.initdestroy.subsection01.java;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfig {

    @Bean
    public Product kimchi () {
         return  new Food("겉잘이",2000,new Date());
    }

    @Bean
    public  Product coke(){
        return  new Drink("콜라",1500,500);
    }

    @Bean
    public Product soda(){
        return new Drink("밀키스", 1800,250);
    }

    @Bean
    @Scope("prototype")
    public Cart cart(){
        return new Cart();
    }


    @Bean(initMethod = "openShop",destroyMethod = "closeShop")
    public Owner owner(){
        return new Owner();
    }






}
