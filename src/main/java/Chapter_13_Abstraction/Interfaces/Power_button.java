package Chapter_13_Abstraction.Interfaces;

public class Power_button extends Button{
    private boolean status;
    private String name;

    @Override
    public void onPressed() {
        if (status) { // status 가 true 이면 실행
            status = false;
            System.out.println("전원이 꺼집니다");
        }
        else {
            status = true;
            System.out.println("전원이 켜집니다");
        }
    }
}
