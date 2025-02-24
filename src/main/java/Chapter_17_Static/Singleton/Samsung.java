package Chapter_17_Static.Singleton;

public class Samsung {
    private String company;
    private int serialNo;

    public String getCompany() {
        return company;
    }

    // 여기서부터 Singleton pattern
    private static Samsung instance = null;
    private Samsung() {
        company = getClass().getSimpleName(); // package 떼고 class 명만 갖고 옴.
        serialNo = 20250000;
    }

    public static Samsung getInstance() { // Singleton 의 꽃.
        if (instance == null) { // 현재 instance 없다면 실행
            instance = new Samsung(); // Samsung class object 생성
        } // static = instance
        return instance; // instance 가 이미 있으면 이것만 실행
    }

    public String createSerialNo(String model) {
        return model + "_" + ++serialNo;
    }
}
