package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class Food extends Product {
    private Date bakedDate;  // 음식이 만들어진 시간


    public Food(String name , int price , Date bakedDate){
        super(name , price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.bakedDate;
    }

}


