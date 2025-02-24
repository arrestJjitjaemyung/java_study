package Chapter_17_Static.Singleton;
/*
    Singleton Pattern: Software design pattern 의 하나로, 특정 class 가 하나의 instance 만 갖게 하고
    그 instance 에 접근할 수 있는 전역 접근법을 제공하는 패턴.

    instance 는 오직 하나이며 이 instance 는 프로그램 실행 때만 유지.
    Singleton instance 는 static method 를 통해 전역 접근 가능 (className.methodName()).
    class 자체에서 instance 를 관리하므로 타 object 가 직접 instance 생성이나 폐기 불가.

    불필요한 instance 생성을 방지해 메모리 절약.
    전역 접근으로 메모리 절약, 허나 잦은 접근은 단점에 해당.
    one instance 만 사용하기에 일관성 유지.

    전역 접근이 테스트를 어렵게 함.
    남용 시 class 간 의존성을 추적하기 어려움.
 */
public class Factory {
}
