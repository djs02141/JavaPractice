package org.dimigo.oop.inherent2.abstractclass;

public class BenzEngine extends Engine{

    @Override
    public void startEngine() {
        System.out.println("Benz엔진 기동");

    }

    @Override
    public void stopEngine() {
        System.out.println("Benz엔진 멈춤");
    }
}
