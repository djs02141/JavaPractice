package org.dimigo.oop;

public class List {
    public List() {
    }
    private int Price;
    private String name;
    private int num;
    private int disprice;
    private int date;

    public void delete() {
        System.out.println("삭제되었습니다.");
    }

    public void order() {
        System.out.println("주문되었습니다.");
    }

    public void numchange(int type) {
        System.out.println(num+"개로 변경되었습니다");
    }

    public void Continue() {
        System.out.println("쇼핑을 계속합니다.");
    }

    public boolean check() {
        System.out.println("선택되었습니다");
        return true;
    }
}