package generic.test.ex4;

public class GenericMethod {

    public static Object objectMethod(Object object) {
        System.out.println("Object print: " + object);
        return object;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("Generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Bound print: " + t);
        return t;
    }
}
