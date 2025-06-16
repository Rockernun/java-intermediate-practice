package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    // toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "강아지 이름: " + dogName + ", 나이: " + age + "세";
    }
}