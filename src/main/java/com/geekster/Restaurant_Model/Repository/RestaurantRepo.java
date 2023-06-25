package com.geekster.Restaurant_Model.Repository;

import com.geekster.Restaurant_Model.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurants(){

        return restaurantList;

    }

    public void addRestaurant(Restaurant r)
    {
        List<Restaurant> listOfRestaurant = getRestaurants();

        listOfRestaurant.add(r);
    }


}
