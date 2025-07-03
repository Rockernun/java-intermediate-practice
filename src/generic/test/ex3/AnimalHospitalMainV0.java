package generic.test.ex3;

import generic.animal.Dog;
import generic.animal.Cat;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("아르", 300);
        Cat cat = new Cat("에단", 200);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이를 전달한다면?
        // dogHospital.set(cat);  // 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("이브", 350));
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