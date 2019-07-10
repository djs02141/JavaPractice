package org.dimigo.oop.inherent2.abstractclass;

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
