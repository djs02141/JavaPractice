package org.dimigo.oop;

public class Calculator {
    // (인스턴스) 필드(static 없을때 / 객체를 new로 만들때 생김)
    private  int num1;
    private  int num2;
    private  boolean powerFlag;
    //생성자
    public Calculator(){

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //인스턴스 메소드(static 없을때 / 객체가 만들어진 상태여야 호출 가능함)
    public void powerOn(){
        System.out.println("전원을 켭니다");
    }
    public void powerOff(){
        if(powerFlag){
            System.out.println("전원을 끕니다.");
            powerFlag=false;
        }
    }
    public int add(){
        if (powerFlag==false)
        {
            System.out.println("전원을 켭니다");
            powerFlag=true;
        }
        System.out.println(this);
        return this.num1+this.num2;
    }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return num1*num2;
    }
    public double div(){
        return (double)num1/num2;
    }

    public static void main(String[] args) {

    }


}
