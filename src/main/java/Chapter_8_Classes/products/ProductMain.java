package Chapter_8_Classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG 엘패드";

        Product product2 = new Product(987654);
        product2.productName = "다이소 충전기";

        Product product3 = new Product("USB-C Cable");
        product3.productNum = 159357;

        Product product4 = new Product(951753, "Z Flip6");

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}
