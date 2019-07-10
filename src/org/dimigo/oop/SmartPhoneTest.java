package org.dimigo.oop;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] phone={new IPhone("iPhone Xs","애플",1370000),
                            new Galaxy("갤럭시 S10","삼성",1500000)};

        for(SmartPhone a:phone){
            System.out.println(a);
            a.turnon();
            a.pay();
            a.useSpecialFunction();
            a.turnoff();
            System.out.println();
        }

    }
}
