package com.FoodBytes.AppStart.Service;

import com.FoodBytes.AppStart.Domain.Restaurant;

import java.util.List;

public interface RestaurantServiceInterface {
    public Restaurant saveR(Restaurant r);

    public List<Restaurant> getAll();

    public Restaurant updateR(Restaurant r);

    public void deleteR(Restaurant r);
}
