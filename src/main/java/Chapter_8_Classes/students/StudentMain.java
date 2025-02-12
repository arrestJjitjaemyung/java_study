package Chapter_8_Classes.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentCode = 20250001;
        student1.name = "김일";
        student1.score = 4.5;

        Student student2 = new Student(20250002);
        student2.name = "김일";
        student2.score = 100;

        Student student3 = new Student("김삼");
        student3.studentCode = 20250001;
        student3.score = 95.8;

        Student student4 = new Student(20250004, "김사");
        student4.score = 4.0;

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
    }
}
