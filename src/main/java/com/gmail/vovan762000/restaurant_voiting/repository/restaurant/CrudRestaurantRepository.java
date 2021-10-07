package com.gmail.vovan762000.restaurant_voiting.repository.restaurant;

import com.gmail.vovan762000.restaurant_voiting.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRestaurantRepository extends JpaRepository<Restaurant,Integer> {
}
