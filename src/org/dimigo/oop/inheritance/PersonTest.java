package org.dimigo.oop.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p= new Person("아이유",25,160,45);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("윤지섭",18,168,58,"2419");
        System.out.println(s);
        s.study();
        s.exam();
        s.eat();

        Teacher t = new Teacher("지은혜",28,65,50,"컴네");
        t.teach();
        t.study();
        t.doTask();
        t.sleep();

    }
}
