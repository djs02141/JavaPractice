package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        //문자열 리터럴 풀 방식 (literar pool) heap에 생성, 동일한 문자열 다시써
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        //new 객체 생성방식 새로 만들어
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        //문제
        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "야옹이");

        String id = null;

        if ("admin".equals(id)){
            System.out.println("관리자");}
        else {
            System.out.println("관리자 아님");
        }

        testString();

    }
    private static void testString(){
                 //01234567890123
        String s ="abcdefgABCDEFG";

        System.out.println(s.length());        //14
        System.out.println(s.substring(3));    //defgABCDEFG
        System.out.println(s.substring(3,6));  //def
        System.out.println(s.indexOf("C"));    //9
        System.out.println(s.charAt(9));       //C
        System.out.println(s.concat("ABC"));   //abcdefgABCDEFGABC
        System.out.println("        asdf          ".trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("a","A"));
        System.out.println(s.startsWith("abc"));//abc로 시작하면 true 아니면 false
        System.out.println(s.endsWith("EFG"));  //FG로 끝나면 true 아니면 false
        System.out.println();
    }
}
