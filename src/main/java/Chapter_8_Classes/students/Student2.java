package Chapter_8_Classes.students;
/*
    Constructor 자동생성

    Hamburger - Code - Generate - Constructor
    Alt + Insert
 */
public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
    } // Select None

    public Student2(int studentCode) {
        this.studentCode = studentCode;
    } // studentCode:int

    public Student2(String name) {
        this.name = name;
    } // name:String

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    } // studentCode:int, name:String
}
