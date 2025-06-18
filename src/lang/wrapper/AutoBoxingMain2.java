package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {

        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;  // Auto-Boxing

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;  // Auto-Unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

/*
boxedValue = 7
unboxedValue = 7
*/