package Chapter_17_Static.Builders;

public class Person {
    private String name;
    private int age;
    private String address;

//    public Person() {
//    }
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(int age, String address) {
//        this.age = age;
//        this.address = address;
//    }
//
//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    } 이거 ㅈㄴ 길어서 Builder 라는 걸 배울거임.

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder { // object 생성하는 Main 단계에서 Builder 생성 위해 public 선언
        private String name;
        private int age;
        private String address;

        public Person name(String ddd) {
            return null;
        }
    }

    // builder class method 정의
    // 원래 method name 은 동사로 정의하지만 여기서는 Person field name 과 동일하게 작성.
    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person address(String address) {
        this.address = address;
        return this;
    }
}
