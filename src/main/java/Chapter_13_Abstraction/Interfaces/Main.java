package Chapter_13_Abstraction.Interfaces;
/*
    Interface: Java 에서 class 가 구현해야 하는 methods 집합을 정의하는 일종의 protocol.
    Method name, return type, parameter 만 포함. Abstract class 랑 비슷함.

    Multiple inheritance 지원. 이를 통해 여러 interfaces 구현 가능. Abstract class 는 단일이라 Inheritance 과정을 알기 힘듬.
    Interface 내 선언된 변수는 Constant (public static final)로 취급됨.

    Abstract class 포함이 가능하고, 이를 Children class 에서 구현해야 함.

    Abstract class 는 일반 method 도 포함하지만 interface 는 abstract method 만 포함 가능
    (default, static 도 가능하긴 함).
    Instance variable 가질 수 있지만  Const 만 가질 수 있음.
    단일 Inheritance 만 가능하지만  Multi inheritance "구현"도 가능.
    다양한 access modifier (public, protected, private, etc.)를 가질 수 있지만  access modifier 를 가질 수 없음
    (자동으로 public 선언됨).
 */

public class Main {
    public static void main(String[] args) {
        Remote_controller rc = new Remote_controller(new Power_button(),
                                                     new Volume_down_button(),
                                                     new Volume_up_button());

        rc.onPressedPowerButton();
        rc.onPressedPowerButton();

        rc.onPressedVDButton();
        rc.onDownedVDButton();
    }
}
