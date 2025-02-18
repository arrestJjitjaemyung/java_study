package Chapter_13_Abstraction.Interfaces;

public class Volume_up_button extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 1 올립니다");
    }

    @Override
    public void onUp() {
        super.onUp();
        System.out.println("음량을 계속 올립니다");
    }
}
