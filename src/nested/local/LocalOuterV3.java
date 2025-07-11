package nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거됨.
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);

                // 인스턴스는 지역 변수보다 오래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        // printer.print();  // printer.print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
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