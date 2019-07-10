package org.dimigo.oop.inheritance;

public class Student extends Person {
    private String studentId;



    public Student(String name,int age, int height, int weight,String studentId) {
        super(name,age,height,weight);
        this.studentId = studentId;

    }

    public void exam(){
        System.out.println(getName()+"이 시험을 봅니다.");
    }
    public void study(){
        System.out.println(getName()+"이 공부를 합니다.");
    }

    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString();
    }
}