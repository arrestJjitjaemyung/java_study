package Chapter_9_SetterGetter.UnivStudent;

public class UnivStudent {
    private String name;
    private int grade;
    private double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 4) {
            System.out.println("유효한 학년 입력");
        }
        this.grade = grade;
    }

    public void setScore(double score) {
        if (score < 0.0 || score > 4.5) {
            System.out.println("유효한 점수 입력");
        }
        this.score = score;
    }

    public void setInfo(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    public String getInfo() {
        return "이름: " + this.name + "\n학년: " + this.grade + "\n점수: " + this.score;
    }
}
