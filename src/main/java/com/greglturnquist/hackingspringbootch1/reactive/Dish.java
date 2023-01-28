package com.greglturnquist.hackingspringbootch1.reactive;


import lombok.ToString;

@ToString
public class Dish {

    private final String description;

    private boolean delivered = false;


    public static Dish deliver(Dish dish){
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }
    public Dish(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDelivered() {
        return delivered;
    }


}
