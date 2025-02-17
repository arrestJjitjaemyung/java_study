package Chapter_12_Inheritance;

public class Tiger extends Animal { // [Children class] extends [Parents class]

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName); //
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override // 상속받은 method
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
        super.move(); // super()는 Constructor, super.methodName 은 Parents class method 호출.
        System.out.println("네 발 터벅터벅"); // 재정의 영역.
    }

    public void hunt() {
        System.out.println("와그작");
    }
}
