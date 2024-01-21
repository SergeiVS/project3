package task4;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<Integer, Dish> menu = new HashMap<>();

    public Map<Integer, Dish> getMenu() {
        return menu;
    }
    public void addDishToMenu(Dish dish){
        if(!isDishInMenu(dish)){
           menu.remove(dish.getDishId(), dish);
        }else System.out.println("dish with id " + dish.getDishId() + " already contains in menu");
    }

    private boolean isDishInMenu(Dish dish) {
        return menu.containsKey(dish.getDishId());
    }

    public void changeDishPrice(Dish dish, Double newPrice){
        if(isDishInMenu(dish)){
            menu.get(dish.getDishId()).setPrice(newPrice);
            System.out.println("check new dish entry " + menu.get(dish.getDishId()));
        }else System.out.println("dish with id " + dish.getDishId() + " is not contains in menu");
    }

}
