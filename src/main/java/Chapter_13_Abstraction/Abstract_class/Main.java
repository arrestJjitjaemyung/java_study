package Chapter_13_Abstraction.Abstract_class;
/*
    Abstract class: Abstract method 가 하나 이상 포함된 class 는 abstract class 로 정의됨.
    Object 생성 불가. 나머지는 일반 class 와 똑같다.
    Inheritance 를 전제로 하는 class.

    Abstract method: 선언만 있고 구현은 없는 method.

    코드 재사용성 높임. Parents-Children class 와 똑같다.
    여러 class 에서 공통적으로 사용하는 기능을 abstract class 에서 정의 ㄱㄴ.
    이를 통해 Children class 의 특정 method 구현을 강제할 수 있다.

    super: Parents class field or method access 에 사용
        super(parameter): Children class 에서 Parents class constructor calling 에 사용.
        super.methodName: " method calling 에 사용
 */

public class Main {
    public static void main(String[] args) {
//        Factory factory1 = new Factory("임시공장") { // Anonymous class
//            @Override
//            public void produce(String model) {
//                System.out.println(this.getName() + "에서 [" + model + "]을(를) 생산합니다.");
//            }
//
//            @Override
//            public void manage() {
//                System.out.println(this.getName() + "에서 야근 중");
//            }
//        };
//
//        factory1.produce("백색가전 냉장고");
//        factory1.manage();
//        이 코드는 일회용으로 쓸 경우에나 유용함.

        Phone_factory phone_factory1 = new Phone_factory("iPhone 공장");
        Tablet_factory tablet_factory1 = new Tablet_factory("iPad 공장");

        // Super class 의 abstract method 를 각 서브 class 들이 구현부를 작성 호출한 예시
        phone_factory1.produce("iPhone 17");
        tablet_factory1.produce("iPad Pro 13\" 8th Gen");

        // Super class 의 일반 method 를 각 서브 class 들이 구현부를 작성 호출한 예시
        // @Override 미사용인데도 사용이 가능함. Parents class method 를 그대로 사용한다면 Override 불필요.
        phone_factory1.manage();
    }
}
