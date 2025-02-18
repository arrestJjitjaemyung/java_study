package Chapter_13_Abstraction.Interfaces;
/*
    Power_button.java 에서 확인할 수 있듯이 이 class 는 전원만 조종할 수 있기에
    onUp, onDown method override 필요 없음.

    하지만 abstract method 는 반드시 children class 에서 구현되어야 하므로
    onUp, onDown class 를 abstract method 로 선언하면 Power_button 에서 다 구현해야 하기에
    onPressed 만 abstract method 로 선언함.
 */

public abstract class Button implements Press, Up, Down { // Multiple inheritance 는 extends 대신 implements 사용
    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {

    }
}
