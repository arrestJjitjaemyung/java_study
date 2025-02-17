package Chapter_9_SetterGetter_or_GetterSetter.UnivStudent;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent univStudent1 = new UnivStudent();
        univStudent1.setName("김일");
        univStudent1.setGrade(1);
        univStudent1.setScore(3.3);

        UnivStudent univStudent2 = new UnivStudent("김이");
        univStudent2.setGrade(2);
        univStudent2.setScore(4.0);

        UnivStudent univStudent3 = new UnivStudent(3);
        univStudent3.setName("김삼");
        univStudent3.setScore(2.7);

        UnivStudent univStudent4 = new UnivStudent("김사", 4);
        univStudent4.setScore(3.8);

        UnivStudent univStudent5 = new UnivStudent("김오", 1, 1.0);

        System.out.println(univStudent1.getInfo());
        System.out.println();
        System.out.println(univStudent2.getInfo());
        System.out.println();
        System.out.println(univStudent3.getInfo());
        System.out.println();
        System.out.println(univStudent4.getInfo());
        System.out.println();
        System.out.println(univStudent5.getInfo());
    }
}
