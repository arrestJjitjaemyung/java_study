package Chapter_13_Abstraction.Abstract_class;

public abstract class Factory { // Abstract class 가 하나 생겨서 자동으로 변함
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model); // {}, 구현부, method body 없음
    public abstract void manage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("공장 정보: ");
    }
}