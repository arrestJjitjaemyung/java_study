package Chapter_9_SetterGetter;
/*
    1. Setter-getter 필요성
    Person class 생성(예:

    public class Person {
        String name;
        int age;
    })
    , 그리고 PersonMain에서 object 생성 시 외부에서 비정상 값(예:
     person.age = -10;) <- 나이가 -10살이 될 수 없음.
     대입 가능성을 대비.

     2. Setter-getter란?
     Setter: 데이터 설정 method. class 외부에서 필드 수정을 막고 특정 method 통해 값 전달받아 초기화 및 수정.
     Getter: 데이터 조회 method. class 외부에서 필드 조회를 막고 특정 method 통해 안전하게 값 반환.

     3. Setter-getter 장점
     데이터 보호: private variable 사용으로 외부 접근을 차단함
     데이터 유효성 검증
     Capsulize: 숨겨진 데이터에 제한적으로 접근하여 class 내부 구성을 노출시키지 않음.
     유연성 증가: 추후 추가사항이 생겨도 class method 수정만을 요구하므로 유지보수성 증가.

     4. Setter-getter, 언제 필요한가
     일정 사이즈 이상의 다수 데이터를 받는 경우
     유효성 검증 필요 시

     Alt + Insert   or   Menu > Code > Generate > Constructor 가능
 */
public class SetterGetter {
    public static void main(String[] args) {

    }
}