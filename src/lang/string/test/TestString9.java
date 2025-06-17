package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        String[] part = fruits.split(",");
        for (String s : part) {
            System.out.println(s);
        }

        System.out.println("joinedString = " + String.join("->", part));
    }
}

/*
apple
banana
mango
joinedString = apple->banana->mango
*/
