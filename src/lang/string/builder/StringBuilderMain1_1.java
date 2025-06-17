package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        System.out.println("reverse = " + sb.reverse());

        // StringBuilder -> String
        String str = sb.toString();  // 다시 불변으로 바꿀 수 있음
        System.out.println("str = " + str);
    }
}
