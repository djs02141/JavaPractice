package org.dimigo.oop.inherent2.abstractclass;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void Start(){
        engine.startEngine();
    }
    public void Stop(){
        engine.stopEngine();
    }
}
