package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {

        String str1 = "hello";
        str1.concat(" java");

        System.out.println(str1);  // 결과는 hello 출력된다. 왜 합쳐지지 않는거지?
    }
}
