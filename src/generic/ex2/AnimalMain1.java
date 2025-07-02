package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 10);
        Dog dog = new Dog("아르", 100);
        Cat cat = new Cat("에단", 80);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}

/*
findDog = Animal{name='아르', size=100}
findCat = Animal{name='에단', size=80}
findAnimal = Animal{name='동물', size=10}
*/
