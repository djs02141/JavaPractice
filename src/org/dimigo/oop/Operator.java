package org.dimigo;

public class Operator {
    public static void main(String[] args){
        long cash = 1700000L;
        long staff = 3L;
        long num = 1500L;
        System.out.println("<<디미벅스 연간 인건비>>\n");
        System.out.printf("월 평균 급여 : %,d",cash);
        System.out.printf("점포 내 직원 수 : %d",staff);
        System.out.printf("점포수 : %,d",num);
        System.out.printf("연간 인건비 : %,d",cash*12*staff*num);
    }
}
