package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();  // 내부 클래스 생성
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}

/*
1
2
3
innerClass = class nested.inner.InnerOuter$Inner
*/