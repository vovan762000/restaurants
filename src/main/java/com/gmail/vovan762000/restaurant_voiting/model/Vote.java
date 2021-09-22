package com.gmail.vovan762000.restaurant_voiting.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Vote extends AbstractBaseEntity {

    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDateTime dateTime;

    @Column(name = "user_id")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "vote")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id",nullable = false)
    private Restaurant restaurant;

}
