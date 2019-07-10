package org.dimigo.oop.interfaces;

import org.dimigo.oop.inherent2.abstractclass.Engine;

public class BenzEngine implements IEngine{

    @Override
    public void startEngine() {
        System.out.println("Benz엔진 기동");

    }

    @Override
    public void stopEngine() {
        System.out.println("Benz엔진 멈춤");
    }
}
