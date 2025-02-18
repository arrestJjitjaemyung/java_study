package Chapter_13_Abstraction.Abstract_class;

public class Tablet_factory extends Factory{
    public Tablet_factory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[" + model + "]을(를) 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공정 관리");
    }
}
