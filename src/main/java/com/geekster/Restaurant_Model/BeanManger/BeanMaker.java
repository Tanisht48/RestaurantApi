package com.geekster.Restaurant_Model.BeanManger;

import com.geekster.Restaurant_Model.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<Restaurant> restaurantList()
    {
        return  new ArrayList<>();
    }
}
