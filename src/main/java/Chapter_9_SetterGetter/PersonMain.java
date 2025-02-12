package Chapter_9_SetterGetter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "안근수";
//        person1.age = 1000; // private 적용 후에는 오류 발생
//
//        System.out.println(person1.age);

        person1.setName("안근수");
        person1.setName("손고장난벽시"); // Invalid 데이터라 값이 변경되지 않음.
        person1.setName("김칠");
        person1.setAge(21);

        System.out.println("제 이름은 " + person1.getName());
        System.out.println("제 나이는 " + person1.getAge());
        System.out.println("내년에는 " + (person1.getAge() + 1));

        System.out.println(person1.getInfo());
    }
}