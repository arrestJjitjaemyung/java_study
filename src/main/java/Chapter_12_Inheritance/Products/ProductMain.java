package Chapter_12_Inheritance.Products;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반", "일반");
        // Parent 는 Children field, method 사용 ㅂㄱㄴ.

        System.out.println("이 상품은 " + item1.getName() + "제품 입니다.");
        System.out.println("이 상품은 " + item1.getCategory() + " 카테고리 입니다.");

        Product product1 = new Product("전자", "가전", 100000, 10);

        product1.setCategory("백색가전");
        product1.getCategory();

        System.out.println("이 상품은 " + product1.getName() + "제품 입니다.");
        System.out.println("이 상품은 " + product1.getCategory() + " 카테고리 입니다.");

        product1.displayInfo();
    }
}
