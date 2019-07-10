package org.dimigo.oop.interfaces;

import org.dimigo.oop.inherent2.abstractclass.Engine;

public class Car implements IEngine{
    private IEngine engine;

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void Start(){
        engine.startEngine();
    }
    public void Stop(){
        engine.stopEngine();
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
}
