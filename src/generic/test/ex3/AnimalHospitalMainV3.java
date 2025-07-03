package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

        Dog dog = new Dog("아르", 300);
        Cat cat = new Cat("에단", 200);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("이브", 350));  // 다운 캐스팅 필요 없음
        System.out.println("biggerDog = " + biggerDog);
    }
}

/*
동물 이름: 아르
동물 크키: 300
멍멍
동물 이름: 에단
동물 크키: 200
야옹
biggerDog = Animal{name='이브', size=350}
*/