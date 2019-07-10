package org.dimigo.oop.interfaces;

import org.dimigo.oop.inherent2.abstractclass.BMWEngine;
import org.dimigo.oop.inherent2.abstractclass.BenzEngine;
import org.dimigo.oop.inherent2.abstractclass.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new BenzEngine());
        car.Start();
        car.Stop();
        System.out.println("===엔진 교체===");
        car.setEngine(new BMWEngine());
        car.Start();
        car.Stop();

    }
}
