package com.FoodBytes.AppStart.Service;

import com.FoodBytes.AppStart.Domain.Restaurant;
import com.FoodBytes.AppStart.Repository.RestaurantsRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImplementation implements RestaurantServiceInterface {

    @Autowired
    private RestaurantsRepoInterface p;

    @Override
    public Restaurant saveR(Restaurant r) {
        return p.save(r);
    }

    @Override
    public List<Restaurant> getAll() {
        return p.findAll();
    }

    @Override
    public Restaurant updateR(Restaurant r) {
        /*
        int t=r.getRestaurantID();
        p.findById(t);

         */
        return p.save(r);

    }

    @Override
    public void deleteR(Restaurant r) {
        p.delete(r);
    }


}


