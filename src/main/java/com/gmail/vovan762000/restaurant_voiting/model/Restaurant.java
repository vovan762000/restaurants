package com.gmail.vovan762000.restaurant_voiting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Restaurant extends AbstractNamedEntity {

    @OneToMany(fetch = FetchType.LAZY)
    private List<Vote> voies;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Dish> dishes;

}
