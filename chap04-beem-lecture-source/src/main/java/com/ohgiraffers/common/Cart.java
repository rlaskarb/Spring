package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private  final List<Product> items ; // 카트에 담긴 상품들

    public Cart(){
        items = new ArrayList<>();

    }

    public void addItem(Product item){
        items.add(item);
    }


    public List<Product> showCart(){
        return items;

    }

}

