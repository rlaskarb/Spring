package com.ohgiraffers.common;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Drink extends Product{

    private  int capacity; // 음료수 용량(ml)


    public Drink(){
        super();  // 부모 //()<- 부모의 기본 생성자를 호출하겠다 라는 의미
    }


    public  Drink(String name, int price , int capacity){
        super(name,price);
        this.capacity =capacity;

    }


    @Override
    public String toString(){
        return super.toString() + " " + this.capacity;
    }




}
