package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {

        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox);
//        writeBox(catBox);

    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("이브", 300));
    }
}
