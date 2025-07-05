package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {

        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.maxHp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);

        Zealot z1 = new Zealot("질럿1", 100);
        Zealot z2 = new Zealot("질럿2", 150);
        Zealot resultZealout = UnitUtil.maxHp(z1, z1);
        System.out.println("resultZealout = " + resultZealout);
    }
}

/*
resultMarine = BioUnit{name='마린2', hp=50}
resultZealout = BioUnit{name='질럿1', hp=100}
*/
