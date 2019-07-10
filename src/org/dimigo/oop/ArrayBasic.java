package org.dimigo.oop;



public class ArrayBasic {
    public static void main(String[] args) {
        //기본형 타입 배열
        //int, float,double,char,boolean, byte, long,short
        int[] intArr = null;
        intArr = new int[5];

        printArray(intArr);


        //double타입 5ro배열 생성후 출력

        double[] doubleArr = null;
        doubleArr = new double[5];

        printArray(doubleArr);

        //참조형 타입 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "임도우";
        strArr[1] = "김가은";
        strArr[2] = "임도우";
        printArray(strArr);

        String[] strArr2 = {"ITZY", "소녀시대", "걸스데이"};
        printArray(strArr2);

        //Book 타입 배열 2개짜리 생성
        //Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "민경도", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 200);

        printArray(bookArr);

        Book[] bookArr2 = new Book[]
                {new Book("수학의 바이블", "민경도", 100),
                        new Book("워드마스터", "전유원", 200)};

        //배열시 주의사항
        //

    }
        private static void printArray (Book[] bookArr){
            for (Book value : bookArr) {
                System.out.println(value);

            }
        }

        private static void printArray(int[] intArr){
            for (int value : intArr) {
                System.out.print(value + "|");
            }
        }

        private static void printArray ( double[] doubleArr){
            for (double value : doubleArr) {
                System.out.print(value + "|");
            }
            System.out.println();
        }

        private static void printArray (String[] strArr){
            for (String value : strArr) {
                System.out.print(value + "|");
            }
        }
    }
