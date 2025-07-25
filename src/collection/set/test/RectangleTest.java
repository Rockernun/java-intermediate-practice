package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {

        Set<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20));  // 중복

        for (Rectangle rectangle : rectangleSet) {
            System.out.println(rectangle);
        }
    }
}

/*
Rectangle{width=10, height=10}
Rectangle{width=20, height=20}
*/