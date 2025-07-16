package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);  // 정수형으로 캐스팅
        System.out.println(charB + " = " + (int)charB);  // 정수형으로 캐스팅

        // 해시 코드
        System.out.println("=== 해시 코드 ===");
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));

        // 해시 인덱스
        System.out.println("=== 해시 인덱스 ===");
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (char c : charArr) {
            sum += c;
        }

        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

/*
A = 65
B = 66

=== 해시 코드 ===
hashCode(A) = 65
hashCode(B) = 66
hashCode(AB) = 131

=== 해시 인덱스 ===
hashIndex(A) = 5
hashIndex(B) = 6
hashIndex(AB) = 1
*/
