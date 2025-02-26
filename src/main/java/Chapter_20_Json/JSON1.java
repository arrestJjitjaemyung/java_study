package Chapter_20_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
    JSON(JavaScript Object Notation) : 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만, 언어 독립형 데이터 포멧
    프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 JSON 데이터 생성을 위한 코드는 자바, 파이썬 등 다양한 언어에서 쉽게 이용 가능


    {
            "이름공간(key)": "값(value)",
            "값 구분자": "각각의 값들은 ','(콤마)로 구분되어야 합니다.",
            "이스케이프": "키가 값에서 큰따옴표를 쓰고 싶으면-특정 문자를 이스케이프 하려면- \" 처럼 문자 앞에 역슬래시를 붙입니다.",
            "자료형": "표현 가능한 자료형은 String, int, double, boolean, null, object, array 6개 입니다.",
            "문자열 값": "큰따옴표로 감싸서 표현됨 - 자바와 같음.",
            "숫자": 123456, // 큰따옴표 없이 표현됨
            "boolean 값": true,
            "null 값": null,
            "object 값": {
                "값1": 123456789,
                "값2": false,
                "값3": {
                    "객체 내부": "객체 위치 가능",
                    "구분자": "key-value 구분은 ':'(콜론)으로 이루어집니다."
                }
            },
            "Array 값": [
                "여기에 String을 넣고 싶다면 다시 ""를 써야합니다.",
                {
                    "현재 값의 인덱스": 1,
                    "해당 방식처럼": "배열 안에 여러 값을 넣는 것도 가능"
                },
                [ "배열", "내부에", "배열을", "삽입하는 것도", "가능합니다."]
            ],
            "JSON 예시": "마무리"
    }

        GSON : Google JSON의 약칭 -> 자바에서 생성한 객체를 매개변수로 넣으면 GSON 객체를 생성해 tojson() 메서드를 사용,
        Map으로 매칭시킨 데이터들을 JSON String으로 반환해줍니다. 즉, json 포맷으로 일일이 작성해야하는 번거로움을 줄여줍니다.
 */
public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();

        jsonObject1.addProperty("id", "ddd");
        jsonObject1.addProperty("pw", 1234); // int 형도 아무 문제 ㄴㄴ
        jsonObject1.addProperty("em", "maybeags@gmail.com");
        jsonObject1.addProperty("name", "디디디");
        System.out.println(jsonObject1);

        jsonObject1.addProperty("age", 38);
        jsonObject1.addProperty("job", "Java instructor");
        System.out.println(jsonObject1);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject1);
        System.out.println(json);

        /*
            Gson Library:
                목적: Gson library 는 Java object 를 json 변환, 그 반대 경우에 사용
                주요 class:
                    Gson: 변환에 사용
                    GsonBuilder: Gson instance 에 대한 사용자 정의 구성을 허용(prettyPrinting 등)
         */
    }
}
