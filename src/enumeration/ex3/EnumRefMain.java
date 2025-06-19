package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}

/*
class BASIC = class enumeration.ex3.Grade
class GOLD = class enumeration.ex3.Grade
class DIAMOND = class enumeration.ex3.Grade
ref BASIC = a09ee92
ref GOLD = 30f39991
ref DIAMOND = 452b3a41
*/
