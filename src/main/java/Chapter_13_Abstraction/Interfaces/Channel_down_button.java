package Chapter_13_Abstraction.Interfaces;

public class Channel_down_button extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 1 내립니다");
    }

    @Override
    public void onDown() {
        super.onDown();
        System.out.println("채널을 계속 내립니다");
    }
}
