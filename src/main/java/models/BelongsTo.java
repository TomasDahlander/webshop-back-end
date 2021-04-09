package models;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:43 <br>
 * Project: webshop-back-end <br>
 */
public class BelongsTo {

    private int id;
    private Product productId;
    private Category categoryId;

    public BelongsTo(){}

    public BelongsTo(int id, Product productId, Category categoryId) {
        this.id = id;
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }
}
