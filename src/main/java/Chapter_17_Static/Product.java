package Chapter_17_Static;
/*
    Static: class 에서 변수 정의나 method 선언 시 사용.
    static 변수나 method 는 class instance 에 속하지 않고 class 자체에 속하게 됨.
    즉 instance 생성이 필요 없음. (일반 변수나 method 는 생성해야)

    모든 instance 가 동일한 static field 에 접근, 따라서 데이터 공유나 상태 저장에 유리.
    static 변수는 프로그램 종료 전까지 메모리에 한번만 할당함.
 */
public class Product {
    private static int count = 0; // 모든 class 가 공유하는 field
    private int instanceCount = 0; // instance field, object 마다 서로 다른 값 가짐

    public Product() {
        System.out.println("Product class instance generated");
        count++;
        instanceCount++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }
}
