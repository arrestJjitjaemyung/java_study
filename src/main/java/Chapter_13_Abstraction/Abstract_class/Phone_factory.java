package Chapter_13_Abstraction.Abstract_class;

public class Phone_factory extends Factory{
    public Phone_factory(String name) {
        super(name);
    }

    // Children class 에서는 parents class 의 abstract method 가 구현부 있는 method 로 재정의 된다.
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "]을(를) 생산합니다.");
    }

    @Override
    public void manage() {
        // Parents class 에서 새 method 가 생성되면 무조건 Inheritance 가 필요하다.
        System.out.println("스마트폰 공정 관리");
    }
}
