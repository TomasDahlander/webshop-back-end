package repos;

import models.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:56 <br>
 * Project: webshop-back-end <br>
 */
public class CategoryDAO {

    public List<Category> getAllCategories(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1,"Skafferi"));
        list.add(new Category(2,"Snacks-godis"));
        list.add(new Category(3,"Hem-städ"));
        return list;
    }

}

