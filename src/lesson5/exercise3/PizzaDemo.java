package lesson5.exercise3;

public class PizzaDemo {

   public static void main(String[] args) {

Pizza pizzaCalories = new Pizza();

      double pizzaCalories24 = pizzaCalories.pizzaCalories(24, 40);
      double pizzaCalories28 = pizzaCalories.pizzaCalories(28, 40);

      System.out.println("In the pizza with diameter 28 cm " + (pizzaCalories28 - pizzaCalories24) +" more calories than in pizza with 24 cm diameter.");



   }

}
