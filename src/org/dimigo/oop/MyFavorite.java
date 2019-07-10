package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        String[] question = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };
        int num=0;
        int menu = 0;

        do {
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            Scanner scanner = new Scanner(System.in);
            // next()는 단어 입력, nextLine()은 한 라인 입력
            System.out.println("------------------");
            System.out.printf("메뉴 선택 => ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    num = new Random().nextInt(3);
                    System.out.printf(question[num]).append(" ");
                    String answer = scanner.next();
                    if(answer.equals(answers[num]))
                        System.out.println("정답입니다!");
                    else
                        System.out.println("틀렸습니다!");
                    break;
                case 2:
                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<3;i++)
                    {
                        sb.append(question[i]).append(" ");
                        sb.append(answers[i]);
                        sb.append("입니다.\n");
                    }
                    System.out.println(sb);
                    break;
                case 3:
            }
        } while (menu != 9);
    }
}