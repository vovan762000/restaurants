package com.gmail.vovan762000.restaurant_voiting.repository.restaurant;

import com.gmail.vovan762000.restaurant_voiting.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaRestaurantRepository implements RestaurantRepository{

    private final CrudRestaurantRepository repository;

    public DataJpaRestaurantRepository(CrudRestaurantRepository repository) {
        this.repository = repository;
    }

    @Override
    public Restaurant get(Integer id) {
        return null;
    }

    @Override
    public Restaurant save(Restaurant vote) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Restaurant> getAll() {
        return null;
    }
}
