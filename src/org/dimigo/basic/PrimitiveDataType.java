package org.dimigo.basic;

public class PrimitiveDataType {
    static boolean isMale ;
    public static void main(String[] args){
        String name ="아이유";
        boolean isMale= false;
        int age=25;
        double height=161.8;
        float weight=44.3f;
        char bloodType='A';
        String titlesong="삐삐";

        System.out.println("이름 : "+name);
        System.out.println(isMale ? "성별 : 남자":"성별 : 여자");
        System.out.printf("나이 : %d세\n",age);
        System.out.printf("키 : %.1fcm\n",height);
        System.out.printf("몸무게 : %.1fkg\n",weight);
        System.out.printf("혈액형 : %c형\n",bloodType);
        System.out.println("대표곡 : "+titlesong);
    }
}
