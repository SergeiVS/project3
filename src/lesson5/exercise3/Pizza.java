package lesson5.exercise3;

public class Pizza {

    public double pizzaCalories(double pizzaDiameter, double caloriesPerSqrSm) {
       double squerePizza = Math.pow(pizzaDiameter / 2 , 2) * Math.PI;
       double totalCalories = squerePizza * caloriesPerSqrSm;
        return totalCalories;
    }



}