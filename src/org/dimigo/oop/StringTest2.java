package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //String으로 문자열 생성
        String str = "디미고";
        str += "2학년";
        str += "4반";
        str += "임도우";

        //string buffer , StringBuilder
        StringBuilder sb = new StringBuilder("디미고");
        sb.append("2학년").append("4반").append("임도우");

        System.out.println(sb);


        compareSped();
    }
    private static void compareSped(){
        long start = System.currentTimeMillis();

        String str="abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);
        for(int i=0;i<100000;i++){
           // str += "def";
            sb.append("def");

        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
