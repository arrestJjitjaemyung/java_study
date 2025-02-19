package Chapter_14_Casting.Animals;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("개짖는 소리좀 안나게해라");
    }

    public void fetch() {
        System.out.println("공 물어오는 소리좀 안나게해라");
    }
}
