package Chapter_8_Classes.constructor;

public class Constructor {
    /*
    생성자(Constructor): object 생성 시 호출되는 특별 method

    특징
    1. class 이름과 constructor 이름은 동일, 대문자로 시작.
    2. return 값이 없다.
    3. object 초기화: constructor는 object 필드 초기화 담당.
     */
    int num;
    String name;

    Constructor() {
        System.out.println("NoArgsConstructor(기본 생성자)");
    }

    Constructor(int num) {
        System.out.println("RequiredArgsConstructor(int 필수 생성자)");
        this.num = num;
    }

    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 필수 생성자)");
        this.name = title;
    }
    //parameter와 속성명은 달라도 된다.

    Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(int, String 필수 생성자)");
        this.num = num;
        this.name = name;
    }

    Constructor(String name, int num) { // parameter 순서가 다르면 다른 constructor 간주
        System.out.println("AllArgsConstructor(String, int 필수 생성자)");
        this.num = num;
        this.name = name;
    }
    // 속성 갯수가 매우 많을 때를 대비하여 속성 전체 method 정의.

    void showInfo() {
        System.out.println("해당 object num 값: " + num);
        System.out.println("해당 object name 값: " + name);
    }

    String showInfo2() {
        return "해당 object num 값: " + num + "\n해당 object name 값: " + name;
    }
}
