package homeworkLesson5.exercise3;

public class PizzaDemo {

   public static void main(String[] args) {

Pizza pizza1 = new Pizza(24);

Pizza pizza2 = new Pizza(28);

Pizza caloriesContent = new Pizza(40);

double pizzaArea1 = Math.pow(pizza1.pizzaDiameter / 2, 2) * Math.PI;

      double pizzaArea2 = Math.pow(pizza2.pizzaDiameter / 2, 2) * Math.PI;

  double caloriesDiversity = pizzaArea2 - pizzaArea1;

      System.out.println("The pizza 2 contains " + caloriesDiversity + " calories more than pizza1");












   }




}
