package Chapter_13_Abstraction.Interfaces;

public class Remote_controller {
    private Power_button pb; // Field 선언, 직접 정의한 class 가 자료형이 될 수 있다!
    private Volume_down_button vdb;
    private Volume_up_button vub;

    public Remote_controller(Power_button pb,
                             Volume_down_button vdb,
                             Volume_up_button vub) { // 너무 길면 이렇게 정리하자
        // Field 선언, 직접 정의한 class 가 자료형이 될 수 있다22!
        this.pb = pb;
        this.vdb = vdb;
        this.vub = vub;
    }

    public void onPressedPowerButton() {
        pb.onPressed();
    }

    public void onPressedVDButton() {
        vdb.onPressed();
    }

    public void onDownedVDButton() {
        vdb.onDown();
    }
}
