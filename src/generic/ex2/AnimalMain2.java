package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 10);
        Dog dog = new Dog("아르", 100);
        Cat cat = new Cat("에단", 80);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}

// findAnimal = Animal{name='에단', size=80}
