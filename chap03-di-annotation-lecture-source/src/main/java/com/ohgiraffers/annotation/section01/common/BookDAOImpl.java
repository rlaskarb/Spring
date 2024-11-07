package com.ohgiraffers.annotation.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;
//@Component
//@Component 의 열할에 따라 특수한 @Repository 어너테이션
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

    private final Map<Integer , BookDTO> bookList;

    public BookDAOImpl(){
        bookList= new HashMap<>();
        bookList.put(1, new BookDTO(1,152,"인생은 실전이야 종만아","엮은이","옛날옛적에",new Date()));
        bookList.put(2, new BookDTO(2,1252,"나의 라임 오지는 나무","엮은이","옛날옛적에",new Date()));
        bookList.put(3, new BookDTO(3,1532,"어린 환자","엮은이","옛날옛적에",new Date()));
        bookList.put(4, new BookDTO(4,1572,"백설공주는 어장관리중","엮은이","옛날옛적에",new Date()));
        bookList.put(5, new BookDTO(5,1652,"세종대왕의 엑스칼러버","엮은이","옛날옛적에",new Date()));
    }

    @Override
    public List<BookDTO> selectBooklist() {
        return new ArrayList<>(bookList.values());
    }




    @Override
    public BookDTO selectBookByNo(int no) {
        return bookList.get(no);
    }
}
