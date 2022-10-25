package org.penevl.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FoodManager {

    List<Food> allFoods = new ArrayList<>();

    public void init(){

        allFoods.add(new Food("carrot",new String[] {"vegetable","orange","healthy"}));
        allFoods.add(new Food("potato",new String[] {"vegetable","brown","healthy"}));
        allFoods.add(new Food("milk",new String[] {"liquid","white","healthy"}));
        allFoods.add(new Food("beef",new String[] {"meat","red","brown","un-healthy"}));
        allFoods.add(new Food("eggs",new String[] {"liquid","orange","white","healthy"}));
        allFoods.add(new Food("fish",new String[] {"meat","gray","healthy"}));
        allFoods.add(new Food("broccoli",new String[] {"vegetable","green","healthy"}));
        allFoods.add(new Food("cucumber",new String[] {"vegetable","green","healthy"}));
        allFoods.add(new Food("chips",new String[] {"idk","brown","un-healthy"}));

    }

    public void addFood(Food food){
        allFoods.add(food);
    }

    public List<Food> findFood(String tag){

        List<Food> toReturn = new ArrayList<>();

        for (Food food : allFoods) {
            if (food.getName().toUpperCase(Locale.ROOT).contains(tag.toUpperCase(Locale.ROOT)) || Arrays.toString(food.getTags()).toUpperCase(Locale.ROOT).contains(tag.toUpperCase(Locale.ROOT))) {

                toReturn.add(food);
            }

        }

        return toReturn;

    }

}
