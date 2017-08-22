package com.abezafar.foodservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/foods")
public class FoodService {

    @RequestMapping(method = RequestMethod.GET)
    public List<Food> getAll() {
        List<Food> foods = new ArrayList<Food>();
        
        Food food1 = new Food();
        food1.setName("Shrimp Ravioli");
        food1.setPrice(15);
        foods.add(food1);
        
        Food food2 = new Food();
        food2.setName("Marinera Risotto");
        food2.setPrice(22);
        foods.add(food2);
        
        return foods;
    }

}
