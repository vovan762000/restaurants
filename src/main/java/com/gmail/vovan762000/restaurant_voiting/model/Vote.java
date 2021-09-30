package com.gmail.vovan762000.restaurant_voiting.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "vote")
public class Vote extends AbstractBaseEntity {

    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDateTime dateTime;

    @JoinColumn(name = "user_id")
    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id",nullable = false)
    private Restaurant restaurant;

}
