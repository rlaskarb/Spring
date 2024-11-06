package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonalAccount implements Account{
    private final int bankCode; // 은행 코드
    private  final String accNo; // 계좌번호
    private int balance1; // 잔액


    public PersonalAccount(int bankCode, String accNo){
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo +"계좌의 잔액은 " + this.balance1 + "원 입니다." ;
    }

    @Override
    public String deposit(int money) {
        String str = " ";
        if(money >=0){
            this.balance1 += money;
            str = money + "원이 입금 되었습니다.";
        }else{
            str = "다시 한번만 더 입금해줘요 잘못 입금되었요";
        }

        return str;
    }

    @Override
    public String withDraw(int money) {
        String str = " ";
        if(this.balance1>= money){
            this.balance1-= money;
            str = money + "원이 출금되었습니다.";
        }else {
            str="잔액 부족 입니닷";
        }
        return str;
    }
}
