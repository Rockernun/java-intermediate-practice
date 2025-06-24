package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();  // 중첩 클래스만 따로 만드는 것도 가능
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}

/*
1
3
nestedClass = class nested.nested.NestedOuter$Nested
*/
