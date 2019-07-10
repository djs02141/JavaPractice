package org.dimigo;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // 1.if~else
//        선거권 연령: 만 19세
        int age = 17;
        //나이가 만 19세 이상이면 "투표" or "선궈건 없"

        if (age>=19)
            System.out.println("투표하러 가세요");
        else
            System.out.println("선거권이 없습니다.");

        //2. switch문
        // 주사위 랜덤값뽑기

        System.out.println(new Random().nextInt(6)+1);
        int num = new Random().nextInt(6)+1;
        //switch num 짝> "짝수" 홀>"홀수" 둘다 아니면 "누구냐 넌"

        switch(num%2){
            case 0:
                System.out.println("짝수");
                break;
            case 1:
                System.out.println("홀수");
                break;
            default:
                System.out.println("Who are you");
                break;
        }

        String menu="치킨";

        switch(menu) {
            case "치킨":
                System.out.println("치킨선택");
                break;
            case "피자":
                System.out.println("피자 선택");
                break;
            default:
                    System.out.println("be on diet");
                break;
        }


    }
}
