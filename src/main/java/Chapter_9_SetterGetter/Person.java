package Chapter_9_SetterGetter;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Setter: setFieldname 구조
    public void setName(String name) {
        if (name.length() > 4) {
            System.out.println("이름이 너무 길어");
            return; // method 자체 종료
        }
        System.out.println("이름 고치겠음");
        System.out.println("변경 전 이름: " + this.name);
        this.name = name;
        System.out.println("변경 후 이름: " + this.name);
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("어떻게 사람 나이가 마이너스???");
            return;
        }
        else if (age > 200) {
            System.out.println("어떻게 사람 나이가 200 이상???");
            return;
        }
        System.out.println("나이 입력됨");
        this.age = age;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter: getFieldname 구조
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return this.getName() + " " + this.getAge();
    }
}