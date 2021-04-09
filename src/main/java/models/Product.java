package models;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:40 <br>
 * Project: webshop-back-end <br>
 */
public class Product {

    private int id;
    private String title;
    private String description;
    private double price;
    private double measurement;
    public enum UNIT{
        ml,
        cl,
        dl,
        l,
        g,
        kg
    }
    private UNIT unit;
    private String supplier;
    private String image;
    private int inStock;
    private boolean isFeatured;

    public Product(){}

    public Product(int id, String title, String description,
                   double price, double measurement, UNIT unit, String supplier,
                   String image, int inStock, boolean isFeatured) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.measurement = measurement;
        this.unit = unit;
        this.supplier = supplier;
        this.image = image;
        this.inStock = inStock;
        this.isFeatured = isFeatured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMeasurement() {
        return measurement;
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }
}
