package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember member1 = new FamilyMember("아빠");
        FamilyMember member2 = new FamilyMember("엄마");
        FamilyMember member3 = new FamilyMember("나");
        FamilyMember member4 = new FamilyMember("남동생");

        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(member1,10000);
        PiggyBank.putMoney(member2,5000);
        PiggyBank.putMoney(member3,2000);
        PiggyBank.putMoney(member4,1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(member3,1000);
        PiggyBank.printBalance();


    }
}
