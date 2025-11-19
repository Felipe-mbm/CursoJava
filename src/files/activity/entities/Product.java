package files.activity.entities;

public class Product {
    private String name;
    private Double price;
    private Integer stock;

    public Product() {}

    public Product(String name, Double price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setValue(Integer stock) {
        this.stock = stock;
    }

    public Double stockPrice() {
        return price * stock;
    }

}
