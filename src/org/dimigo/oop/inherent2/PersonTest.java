package org.dimigo.oop.inherent2;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        Korean k = new Korean("홍길동");
        Japanese j = new Japanese("다나카");
        Chinese c = new Chinese("왕밍");

        Person[] person = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for(Person a:person){
            greeting(a);
        }
    }

    public static void greeting(Person p){
        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }
}
