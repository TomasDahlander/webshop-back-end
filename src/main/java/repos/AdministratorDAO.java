package repos;

import models.Administrator;
import models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 16:54 <br>
 * Project: webshop-back-end <br>
 */
public class AdministratorDAO {

    private List<User> users;

    public AdministratorDAO(){
        UserDAO userDB = new UserDAO();
        users = userDB.getAllUsers();
    }

    public List<Administrator> getAllAdministrators() {
        List<Administrator> list = new ArrayList<>();
        list.add(new Administrator(1, users.get(0)));
        return list;
    }
}
