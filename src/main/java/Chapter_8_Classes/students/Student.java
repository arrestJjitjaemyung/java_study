package Chapter_8_Classes.students;
/*
    Student class 필드 정의
    1. int studentCode
    2. String name
    3. double score

    기본 생성자 작성, object 생성 시 "기본 생성자로 object 생성됨" 출력

    int studentCode parameter 삼는 parameter constructor 생성,
    "int 생성자로 object 생성됨" 출력

    String name parameter 삼는 parameter constructor 생성,
    "String 생성자로 object 생성됨" 출력

    int studentCode, String name parameter 삼는 parameter constructor 생성,
    "int, String 생성자로 object 생성됨" 출력

    StudentMain에서 해당 object와 속성 삽입
    stu1 20250001 김일 4.5 기본생성자
    stu2 20250001 김이 100 int 생성자
    ... ... ... 95.8 String 생성자
    ... ... ... 4.0 int, String 생성자

    showInfo() method call1 타입으로 작성
    학번 : 20250001
    이름 : 김일
    점수 : 4.5
 */

import java.lang.reflect.Constructor;

public class Student {

    int studentCode;
    String name;
    double score;

    Student() {
        System.out.println("기본 생성자로 object 생성됨");
    }

    Student(int studentCode) {
        System.out.println("int 생성자로 object 생성됨");
        this.studentCode = studentCode;
    }

    Student(String name) {
        System.out.println("String 생성자로 object 생성됨");
        this.name = name;
    }

    Student(int studentCode, String name) {
        System.out.println("int, String 생성자로 object 생성됨");
        this.studentCode = studentCode;
        this.name = name; // this의 의미는 object명, 속성명에서 object명 의미. 아직 object명이 없어 임시로 사용됨.
    }

    void showInfo() {
        System.out.println("학번: " + this.studentCode);
        System.out.println("이름: " + this.name);
        System.out.println("점수: " + this.score); // this 적는 게 매너.
        System.out.println();
    }
}
