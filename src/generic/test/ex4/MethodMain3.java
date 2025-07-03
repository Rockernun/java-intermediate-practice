package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {

        Dog dog = new Dog("아르", 200);
        Cat cat = new Cat("에단", 150);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}

/*
animal.className: generic.animal.Dog
t.className: generic.animal.Cat
returnCat = Animal{name='에단', size=150}
*/
