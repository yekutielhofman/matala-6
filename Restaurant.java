package com.company;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    String resName;
    HashMap<Ingredient,Double> ingredients;

    public Restaurant(String resName) {
        this.resName = resName;
        this.ingredients = new HashMap<>();
    }
    //method 1
    void addIngredient(Ingredient i, Double amount){
        ingredients.put(i,amount);
    }
    //method 2
    double totalCost(){
        double sum = 0;
        for (Map.Entry<Ingredient, Double> i : ingredients.entrySet()){
            sum +=i.getKey().getIngPrice() * i.getValue();
        }
        return sum;
    }
    //method 3
//    boolean isAvailable(Dish dish){
//        for (Map.Entry<String, Double> i : dish.getIngredients().entrySet()){
//            Ingredient temp = new Ingredient(null,)
//            if(ingredients.containsKey(temp));
//        }
//
//    }

}
