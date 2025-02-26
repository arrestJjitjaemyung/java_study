package Chapter_19_Collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StrList {
    public static void main(String[] args) {
        //Collection: 여러 object 모음
    /*
    List: 순서 데이터 집합, 중복 요소 허용
        ArrayList: 배열 기반, 액세스 속도 빠름
        LinkedList: 연결 기반, 삭제 속도 빠름

    Set: 중복 비허용
        HashSet: 해시테이블 기반, 순서 없음
        TreeSet: Binary 검색트리 기반, 정렬된 상태

    Map: Key and Value 쌍으로 이루어진 데이터 집합
        HashMap: 해시테이블 기반, 키 순서 없음
        TreeMap: Binary 검색트리 기반, 키 정렬된 상태
     */

        List<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("C++");
        strList.add("Python");

        System.out.println(strList);

        String removeElem = "C#";
        boolean removed = strList.remove(removeElem);
        System.out.println(removeElem + " 삭제 여부 : " + removed);
        System.out.println(strList);    // [java, python, JavaScript, Kotlin]
    }
}
