package org.dimigo.oop;

public class Person {
   // private final String type ="포유류";
    private final String birthDate ;
    private String name;
    public static final String TYPE="포유류";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "type='" + TYPE + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020606","김수겸");
        Person p2 = new Person("20020214","윤지섭");
        System.out.println(p1);
        System.out.println(p2);


       //  p1.type="파충류류"
        System.out.println(Person.TYPE);

    }
}
