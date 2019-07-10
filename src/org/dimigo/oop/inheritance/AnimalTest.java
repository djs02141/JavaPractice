package org.dimigo.oop.inheritance;

import org.dimigo.oop.inheritance.Animal;
import org.dimigo.oop.inheritance.Cat;
import org.dimigo.oop.inheritance.Dog;
import org.dimigo.oop.inheritance.Tiger;

public class AnimalTest {
    public static void main(String[] args) {

        Animal[] animals = {
                new Animal("동물"),
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for (Animal a : animals) {
            doAction(a);
        }



        Animal a = new Animal("동물");

        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();       // Animal 의 bark()

        Animal d = new Dog("멍멍이");
        System.out.println(d);
        d.bark();       // Animal 의 bark()
//        d.wag();

        Animal c = new Cat("야옹이");
        System.out.println(c);
        c.bark();       // Cat 의 bark()
//        c.scratch();

        Animal t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();       // Tiger 의 bark()
//        t.hunt();
    }


    private static void doAction(Animal a) {
        System.out.println(a);
        a.eat();        //Animal.eat()
        a.sleep();      //Animal.sleep()
        a.bark();
    }
}