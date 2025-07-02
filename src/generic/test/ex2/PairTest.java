package generic.test.ex2;

public class PairTest {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setFirst(1);
        pair1.setSecond("Java");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println("pair1 = " + pair1);

        Pair<Integer, String> pair2 = new Pair<>();
        pair2.setFirst(2);
        pair2.setSecond("Spring");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println("pair2 = " + pair2);
    }
}

/*
1
Java
pair1 = Pair{firstValue=1, secondValue=Java}
2
Spring
pair2 = Pair{firstValue=2, secondValue=Spring}
*/