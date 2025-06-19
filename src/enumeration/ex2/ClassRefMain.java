package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}

/*
class BASIC = class enumeration.ex02.ClassGrade
class GOLD = class enumeration.ex02.ClassGrade
class DIAMOND = class enumeration.ex02.ClassGrade
ref BASIC = enumeration.ex02.ClassGrade@a09ee92
ref GOLD = enumeration.ex02.ClassGrade@30f39991
ref DIAMOND = enumeration.ex02.ClassGrade@452b3a41
*/