package com.gmail.vovan762000.restaurant_voiting;

import com.gmail.vovan762000.restaurant_voiting.model.User;
import com.gmail.vovan762000.restaurant_voiting.model.Vote;

import java.time.LocalDateTime;

import static com.gmail.vovan762000.restaurant_voiting.RestaurantTestData.FAVORITE_PLACE;
import static com.gmail.vovan762000.restaurant_voiting.UserTestData.admin;
import static com.gmail.vovan762000.restaurant_voiting.model.AbstractBaseEntity.START_SEQ;
import static com.gmail.vovan762000.restaurant_voiting.UserTestData.user;
import static com.gmail.vovan762000.restaurant_voiting.RestaurantTestData.ARGENTINA_GRILL;

public class VoteTestData {
    public static final MatcherFactory<Vote> MATCHER = MatcherFactory.usingIgnoringFieldsComparator("restaurant", "user");

    public static final int USER_VOTE_ID = START_SEQ + 17;
    public static final int ADMIN_VOTE_ID = START_SEQ + 18;

    public static final Vote USER_VOTE =
            new Vote(USER_VOTE_ID,LocalDateTime.of(2021,9,26,10,00,00));
    public static final Vote ADMIN_VOTE =
            new Vote(ADMIN_VOTE_ID,LocalDateTime.of(2021,9,26,14,00,00));

    static {
        USER_VOTE.setUser(user);
        USER_VOTE.setRestaurant(ARGENTINA_GRILL);
        ADMIN_VOTE.setUser(admin);
        ADMIN_VOTE.setRestaurant(FAVORITE_PLACE);
    }
}
