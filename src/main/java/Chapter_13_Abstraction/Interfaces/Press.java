package Chapter_13_Abstraction.Interfaces;

public interface Press {
    String NAME = "Button"; // 자동으로 const (public final) 정의, 그래서 대문자로 표기하고 Initialize 도 함.
    // private String name; (Access modifier 지정 불가), String name; (선언만 하는것도 불가)
    // public Press(); (Constructor 선언도 불가), void pop() {...}; (구현부 있는 일반 method 가지기 불가)

    void onPressed();
}
