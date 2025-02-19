package Chapter_14_Casting.Animals;
/*
    Reference Type Casting: OOP 중요 요소

    Java 에서는 자료형이 크게
    Primitive type (int, double, char, etc.), Reference type (Object 참조 변수, class or interface 로 생성된 object,
    ex) ACController acc = new ACController(new Temp_down_button(), ...);, Ch13 > Interfaces 참조)
    로 구분되는데, Casting 이란
    Upcasting, Downcasting 으로 구분된다.

    instanceof: Operator 의 한 종류, 어떤 class object 인지 확인하는 용도,
    ex) [Object, 검사하려는] instanceof [ClassName / InterfaceName, Object 가 검사될]
    return 값은 Object 가 Class / Interface name 의 Instance 이거나 하위 class instance 인 경우 true,
    아니면 false 이다.

    Casting 은 주로 Polymorphism 구현을 위해 사용, 상위 Object 타입으로 처리하면서도 특정 상황에선 하위 class 기능 수행.

    이로써 코드 유연성과 Polymorphism 구현이 가능하지만
    Downcasting 실수, 복잡성 증가(특히 Upcasting 은 Implicit 하기에 오류를 알기 어려움) 문제점이 있음.


 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1; // 상위 class 로 declared, Upcasting 1
        animal1.makeSound();
//      animal1.fetch(); // 하위 class 라 이런 기능은 Animal.java 에 없다

        Animal animal2 = new Dog(); // Upcasting 2, 빈출
        animal2.makeSound();

        Animal animal3 = new Animal();
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1); // true

        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2); // true, 하위 class instance 라서.

        boolean result3 = animal2 instanceof Animal;
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result3); // true
        System.out.println(result4); // true

        boolean result5 = animal3 instanceof Animal;
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result5); // true
        System.out.println(result6); // false, 아예 Upcasting 이 이루어지지 않음.

        Dog dog2 = (Dog) animal2; // Explicit 한 방식, Reference type operator 가 쓰임!

        dog2.makeSound();
        dog2.fetch();

        System.out.println("-------------------------------");
//      dog3.makeSound(); // animal3 는 애초에 Animal class 로 만들어짐. 이걸 강제로 Downcast 하니 이러지.
        // 이걸 막으려면 Animal animal3 = new Dog(); 로 에초에 Dog class 로 선언하든지,
        Animal animal4 = new Dog();
        if (animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4; // 조건이 true 이면 Downcasting 시도

            dog4.makeSound();
            dog4.fetch();
        }
    }
}
