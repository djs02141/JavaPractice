package org.dimigo.oop.interfaces;

//인터페이스 : 하나의 표준/규약/명세
public interface IAnimal {
    // 상수처리(public static final 자동 붙임)
    String farmName = "디미 동물농장";

    void bark(); // public abstract 자동으로 붙는다.

    //JDK8부터 추가 (default추가)
    default void eat() {
        System.out.println("냠냠");
    }
    //정적 메소드
    static void welcome(){
        System.out.println(farmName+"에 오신것을 환영합니다.");
    }

}
