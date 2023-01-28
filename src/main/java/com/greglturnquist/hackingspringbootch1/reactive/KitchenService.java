package com.greglturnquist.hackingspringbootch1.reactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class KitchenService {

    Flux<Dish> getDishes(){
        return Flux.<Dish> generate(sink->sink.next(randomDish()))
                .delayElements(Duration.ofMillis(250));
    }

    private Dish randomDish(){
        return menu.get(picker.nextInt(menu.size()));
    }
    
    private List<Dish> menu = List.of(
            new Dish("떡볶이"),
            new Dish("치킨"),
            new Dish("당면")
    );
    
    private Random picker = new Random();
}
