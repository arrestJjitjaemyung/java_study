package Chapter_7_Methods;

public class Method_1 {
    //method define은 여기에 한다. main method가 아래 있거나 아예 없는 경우도 앞으로 종종 발생함.

    public static void call1() {
        System.out.println("[ X | X ]");
    }

    public static void call2(String strExample) { // define 단계에서 () 내에 있는 것이 parameter
        System.out.println("[ O | X ]"); // input 있음 / output 없음
        System.out.println("오늘의 다짐: " + strExample);
    }

    public static String call3() { // return 자료형이 String이어야 함.
        System.out.println("[ X | O ]"); // input 없음 / output 있음

        String result = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += "*";
            }
            result += "\n";
        } // result (String)에 데이터 저장만 했지 실행하는 코드는 없음.

        return result;
    }

    public static String call4(int year, int month, int date, String day) {
        System.out.println("[ O | O ]"); // input/output 있음

        return year + "년 " + month + "월 " + date + "일 " + day + "요일";
    }

    public static void main(String[] args) {
        /*
        method: 일련의 동작을 묶어 정의한 것. 입/출력값이 존재(optional).

        class 내부에 정의된 함수는 모두 method.
        Java는 모든 함수들이 특정 class에 종속되어서 전부 method에 해당.
        즉 Java 안에서 function = method.

        form:
        className.methodName()
        objectName.methodName() // ex: scanner.nextInt()
        methodName()

        method call: main method나 class method 내에서 className.methodName(), objectName.methodName() 혹은
        methodName()으로 호출 가능. 즉 호출 = 실행.

        method 용어:
        define:  새로운 method 생성
        argument: method에 input 전달
        parameter: argument를 받아 저장하는 변수명
        return: method 출력
        call: method 사용
         */

        call1();
        call2("아무것도 안하기"); // call 단계에서 () 내에 있는 것이 argument

        // call3(); 으로 작성하면 위에서 작성한 for 결과가 나오지 않음.
        System.out.print(call3());
        // 혹은
        String starWritten = call3();
        System.out.println(starWritten);

        System.out.println(call4(2025, 2, 5, "수"));
        // 혹은
        String today = call4(2025, 2, 5, "수");
        System.out.println(today);
    }
}