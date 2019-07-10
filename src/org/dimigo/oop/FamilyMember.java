package org.dimigo.oop;

public class FamilyMember {
    private static int membercnt;
    private String membername;

    public FamilyMember(String membername) {
        this.membername = membername;
        membercnt ++;
    }

    public String getMembername() {
        return membername;
    }

    public static void printMemberCnt(){
        System.out.println("가족 총 인원 수 : "+ membercnt+"명");
    }


}
