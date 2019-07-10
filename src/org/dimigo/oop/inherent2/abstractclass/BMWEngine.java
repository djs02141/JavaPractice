package org.dimigo.oop.inherent2.abstractclass;

public class BMWEngine extends Engine{

    @Override
    public void startEngine() {
        System.out.println("BMW엔진 기동");

    }

    @Override
    public void stopEngine() {
        System.out.println("BMW엔진 멈춤");
    }
}
