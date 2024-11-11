package com.ohgiraffers.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private  final MemberDAO memberDAO;

    // 생성자 주입입으로 빈 머시기냐 한다
    @Autowired
    public MemberService(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    // 전체조회 하는 DAO 로직 호출하는 구문
    public Map<Long,MemberDTO> selectMembers(){
        System.out.println("검색하는 멤버스 메소드 실행");

        return memberDAO.selectAllMembers();
    }

    //

    public MemberDTO selectMember(Long no){
        System.out.println("검색하는 멤버 메소드 실행");
        return memberDAO.selectMemberByNo(no);
    }

}
