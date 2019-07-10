package org.dimigo.oop.collection;

import org.dimigo.oop.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //1.list계열 : ArrayList
//        List list = new ArrayList();
//        list.add("나자바");
//        list.add(100);
//        list.add(new Dog("멍멍이"));
//
//        list.get(0);
        //제네릭 list안에 들어가는것의 형식 지정
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        printList(list);
        list.add(1,"포도");
        printList(list);
        list.add(2,"바나나");
        printList(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() -1));

        list.remove(0);
        printList(list);

        list.remove("딸기");
        printList(list);

        list.clear();
        System.out.println(list);
    }
    private static void printList(List<String> list){
        for(String s:list){
            System.out.println(s+" | ");
        }
        System.out.println();
    }
}
