package org.dimigo;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num=-1;
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        int menu =0;
        do {
            System.out.println("--------------------");
            System.out.println("<<게임메뉴>>\n");
            System.out.println("1.캐릭터 설정\n");
            System.out.println("2.공격력 증가\n");
            System.out.println("3.공격력 감소\n");
            System.out.println("9.종료\n");
            Scanner scanner = new Scanner(System.in);

            System.out.println(new Random().nextInt(4)+1);

            System.out.println("--------------------");
            System.out.println("메뉴입력 =>");
            menu=scanner.nextInt();
            switch (menu){
                case 1:
                    num = new Random().nextInt(4)+1;
                    System.out.println(character[num]+"(으)로 설정되었습니다");
                    break;
                case 2:
                    if (num == -1)
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                    else
                    {   attackPoint[num] += 10;
                        System.out.println(character[num]+" 공격력이 증가되었습니다. 현재 공격력 : "+attackPoint[num]);
                        }
                    break;
                case 3:
                    if (num == -1)
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                    else {
                        attackPoint[num] -= 10;
                        System.out.println(character[num] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[num]);
                    }break;
                case 9:
                    scanner.close();
                    System.out.println("이제 공부하세요!!");
                    break;

                default:
                    System.out.println("없는 메뉴입니다!!");
                    break;

            }
        }while(menu != 9);

    }
}
