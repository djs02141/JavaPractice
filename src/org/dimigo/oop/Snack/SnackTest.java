package org.dimigo.oop.Snack;

public class SnackTest {
    static int carprice;

    public static void main(String[] args) {
        Snack[] snack = {new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)};
        printsnack(snack);

    }

    private static void printsnack(Snack[] snack) {
        for (Snack value : snack) {
            System.out.println(value.toString());
            carprice += value.carprice();
        }
        System.out.printf("총 구매 금액 : %,d",carprice);

    }
}

