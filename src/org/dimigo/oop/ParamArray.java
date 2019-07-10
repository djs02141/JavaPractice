package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intarr ={1,2,3,4,5};
        add(intarr,10);//11,12,13,14,15
        printArray(intarr);

        String[] names={"홍길동","홍길서","홍길남","홍길북"};
        chageName(names);
        printArray(names);
    }

    private static void printArray(String[] names)
    {
        for(String value : names){
            System.out.println(value +"|    ");

        }
        System.out.println();
    }

    private static void chageName(String[] names) {
    for(int i=0; i<names.length;i++){
        names[i]="김"+names[i].substring(1);

    }

    }

    private static void printArray(int[] intarr) {
        for(int a:intarr){
            System.out.println(a+"|");
        }
        System.out.println();
    }

    private static void add(int[] intarr, int i) {

        for (int j = 0; j < intarr.length; j++) {
            intarr[j] += i;
        }
    }
}
