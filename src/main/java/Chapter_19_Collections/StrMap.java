package Chapter_19_Collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>(); // Map<key, value>

        strMap.put("Kor20250001", "111");
        strMap.put("Kor20250002", "222");
        strMap.put("Kor20250003", "333");
        strMap.put("Kor20250004", "444");

        System.out.println(strMap);
        System.out.println(strMap.get("Kor20250003")); /// 333
        // strMap.put("", "") or strMap.replace("", "") 으로 index 수정 ㄱㄴ
        boolean searchKeyFlag1 = strMap.containsKey("Kor20250001");
        boolean searchKeyFlag2 = strMap.containsKey("Kor20250010");
        System.out.println(searchKeyFlag1); // true
        System.out.println(searchKeyFlag2); // false

        boolean searchValueFlag1 = strMap.containsValue("111");
        boolean searchValueFlag2 = strMap.containsValue("555");
        System.out.println(searchValueFlag1); // true
        System.out.println(searchValueFlag2); // false

        Set<Map.Entry<String, String>> entrySet = strMap.entrySet();
        System.out.println(entrySet);
        List<Map.Entry<String, String>> entryList = new ArrayList<>();
        entryList.addAll(entrySet);
        System.out.println(entryList);

        for (int i = 0; i < entryList.size(); i++) {
            System.out.println(entryList.get(i));
        }
        for (Map.Entry<String, String> stringStringEntry : entryList) {
            System.out.println(stringStringEntry);
        }

        Set<String> keySet = strMap.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = strMap.values();
        System.out.println(valueSet);
    }
}
