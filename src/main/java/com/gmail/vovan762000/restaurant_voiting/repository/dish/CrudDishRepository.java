package com.gmail.vovan762000.restaurant_voiting.repository.dish;

import com.gmail.vovan762000.restaurant_voiting.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudDishRepository extends JpaRepository<Dish,Integer> {
}
