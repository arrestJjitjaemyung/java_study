package Chapter_12_Inheritance.Products;

public class Item {
    private String name;
    private String category; // 하나만 갖는 Constructor 2개 만들기는 ㅂㄱㄴ.

    public Item() {
    }

    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
