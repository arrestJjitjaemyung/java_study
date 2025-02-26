package Chapter_19_Collections;

import java.util.*;

/*
    List 로 전체 설문을 받고 Set 을 통해 중복 제거 후 후보군을 남겨야.
    그리고 .get(indexNo)로 조회하는 방법도 사용 ㄱㄴ
 */
public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        List<String> strList = new ArrayList<>();

        strSet.add("Java");
        strSet.add("C++");
        strSet.add("Python");
        strSet.add("Ruby");
        strSet.add("JS");

        System.out.println(strSet); // 순서 없음

        strList.addAll(strSet);
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList); // Unicode 기준
        strSet.addAll(strList);
        System.out.println(strSet); // 순서 안바뀜


    }
}
