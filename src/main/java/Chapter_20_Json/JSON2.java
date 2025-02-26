package Chapter_20_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.internal.bind.util.ISO8601Utils;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User {
    private String id;
    private String pw;
    private String em;
    private String name;
    private int age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

        User user1 = new User("Kim1", "9876", "a@test.com", "김일", 20);
        System.out.println(gson.toJson(user1));
        System.out.println(gsonBuilder.toJson(user1));
        userJson = gsonBuilder.toJson(user1); // 정상 실행 시 gsonBuilder.toJson(user1) 결과가 String 의미

        boolean result1 = gsonBuilder.toJson(user1) instanceof String;
        boolean result2 = userJson instanceof String;
        System.out.println(result1); // true
        System.out.println(result2); // "

        JsonObject jsonObject1 = new JsonObject(); // 임시 class 역할
        jsonObject1.addProperty("학번", 20250001);
        jsonObject1.addProperty("학과", "영어교육과");
        jsonObject1.addProperty("성적", "A"); // Ctrl + D 하면 즉시 복붙 ㄱㄴ!!!

        System.out.println(jsonObject1);
        System.out.println(gson.toJson(jsonObject1));
        System.out.println(gsonBuilder.toJson(jsonObject1));
    }
}
