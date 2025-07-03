package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("아르", 300);
        Cat cat = new Cat("에단", 200);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이를 전달한다면?
        dogHospital.set(cat);  // 매개 변수 체크 실패: 컴파일 오류가 발생하지 않는다.

        // 문제2: 개 타입 반환, 캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("이브", 350));
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