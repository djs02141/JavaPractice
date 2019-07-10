package org.dimigo.oop.interfaces;

import org.dimigo.oop.inherent2.abstractclass.Engine;

public class BMWEngine implements IEngine{

    @Override
    public void startEngine() {
        System.out.println("BMW엔진 기동");

    }

    @Override
    public void stopEngine() {
        System.out.println("BMW엔진 멈춤");
    }
}
