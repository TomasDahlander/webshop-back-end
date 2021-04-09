package repos;

import models.City;
import models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomas Dahlander <br>
 * Date: 2021-04-09 <br>
 * Time: 16:15 <br>
 * Project: webshop-back-end <br>
 */
public class CityDAO {

    public List<City> getAllCities() {
        List<City> list = new ArrayList<>();
        list.add(new City(1,11123,"Göteborg"));
        list.add(new City(2,14667,"Botkyrka"));
        list.add(new City(3,13987,"Botkyrka"));
        list.add(new City(4,55371,"Stockholm"));
        list.add(new City(5,14555,"Botkyrka"));
        list.add(new City(6,14555,"Botkyrka"));
        list.add(new City(7,14555,"Botkyrka"));
        return list;
    }
}
