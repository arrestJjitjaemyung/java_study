package Chapter_19_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        userMap.put("id", "ddd");
        userMap.put("pw", "1234");
        userMap.put("em", "maybeags@gmail.com");
        userMap.put("name", "디디디");

        System.out.println(userMap);

        Set<String> keySet = userMap.keySet();
        System.out.println(keySet);


    }
}
