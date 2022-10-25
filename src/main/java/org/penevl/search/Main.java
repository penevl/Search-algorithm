package org.penevl.search;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FoodManager foodManager = new FoodManager();
        foodManager.init();
        boolean shouldRun = true;

        do{

            String input = sc.nextLine();

            if(input.equalsIgnoreCase("exit")){
                shouldRun = false;
            }

            List<Food> match = foodManager.findFood(input);

            for (int i = 0;i < match.size();i++)
                System.out.println((i + 1) +". " + match.get(i).getName());

        }while(shouldRun);

    }

}
