package repos;

import models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 15:55 <br>
 * Project: webshop-back-end <br>
 */
public class UserDAO {

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Hakim@livs.com","123"));
        list.add(new User(2, "hans.erik@gmail.com","123"));
        list.add(new User(3, "Inga.Månsson@outlook.com","123"));
        list.add(new User(4, "Ellen.Berggren@outlook.com","123"));
        list.add(new User(5, "Ebba.Berggren@outlook.com","123"));
        list.add(new User(6, "Lovisa.Nyberg@outlook.com","123"));
        list.add(new User(7, "Matilda.Johnsson@outlook.com","123"));
        return list;
    }
}