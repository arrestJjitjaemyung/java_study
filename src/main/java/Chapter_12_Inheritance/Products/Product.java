package Chapter_12_Inheritance.Products;

public class Product extends Item{
    private int price, stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category); // Parents 키워드 가지고 오는 super()
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(String name, String category) {
        super(name, category);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    public void displayInfo() {
        System.out.println("제품명: " + this.getName());
        System.out.println("제품명: " + this.getCategory());
        System.out.println("제품명: " + this.getPrice());
        System.out.println("제품명: " + this.getStock());
    }
}
