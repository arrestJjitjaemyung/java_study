package Chapter_17_Static;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();

        System.out.println(product1.getInstanceCount());
        System.out.println(Product.getCount());
    }
}
