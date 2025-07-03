package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog("아르", 200);
        Cat cat = new Cat("에단", 150);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog biggerDog = new Dog("이브", 300);
        Dog bigger = AnimalMethod.bigger(dog, biggerDog);
        System.out.println("bigger = " + bigger);
    }
}

/*
동물 이름: 아르
동물 크키: 200
멍멍
동물 이름: 에단
동물 크키: 150
야옹
bigger = Animal{name='이브', size=300}
*/
