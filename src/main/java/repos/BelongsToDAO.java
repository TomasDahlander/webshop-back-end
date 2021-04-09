package repos;

import models.BelongsTo;
import models.Category;
import models.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 17:10 <br>
 * Project: webshop-back-end <br>
 */
public class BelongsToDAO {

    List<Product> products;
    List<Category> categories;

    public BelongsToDAO(){
        ProductDAO productDB = new ProductDAO();
        CategoryDAO categoryDB = new CategoryDAO();
        products = productDB.getAllProducts();
        categories = categoryDB.getAllCategories();
    }

    public List<BelongsTo> getAllBelongsTo(){
        List<BelongsTo> list = new ArrayList<>();
        list.add(new BelongsTo(1,products.get(0),categories.get(0)));
        list.add(new BelongsTo(2,products.get(1),categories.get(0)));
        list.add(new BelongsTo(3,products.get(2),categories.get(0)));
        list.add(new BelongsTo(4,products.get(3),categories.get(0)));
        list.add(new BelongsTo(5,products.get(4),categories.get(1)));
        list.add(new BelongsTo(6,products.get(5),categories.get(1)));
        list.add(new BelongsTo(7,products.get(6),categories.get(2)));
        return list;
    }

}
