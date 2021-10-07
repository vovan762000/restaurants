package com.gmail.vovan762000.restaurant_voiting;

import com.gmail.vovan762000.restaurant_voiting.model.Restaurant;

import static com.gmail.vovan762000.restaurant_voiting.model.AbstractBaseEntity.START_SEQ;

public class RestaurantTestData {

public static final int STARGOROD_ID = START_SEQ + 2;
public static final int FAVORITE_PLACE_ID = START_SEQ + 3;
public static final int ARGENTINA_GRILL_ID = START_SEQ + 4;

public static final Restaurant STARGOROD = new Restaurant(STARGOROD_ID,"Stargorod");
public static final Restaurant FAVORITE_PLACE = new Restaurant(FAVORITE_PLACE_ID,"Favorite Place");
public static final Restaurant ARGENTINA_GRILL = new Restaurant(ARGENTINA_GRILL_ID,"Argentina Grill");

}
