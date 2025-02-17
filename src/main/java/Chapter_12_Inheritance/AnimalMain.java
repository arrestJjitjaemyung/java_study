package Chapter_12_Inheritance;

/*
    Inheritance: OOP 핵심 개념, Parents class 속성과 method 를 재사용하여 Children class 제작을 의미.
    이를 통해 공통 기능을 Parents class 에 정의하고 여러 Children class 가 재사용 ㄱㄴ.

    ex)
    동물 class 공통 기능(이름, 나이 등)을 Parents 에 정의하고 이를 개, 고양이 등 Children 이 상속받음.
    개, 고양이 class 에 각각 고유 특성 추가도 ㄱㄴ.

    단일 상속: Java 는 단일만 지원, 그만큼 구조가 간단명확.
    super: this 와 비슷한 개념, Parents class field 접근이나 Constructor call 에 사용.
    Method override: Children class 에서 Parents class 기능을 재정의.
    final: class 나 method 에 사용 시 상속 불가.
     final [class]: 상속 불가
     final [method]: method override 불가.


 */

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("바둑이");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal("나비" ,2);

        Tiger tiger1 = new Tiger("티거", 4);
        tiger1.move();
        tiger1.hunt();

        Human human1 = new Human();
        human1.move();
        human1.read("멘토 Java");
        human1.setAnimalName("김일");
        human1.setAnimalAge(20);
        System.out.println("제 이름은 " + human1.getAnimalName() + " 입니다. 나이는 " + human1.getAnimalAge() + "살 입니다.");
    }
}
