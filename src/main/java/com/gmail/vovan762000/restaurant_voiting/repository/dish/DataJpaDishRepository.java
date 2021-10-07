package com.gmail.vovan762000.restaurant_voiting.repository.dish;

import com.gmail.vovan762000.restaurant_voiting.model.Dish;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaDishRepository implements DishRepository{

    private final CrudDishRepository repository;

    public DataJpaDishRepository(CrudDishRepository repository) {
        this.repository = repository;
    }

    @Override
    public Dish get(Integer id) {
        return null;
    }

    @Override
    public Dish save(Dish vote) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Dish> getAll() {
        return null;
    }
}
