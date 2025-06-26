package nested.local;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);

                // Variable 'localVar' is accessed from within inner class, needs to be final or effectively final
                System.out.println("localVar=" + localVar);

                // Variable 'paramVar' is accessed from within inner class, needs to be final or effectively final
                System.out.println("paramVar=" + paramVar);

                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면..? 값을 바꾸면 다시 캡쳐해야되나?
        // localVar = 10;
        // paramVar = 3;

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);

        // printer.print()를 나중에 실행, process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }
}

/*
value=0
localVar=1
paramVar=2
outInstanceVar=3
*/