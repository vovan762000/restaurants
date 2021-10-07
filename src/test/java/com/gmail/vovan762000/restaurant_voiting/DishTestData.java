package com.gmail.vovan762000.restaurant_voiting;

import com.gmail.vovan762000.restaurant_voiting.model.Dish;

import java.math.BigDecimal;

import static com.gmail.vovan762000.restaurant_voiting.RestaurantTestData.STARGOROD;
import static com.gmail.vovan762000.restaurant_voiting.RestaurantTestData.ARGENTINA_GRILL;
import static com.gmail.vovan762000.restaurant_voiting.RestaurantTestData.FAVORITE_PLACE;
import static com.gmail.vovan762000.restaurant_voiting.model.AbstractBaseEntity.START_SEQ;

public class DishTestData {
    public static final int DISH_1_ID = START_SEQ + 5;
    public static final int DISH_2_ID = START_SEQ + 6;
    public static final int DISH_3_ID = START_SEQ + 7;
    public static final int DISH_4_ID = START_SEQ + 8;
    public static final int DISH_5_ID = START_SEQ + 9;
    public static final int DISH_6_ID = START_SEQ + 10;
    public static final int DISH_7_ID = START_SEQ + 11;
    public static final int DISH_8_ID = START_SEQ + 12;
    public static final int DISH_9_ID = START_SEQ + 13;
    public static final int DISH_10_ID = START_SEQ + 14;
    public static final int DISH_11_ID = START_SEQ + 15;
    public static final int DISH_12_ID = START_SEQ + 16;

    public static final Dish DISH_1 = new Dish(DISH_1_ID,"dish 1",new BigDecimal(10.99));
    public static final Dish DISH_2 = new Dish(DISH_2_ID,"dish 2",new BigDecimal(5.99));
    public static final Dish DISH_3 = new Dish(DISH_3_ID,"dish 3",new BigDecimal(6.00));
    public static final Dish DISH_4 = new Dish(DISH_4_ID,"dish 4",new BigDecimal(10));
    public static final Dish DISH_5 = new Dish(DISH_5_ID,"dish 5",new BigDecimal(19.99));
    public static final Dish DISH_6 = new Dish(DISH_6_ID,"dish 6",new BigDecimal(3.99));
    public static final Dish DISH_7 = new Dish(DISH_7_ID,"dish 7",new BigDecimal(17));
    public static final Dish DISH_8 = new Dish(DISH_8_ID,"dish 8",new BigDecimal(3));
    public static final Dish DISH_9 = new Dish(DISH_9_ID,"dish 9",new BigDecimal(7));
    public static final Dish DISH_10 = new Dish(DISH_10_ID,"dish 10",new BigDecimal(5.5));
    public static final Dish DISH_11 = new Dish(DISH_11_ID,"dish 11",new BigDecimal(4));
    public static final Dish DISH_12 = new Dish(DISH_12_ID,"dish 12",new BigDecimal(26));

    static {
        DISH_1.setRestaurant(STARGOROD);
        DISH_2.setRestaurant(STARGOROD);
        DISH_3.setRestaurant(STARGOROD);
        DISH_4.setRestaurant(STARGOROD);
        DISH_5.setRestaurant(FAVORITE_PLACE);
        DISH_6.setRestaurant(FAVORITE_PLACE);
        DISH_7.setRestaurant(FAVORITE_PLACE);
        DISH_8.setRestaurant(FAVORITE_PLACE);
        DISH_9.setRestaurant(ARGENTINA_GRILL);
        DISH_10.setRestaurant(ARGENTINA_GRILL);
        DISH_11.setRestaurant(ARGENTINA_GRILL);
        DISH_12.setRestaurant(ARGENTINA_GRILL);
    }


}
