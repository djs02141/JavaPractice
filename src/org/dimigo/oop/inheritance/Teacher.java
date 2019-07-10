package org.dimigo.oop.inheritance;

public class Teacher extends Person{
    private String subject;

    public void teach(){
        System.out.println(getName()+"샘이 공부를 가르칩니다.");
    }
    public void doTask(){
        System.out.println(getName()+"샘이 일을 합니다.");
    }

    public Teacher(String name,int age, int height, int weight,String subject) {
      super(name,age,height,weight);
        this.subject = subject;

    }

    public void exam(){
        System.out.println(getName()+"이 시험을 봅니다.");
    }
    public void study(){
        System.out.println(getName()+"이 공부를 합니다.");
    }

    public String toString() {
        return "Student{" +
                "studentId='" + subject + '\'' +
               this.toString();

    }

}
